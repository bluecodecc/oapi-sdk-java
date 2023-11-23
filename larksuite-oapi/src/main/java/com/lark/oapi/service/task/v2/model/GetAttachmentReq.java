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

package com.lark.oapi.service.task.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetAttachmentReq {
    /**
     * 表示user的ID的类型，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 要获取附件详情的guid
     * <p> 示例值：b59aa7a3-e98c-4830-8273-cbb29f89b837
     */
    @Path
    @SerializedName("attachment_guid")
    private String attachmentGuid;

    // builder 开始
    public GetAttachmentReq() {
    }

    public GetAttachmentReq(Builder builder) {
        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 要获取附件详情的guid
         * <p> 示例值：b59aa7a3-e98c-4830-8273-cbb29f89b837
         */
        this.attachmentGuid = builder.attachmentGuid;
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

    public String getAttachmentGuid() {
        return this.attachmentGuid;
    }

    public void setAttachmentGuid(String attachmentGuid) {
        this.attachmentGuid = attachmentGuid;
    }

    public static class Builder {
        private String userIdType; // 表示user的ID的类型，支持open_id, user_id, union_id
        private String attachmentGuid; // 要获取附件详情的guid

        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
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
         * 要获取附件详情的guid
         * <p> 示例值：b59aa7a3-e98c-4830-8273-cbb29f89b837
         *
         * @param attachmentGuid
         * @return
         */
        public Builder attachmentGuid(String attachmentGuid) {
            this.attachmentGuid = attachmentGuid;
            return this;
        }

        public GetAttachmentReq build() {
            return new GetAttachmentReq(this);
        }
    }
}
