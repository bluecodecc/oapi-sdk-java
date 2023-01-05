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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CreateUserMailboxAliasReq {
    /**
     * 用户邮箱地址
     * <p> 示例值：user@xxx.xx
     */
    @Path
    @SerializedName("user_mailbox_id")
    private String userMailboxId;
    @Body
    private EmailAlias body;

    // builder 开始
    public CreateUserMailboxAliasReq() {
    }

    public CreateUserMailboxAliasReq(Builder builder) {
        /**
         * 用户邮箱地址
         * <p> 示例值：user@xxx.xx
         */
        this.userMailboxId = builder.userMailboxId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserMailboxId() {
        return this.userMailboxId;
    }

    public void setUserMailboxId(String userMailboxId) {
        this.userMailboxId = userMailboxId;
    }

    public EmailAlias getEmailAlias() {
        return this.body;
    }

    public void setEmailAlias(EmailAlias body) {
        this.body = body;
    }

    public static class Builder {

        private String userMailboxId; // 用户邮箱地址
        private EmailAlias body;

        /**
         * 用户邮箱地址
         * <p> 示例值：user@xxx.xx
         *
         * @param userMailboxId
         * @return
         */
        public Builder userMailboxId(String userMailboxId) {
            this.userMailboxId = userMailboxId;
            return this;
        }

        public EmailAlias getEmailAlias() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder emailAlias(EmailAlias body) {
            this.body = body;
            return this;
        }

        public CreateUserMailboxAliasReq build() {
            return new CreateUserMailboxAliasReq(this);
        }
    }
}
