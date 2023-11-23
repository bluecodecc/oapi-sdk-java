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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class ResidentTax {
    /**
     * 年度
     * <p> 示例值：2023
     */
    @SerializedName("year_resident_tax")
    private String yearResidentTax;
    /**
     * -| 居民身份，枚举值 api_name 可通过【获取字段详情】接口查询，查询参数如下： - object_api_name = "resident_tax" - custom_api_name = "resident_status"
     * <p> 示例值：
     */
    @SerializedName("resident_status")
    private Enum residentStatus;
    /**
     * 国家/地区，可通过【查询国家/地区信息】 接口查询
     * <p> 示例值：中国
     */
    @SerializedName("tax_country_region_id")
    private String taxCountryRegionId;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public ResidentTax() {
    }

    public ResidentTax(Builder builder) {
        /**
         * 年度
         * <p> 示例值：2023
         */
        this.yearResidentTax = builder.yearResidentTax;
        /**
         * -| 居民身份，枚举值 api_name 可通过【获取字段详情】接口查询，查询参数如下： - object_api_name = "resident_tax" - custom_api_name = "resident_status"
         * <p> 示例值：
         */
        this.residentStatus = builder.residentStatus;
        /**
         * 国家/地区，可通过【查询国家/地区信息】 接口查询
         * <p> 示例值：中国
         */
        this.taxCountryRegionId = builder.taxCountryRegionId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getYearResidentTax() {
        return this.yearResidentTax;
    }

    public void setYearResidentTax(String yearResidentTax) {
        this.yearResidentTax = yearResidentTax;
    }

    public Enum getResidentStatus() {
        return this.residentStatus;
    }

    public void setResidentStatus(Enum residentStatus) {
        this.residentStatus = residentStatus;
    }

    public String getTaxCountryRegionId() {
        return this.taxCountryRegionId;
    }

    public void setTaxCountryRegionId(String taxCountryRegionId) {
        this.taxCountryRegionId = taxCountryRegionId;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 年度
         * <p> 示例值：2023
         */
        private String yearResidentTax;
        /**
         * -| 居民身份，枚举值 api_name 可通过【获取字段详情】接口查询，查询参数如下： - object_api_name = "resident_tax" - custom_api_name = "resident_status"
         * <p> 示例值：
         */
        private Enum residentStatus;
        /**
         * 国家/地区，可通过【查询国家/地区信息】 接口查询
         * <p> 示例值：中国
         */
        private String taxCountryRegionId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 年度
         * <p> 示例值：2023
         *
         * @param yearResidentTax
         * @return
         */
        public Builder yearResidentTax(String yearResidentTax) {
            this.yearResidentTax = yearResidentTax;
            return this;
        }


        /**
         * -| 居民身份，枚举值 api_name 可通过【获取字段详情】接口查询，查询参数如下： - object_api_name = "resident_tax" - custom_api_name = "resident_status"
         * <p> 示例值：
         *
         * @param residentStatus
         * @return
         */
        public Builder residentStatus(Enum residentStatus) {
            this.residentStatus = residentStatus;
            return this;
        }


        /**
         * 国家/地区，可通过【查询国家/地区信息】 接口查询
         * <p> 示例值：中国
         *
         * @param taxCountryRegionId
         * @return
         */
        public Builder taxCountryRegionId(String taxCountryRegionId) {
            this.taxCountryRegionId = taxCountryRegionId;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public ResidentTax build() {
            return new ResidentTax(this);
        }
    }
}
