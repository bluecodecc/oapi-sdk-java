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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class AclScopeEvent {
    /**
     * 权限类型，当type为User时，值为open_id/user_id/union_id
     * <p> 示例值：user
     */
    @SerializedName("type")
    private String type;
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;

    // builder 开始
    public AclScopeEvent() {
    }

    public AclScopeEvent(Builder builder) {
        /**
         * 权限类型，当type为User时，值为open_id/user_id/union_id
         * <p> 示例值：user
         */
        this.type = builder.type;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        this.userId = builder.userId;
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

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 权限类型，当type为User时，值为open_id/user_id/union_id
         * <p> 示例值：user
         */
        private String type;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        private UserId userId;

        /**
         * 权限类型，当type为User时，值为open_id/user_id/union_id
         * <p> 示例值：user
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 权限类型，当type为User时，值为open_id/user_id/union_id
         * <p> 示例值：user
         *
         * @param type {@link com.lark.oapi.service.calendar.v4.enums.AclScopeEventAclScopeTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.calendar.v4.enums.AclScopeEventAclScopeTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(UserId userId) {
            this.userId = userId;
            return this;
        }


        public AclScopeEvent build() {
            return new AclScopeEvent(this);
        }
    }
}
