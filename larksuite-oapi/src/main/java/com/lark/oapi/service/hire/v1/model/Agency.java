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

public class Agency {
    /**
     * 猎头供应商ID
     * <p> 示例值：6898173495386147079
     */
    @SerializedName("id")
    private String id;
    /**
     * 猎头供应商名称
     * <p> 示例值：超越猎头公司
     */
    @SerializedName("name")
    private String name;
    /**
     * 供应商联系人ID
     * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
     */
    @SerializedName("contactor_id")
    private String contactorId;
    /**
     * 供应商联系人名称
     * <p> 示例值：
     */
    @SerializedName("contactor_name")
    private I18n contactorName;

    // builder 开始
    public Agency() {
    }

    public Agency(Builder builder) {
        /**
         * 猎头供应商ID
         * <p> 示例值：6898173495386147079
         */
        this.id = builder.id;
        /**
         * 猎头供应商名称
         * <p> 示例值：超越猎头公司
         */
        this.name = builder.name;
        /**
         * 供应商联系人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        this.contactorId = builder.contactorId;
        /**
         * 供应商联系人名称
         * <p> 示例值：
         */
        this.contactorName = builder.contactorName;
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

    public String getContactorId() {
        return this.contactorId;
    }

    public void setContactorId(String contactorId) {
        this.contactorId = contactorId;
    }

    public I18n getContactorName() {
        return this.contactorName;
    }

    public void setContactorName(I18n contactorName) {
        this.contactorName = contactorName;
    }

    public static class Builder {
        /**
         * 猎头供应商ID
         * <p> 示例值：6898173495386147079
         */
        private String id;
        /**
         * 猎头供应商名称
         * <p> 示例值：超越猎头公司
         */
        private String name;
        /**
         * 供应商联系人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        private String contactorId;
        /**
         * 供应商联系人名称
         * <p> 示例值：
         */
        private I18n contactorName;

        /**
         * 猎头供应商ID
         * <p> 示例值：6898173495386147079
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 猎头供应商名称
         * <p> 示例值：超越猎头公司
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 供应商联系人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         *
         * @param contactorId
         * @return
         */
        public Builder contactorId(String contactorId) {
            this.contactorId = contactorId;
            return this;
        }


        /**
         * 供应商联系人名称
         * <p> 示例值：
         *
         * @param contactorName
         * @return
         */
        public Builder contactorName(I18n contactorName) {
            this.contactorName = contactorName;
            return this;
        }


        public Agency build() {
            return new Agency(this);
        }
    }
}
