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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class BatchCreatePermissionMemberReq {
    /**
     * 文件的类型
     * <p> 示例值：doc
     */
    @Query
    @SerializedName("type")
    private String type;
    /**
     * 添加权限后是否通知对方
     * <p> 示例值：false
     */
    @Query
    @SerializedName("need_notification")
    private Boolean needNotification;
    /**
     * 文件的 token
     * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
     */
    @Path
    @SerializedName("token")
    private String token;
    @Body
    private BatchCreatePermissionMemberReqBody body;

    // builder 开始
    public BatchCreatePermissionMemberReq() {
    }

    public BatchCreatePermissionMemberReq(Builder builder) {
        /**
         * 文件的类型
         * <p> 示例值：doc
         */
        this.type = builder.type;
        /**
         * 添加权限后是否通知对方
         * <p> 示例值：false
         */
        this.needNotification = builder.needNotification;
        /**
         * 文件的 token
         * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
         */
        this.token = builder.token;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getNeedNotification() {
        return this.needNotification;
    }

    public void setNeedNotification(Boolean needNotification) {
        this.needNotification = needNotification;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BatchCreatePermissionMemberReqBody getBatchCreatePermissionMemberReqBody() {
        return this.body;
    }

    public void setBatchCreatePermissionMemberReqBody(BatchCreatePermissionMemberReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String type; // 文件的类型
        private Boolean needNotification; // 添加权限后是否通知对方
        private String token; // 文件的 token
        private BatchCreatePermissionMemberReqBody body;

        /**
         * 文件的类型
         * <p> 示例值：doc
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 文件的类型
         * <p> 示例值：doc
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.BatchCreatePermissionMemberTokenTypeV2Enum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.BatchCreatePermissionMemberTokenTypeV2Enum type) {
            this.type = type.getValue();
            return this;
        }

        /**
         * 添加权限后是否通知对方
         * <p> 示例值：false
         *
         * @param needNotification
         * @return
         */
        public Builder needNotification(Boolean needNotification) {
            this.needNotification = needNotification;
            return this;
        }

        /**
         * 文件的 token
         * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public BatchCreatePermissionMemberReqBody getBatchCreatePermissionMemberReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder batchCreatePermissionMemberReqBody(BatchCreatePermissionMemberReqBody body) {
            this.body = body;
            return this;
        }

        public BatchCreatePermissionMemberReq build() {
            return new BatchCreatePermissionMemberReq(this);
        }
    }
}
