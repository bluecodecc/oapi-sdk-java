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

public class PatchMailgroupReq {
    /**
     * 邮件组ID或者邮件组地址
     * <p> 示例值：xxxxxxxxxxxxxxx 或 test_mail_group@xxx.xx
     */
    @Path
    @SerializedName("mailgroup_id")
    private String mailgroupId;
    @Body
    private Mailgroup body;

    // builder 开始
    public PatchMailgroupReq() {
    }

    public PatchMailgroupReq(Builder builder) {
        /**
         * 邮件组ID或者邮件组地址
         * <p> 示例值：xxxxxxxxxxxxxxx 或 test_mail_group@xxx.xx
         */
        this.mailgroupId = builder.mailgroupId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMailgroupId() {
        return this.mailgroupId;
    }

    public void setMailgroupId(String mailgroupId) {
        this.mailgroupId = mailgroupId;
    }

    public Mailgroup getMailgroup() {
        return this.body;
    }

    public void setMailgroup(Mailgroup body) {
        this.body = body;
    }

    public static class Builder {

        private String mailgroupId; // 邮件组ID或者邮件组地址
        private Mailgroup body;

        /**
         * 邮件组ID或者邮件组地址
         * <p> 示例值：xxxxxxxxxxxxxxx 或 test_mail_group@xxx.xx
         *
         * @param mailgroupId
         * @return
         */
        public Builder mailgroupId(String mailgroupId) {
            this.mailgroupId = mailgroupId;
            return this;
        }

        public Mailgroup getMailgroup() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder mailgroup(Mailgroup body) {
            this.body = body;
            return this;
        }

        public PatchMailgroupReq build() {
            return new PatchMailgroupReq(this);
        }
    }
}
