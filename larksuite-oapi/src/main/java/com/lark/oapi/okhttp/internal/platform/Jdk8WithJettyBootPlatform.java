/*
 *
 *  * Copyright (C) 2015 Square, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.lark.oapi.okhttp.internal.platform;

import com.lark.oapi.okhttp.Protocol;
import com.lark.oapi.okhttp.internal.Util;

import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * OpenJDK 8 with {@code org.mortbay.jetty.alpn:alpn-boot} in the boot class path.
 */
class Jdk8WithJettyBootPlatform extends Platform {

    private final Method putMethod;
    private final Method getMethod;
    private final Method removeMethod;
    private final Class<?> clientProviderClass;
    private final Class<?> serverProviderClass;

    Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod,
                              Class<?> clientProviderClass, Class<?> serverProviderClass) {
        this.putMethod = putMethod;
        this.getMethod = getMethod;
        this.removeMethod = removeMethod;
        this.clientProviderClass = clientProviderClass;
        this.serverProviderClass = serverProviderClass;
    }

    public static Platform buildIfSupported() {
        // Find Jetty's ALPN extension for OpenJDK.
        try {
            String alpnClassName = "org.eclipse.jetty.alpn.ALPN";
            Class<?> alpnClass = Class.forName(alpnClassName, true, null);
            Class<?> providerClass = Class.forName(alpnClassName + "$Provider", true, null);
            Class<?> clientProviderClass = Class.forName(alpnClassName + "$ClientProvider", true, null);
            Class<?> serverProviderClass = Class.forName(alpnClassName + "$ServerProvider", true, null);
            Method putMethod = alpnClass.getMethod("put", SSLSocket.class, providerClass);
            Method getMethod = alpnClass.getMethod("get", SSLSocket.class);
            Method removeMethod = alpnClass.getMethod("remove", SSLSocket.class);
            return new Jdk8WithJettyBootPlatform(
                    putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException ignored) {
        }

        return null;
    }

    @Override
    public void configureTlsExtensions(
            SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
        List<String> names = alpnProtocolNames(protocols);

        try {
            Object alpnProvider = Proxy.newProxyInstance(Platform.class.getClassLoader(),
                    new Class[]{clientProviderClass, serverProviderClass}, new AlpnProvider(names));
            putMethod.invoke(null, sslSocket, alpnProvider);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    @Override
    public void afterHandshake(SSLSocket sslSocket) {
        try {
            removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    @Override
    public @Nullable
    String getSelectedProtocol(SSLSocket socket) {
        try {
            AlpnProvider provider =
                    (AlpnProvider) Proxy.getInvocationHandler(getMethod.invoke(null, socket));
            if (!provider.unsupported && provider.selected == null) {
                get().log(INFO, "ALPN callback dropped: HTTP/2 is disabled. "
                        + "Is alpn-boot on the boot class path?", null);
                return null;
            }
            return provider.unsupported ? null : provider.selected;
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    /**
     * Handle the methods of ALPN's ClientProvider and ServerProvider without a compile-time
     * dependency on those interfaces.
     */
    private static class AlpnProvider implements InvocationHandler {

        /**
         * This peer's supported protocols.
         */
        private final List<String> protocols;
        /**
         * Set when remote peer notifies ALPN is unsupported.
         */
        boolean unsupported;
        /**
         * The protocol the server selected.
         */
        String selected;

        AlpnProvider(List<String> protocols) {
            this.protocols = protocols;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String methodName = method.getName();
            Class<?> returnType = method.getReturnType();
            if (args == null) {
                args = Util.EMPTY_STRING_ARRAY;
            }
            if (methodName.equals("supports") && boolean.class == returnType) {
                return true; // ALPN is supported.
            } else if (methodName.equals("unsupported") && void.class == returnType) {
                this.unsupported = true; // Peer doesn't support ALPN.
                return null;
            } else if (methodName.equals("protocols") && args.length == 0) {
                return protocols; // Client advertises these protocols.
            } else if ((methodName.equals("selectProtocol") || methodName.equals("select"))
                    && String.class == returnType && args.length == 1 && args[0] instanceof List) {
                List<?> peerProtocols = (List) args[0];
                // Pick the first known protocol the peer advertises.
                for (int i = 0, size = peerProtocols.size(); i < size; i++) {
                    String protocol = (String) peerProtocols.get(i);
                    if (protocols.contains(protocol)) {
                        return selected = protocol;
                    }
                }
                return selected = protocols.get(0); // On no intersection, try peer's first protocol.
            } else if ((methodName.equals("protocolSelected") || methodName.equals("selected"))
                    && args.length == 1) {
                this.selected = (String) args[0]; // Server selected this protocol.
                return null;
            } else {
                return method.invoke(this, args);
            }
        }
    }
}
