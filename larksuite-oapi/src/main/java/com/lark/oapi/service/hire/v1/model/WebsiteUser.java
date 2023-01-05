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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class WebsiteUser {
    /**
     * 用户 ID
     * <p> 示例值：6960663240925956620
     */
    @SerializedName("id")
    private String id;
    /**
     * 姓名
     * <p> 示例值：dan27
     */
    @SerializedName("name")
    private String name;
    /**
     * 邮箱
     * <p> 示例值：dan27@163.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 外部用户 ID
     * <p> 示例值：6960663240925956621
     */
    @SerializedName("external_id")
    private String externalId;
    /**
     * 电话，请和区号对应的国家码一并提供
     * <p> 示例值：182900291190
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 国家码，请和电话一并提供，可从「获取地址码」查询
     * <p> 示例值：CN_1
     */
    @SerializedName("mobile_country_code")
    private String mobileCountryCode;

    // builder 开始
    public WebsiteUser() {
    }

    public WebsiteUser(Builder builder) {
        /**
         * 用户 ID
         * <p> 示例值：6960663240925956620
         */
        this.id = builder.id;
        /**
         * 姓名
         * <p> 示例值：dan27
         */
        this.name = builder.name;
        /**
         * 邮箱
         * <p> 示例值：dan27@163.com
         */
        this.email = builder.email;
        /**
         * 外部用户 ID
         * <p> 示例值：6960663240925956621
         */
        this.externalId = builder.externalId;
        /**
         * 电话，请和区号对应的国家码一并提供
         * <p> 示例值：182900291190
         */
        this.mobile = builder.mobile;
        /**
         * 国家码，请和电话一并提供，可从「获取地址码」查询
         * <p> 示例值：CN_1
         */
        this.mobileCountryCode = builder.mobileCountryCode;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public static class Builder {
        /**
         * 用户 ID
         * <p> 示例值：6960663240925956620
         */
        private String id;
        /**
         * 姓名
         * <p> 示例值：dan27
         */
        private String name;
        /**
         * 邮箱
         * <p> 示例值：dan27@163.com
         */
        private String email;
        /**
         * 外部用户 ID
         * <p> 示例值：6960663240925956621
         */
        private String externalId;
        /**
         * 电话，请和区号对应的国家码一并提供
         * <p> 示例值：182900291190
         */
        private String mobile;
        /**
         * 国家码，请和电话一并提供，可从「获取地址码」查询
         * <p> 示例值：CN_1
         */
        private String mobileCountryCode;

        /**
         * 用户 ID
         * <p> 示例值：6960663240925956620
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 姓名
         * <p> 示例值：dan27
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：dan27@163.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 外部用户 ID
         * <p> 示例值：6960663240925956621
         *
         * @param externalId
         * @return
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }


        /**
         * 电话，请和区号对应的国家码一并提供
         * <p> 示例值：182900291190
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 国家码，请和电话一并提供，可从「获取地址码」查询
         * <p> 示例值：CN_1
         *
         * @param mobileCountryCode
         * @return
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }


        public WebsiteUser build() {
            return new WebsiteUser(this);
        }
    }
}
