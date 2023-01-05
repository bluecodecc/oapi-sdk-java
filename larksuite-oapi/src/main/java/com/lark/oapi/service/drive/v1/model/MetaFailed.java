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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class MetaFailed {
    /**
     * 获取元数据失败的文档token
     * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
     */
    @SerializedName("token")
    private String token;
    /**
     * 获取元数据失败的错误码
     * <p> 示例值：970005
     */
    @SerializedName("code")
    private Integer code;

    // builder 开始
    public MetaFailed() {
    }

    public MetaFailed(Builder builder) {
        /**
         * 获取元数据失败的文档token
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         */
        this.token = builder.token;
        /**
         * 获取元数据失败的错误码
         * <p> 示例值：970005
         */
        this.code = builder.code;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static class Builder {
        /**
         * 获取元数据失败的文档token
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         */
        private String token;
        /**
         * 获取元数据失败的错误码
         * <p> 示例值：970005
         */
        private Integer code;

        /**
         * 获取元数据失败的文档token
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 获取元数据失败的错误码
         * <p> 示例值：970005
         *
         * @param code
         * @return
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 获取元数据失败的错误码
         * <p> 示例值：970005
         *
         * @param code {@link com.lark.oapi.service.drive.v1.enums.MetaFailedCodeEnum}
         * @return
         */
        public Builder code(com.lark.oapi.service.drive.v1.enums.MetaFailedCodeEnum code) {
            this.code = code.getValue();
            return this;
        }


        public MetaFailed build() {
            return new MetaFailed(this);
        }
    }
}
