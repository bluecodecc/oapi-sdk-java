// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.im.v1.resource;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.im.v1.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class Pin {
    private static final Logger log = LoggerFactory.getLogger(Pin.class);
    private final Config config;

    public Pin(Config config) {
        this.config = config;
    }


    /**
     * Pin消息，Pin一条指定的消息。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- Pin消息时，机器人必须在对应的群组中;- 若消息已经被Pin，返回该Pin的操作信息;- 不能Pin一条对操作者不可见的消息;- 对同一条消息的Pin操作不能超过==5 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreatePinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreatePinSample.java</a> ;
     */
    public CreatePinResp create(CreatePinReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/pins"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreatePinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreatePinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * Pin消息，Pin一条指定的消息。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- Pin消息时，机器人必须在对应的群组中;- 若消息已经被Pin，返回该Pin的操作信息;- 不能Pin一条对操作者不可见的消息;- 对同一条消息的Pin操作不能超过==5 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreatePinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreatePinSample.java</a> ;
     */
    public CreatePinResp create(CreatePinReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/pins"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreatePinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreatePinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 移除Pin消息，移除一条指定消息的Pin。
     * <p> 注意事项：;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 移除Pin消息时，机器人必须在对应的群组中;- 若消息未被Pin或已被撤回，返回成功信息;- 不能移除一条对操作者不可见的Pin消息;- 对同一条消息移除Pin的操作不能超过==5 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeletePinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeletePinSample.java</a> ;
     */
    public DeletePinResp delete(DeletePinReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/pins/:message_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeletePinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeletePinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins/:message_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 移除Pin消息，移除一条指定消息的Pin。
     * <p> 注意事项：;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 移除Pin消息时，机器人必须在对应的群组中;- 若消息未被Pin或已被撤回，返回成功信息;- 不能移除一条对操作者不可见的Pin消息;- 对同一条消息移除Pin的操作不能超过==5 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeletePinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeletePinSample.java</a> ;
     */
    public DeletePinResp delete(DeletePinReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/pins/:message_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeletePinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeletePinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins/:message_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取群内Pin消息，获取所在群内指定时间范围内的所有Pin消息。
     * <p> 注意事项：;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 获取Pin消息时，机器人必须在群组中;- 获取的Pin消息按Pin的创建时间降序排列;- 接口默认限流为==50 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListPinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListPinSample.java</a> ;
     */
    public ListPinResp list(ListPinReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/pins"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListPinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListPinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取群内Pin消息，获取所在群内指定时间范围内的所有Pin消息。
     * <p> 注意事项：;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 获取Pin消息时，机器人必须在群组中;- 获取的Pin消息按Pin的创建时间降序排列;- 接口默认限流为==50 QPS== ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/pin/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListPinSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListPinSample.java</a> ;
     */
    public ListPinResp list(ListPinReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/pins"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListPinResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListPinResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/pins"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
