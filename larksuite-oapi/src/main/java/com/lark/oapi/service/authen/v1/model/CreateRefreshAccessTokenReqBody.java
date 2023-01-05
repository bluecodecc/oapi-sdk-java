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

package com.lark.oapi.service.authen.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateRefreshAccessTokenReqBody {
    /**
     * 授权类型，**固定值**：
     * <p> 示例值：refresh_token
     */
    @SerializedName("grant_type")
    private String grantType;
    /**
     * 刷新 `user_access_token` 需要的凭证<br>获取user_access_token`接口和本接口均返回 `refresh_token`，**每次请求，请注意使用最新获取到的`refresh_token`**
     * <p> 示例值：ur-oQ0mMq6MCcueAv0pwx2fQQhxqv__CbLu6G8ySFwafeKww2Def2BJdOkW3.9gCFM.LBQgFri901QaqeuL
     */
    @SerializedName("refresh_token")
    private String refreshToken;

    // builder 开始
    public CreateRefreshAccessTokenReqBody() {
    }

    public CreateRefreshAccessTokenReqBody(Builder builder) {
        /**
         * 授权类型，**固定值**：
         * <p> 示例值：refresh_token
         */
        this.grantType = builder.grantType;
        /**
         * 刷新 `user_access_token` 需要的凭证<br>获取user_access_token`接口和本接口均返回 `refresh_token`，**每次请求，请注意使用最新获取到的`refresh_token`**
         * <p> 示例值：ur-oQ0mMq6MCcueAv0pwx2fQQhxqv__CbLu6G8ySFwafeKww2Def2BJdOkW3.9gCFM.LBQgFri901QaqeuL
         */
        this.refreshToken = builder.refreshToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGrantType() {
        return this.grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public static class Builder {
        /**
         * 授权类型，**固定值**：
         * <p> 示例值：refresh_token
         */
        private String grantType;
        /**
         * 刷新 `user_access_token` 需要的凭证<br>获取user_access_token`接口和本接口均返回 `refresh_token`，**每次请求，请注意使用最新获取到的`refresh_token`**
         * <p> 示例值：ur-oQ0mMq6MCcueAv0pwx2fQQhxqv__CbLu6G8ySFwafeKww2Def2BJdOkW3.9gCFM.LBQgFri901QaqeuL
         */
        private String refreshToken;

        /**
         * 授权类型，**固定值**：
         * <p> 示例值：refresh_token
         *
         * @param grantType
         * @return
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }


        /**
         * 刷新 `user_access_token` 需要的凭证<br>获取user_access_token`接口和本接口均返回 `refresh_token`，**每次请求，请注意使用最新获取到的`refresh_token`**
         * <p> 示例值：ur-oQ0mMq6MCcueAv0pwx2fQQhxqv__CbLu6G8ySFwafeKww2Def2BJdOkW3.9gCFM.LBQgFri901QaqeuL
         *
         * @param refreshToken
         * @return
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }


        public CreateRefreshAccessTokenReqBody build() {
            return new CreateRefreshAccessTokenReqBody(this);
        }
    }
}
