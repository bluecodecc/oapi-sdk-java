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

package com.lark.oapi.service.im.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CreateAppFeedCardReq {
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Body
    private CreateAppFeedCardReqBody body;

    // builder 开始
    public CreateAppFeedCardReq() {
    }

    public CreateAppFeedCardReq(Builder builder) {
        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public CreateAppFeedCardReqBody getCreateAppFeedCardReqBody() {
        return this.body;
    }

    public void setCreateAppFeedCardReqBody(CreateAppFeedCardReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 用户 ID 类型
        private CreateAppFeedCardReqBody body;

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.im.v2.enums.CreateAppFeedCardUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.im.v2.enums.CreateAppFeedCardUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public CreateAppFeedCardReqBody getCreateAppFeedCardReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder createAppFeedCardReqBody(CreateAppFeedCardReqBody body) {
            this.body = body;
            return this;
        }

        public CreateAppFeedCardReq build() {
            return new CreateAppFeedCardReq(this);
        }
    }
}