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

public class AgencyProtection {
    /**
     * 保护期类型
     * <p> 示例值：1
     */
    @SerializedName("protection_type")
    private Integer protectionType;
    /**
     * 如保护期类型为职位保护，返回职位保护所在的投递id
     * <p> 示例值：6930815272790114323
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 保护期开始时间
     * <p> 示例值：1700023694629
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 保护期过期时间
     * <p> 示例值：1700023694630
     */
    @SerializedName("expire_time")
    private String expireTime;
    /**
     * 推荐的猎头供应商 ID
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("agency_supplier_id")
    private String agencySupplierId;
    /**
     * 推荐的猎头供应商名称
     * <p> 示例值：
     */
    @SerializedName("agency_supplier_name")
    private I18n agencySupplierName;
    /**
     * 推荐的猎头顾问ID，目前仅作为唯一标识，不可查询具体的人员信息
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("agency_supplier_user_id")
    private String agencySupplierUserId;
    /**
     * 推荐的猎头顾问名称
     * <p> 示例值：
     */
    @SerializedName("agency_supplier_user_name")
    private I18n agencySupplierUserName;

    // builder 开始
    public AgencyProtection() {
    }

    public AgencyProtection(Builder builder) {
        /**
         * 保护期类型
         * <p> 示例值：1
         */
        this.protectionType = builder.protectionType;
        /**
         * 如保护期类型为职位保护，返回职位保护所在的投递id
         * <p> 示例值：6930815272790114323
         */
        this.applicationId = builder.applicationId;
        /**
         * 保护期开始时间
         * <p> 示例值：1700023694629
         */
        this.startTime = builder.startTime;
        /**
         * 保护期过期时间
         * <p> 示例值：1700023694630
         */
        this.expireTime = builder.expireTime;
        /**
         * 推荐的猎头供应商 ID
         * <p> 示例值：6930815272790114324
         */
        this.agencySupplierId = builder.agencySupplierId;
        /**
         * 推荐的猎头供应商名称
         * <p> 示例值：
         */
        this.agencySupplierName = builder.agencySupplierName;
        /**
         * 推荐的猎头顾问ID，目前仅作为唯一标识，不可查询具体的人员信息
         * <p> 示例值：6930815272790114324
         */
        this.agencySupplierUserId = builder.agencySupplierUserId;
        /**
         * 推荐的猎头顾问名称
         * <p> 示例值：
         */
        this.agencySupplierUserName = builder.agencySupplierUserName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getProtectionType() {
        return this.protectionType;
    }

    public void setProtectionType(Integer protectionType) {
        this.protectionType = protectionType;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getAgencySupplierId() {
        return this.agencySupplierId;
    }

    public void setAgencySupplierId(String agencySupplierId) {
        this.agencySupplierId = agencySupplierId;
    }

    public I18n getAgencySupplierName() {
        return this.agencySupplierName;
    }

    public void setAgencySupplierName(I18n agencySupplierName) {
        this.agencySupplierName = agencySupplierName;
    }

    public String getAgencySupplierUserId() {
        return this.agencySupplierUserId;
    }

    public void setAgencySupplierUserId(String agencySupplierUserId) {
        this.agencySupplierUserId = agencySupplierUserId;
    }

    public I18n getAgencySupplierUserName() {
        return this.agencySupplierUserName;
    }

    public void setAgencySupplierUserName(I18n agencySupplierUserName) {
        this.agencySupplierUserName = agencySupplierUserName;
    }

    public static class Builder {
        /**
         * 保护期类型
         * <p> 示例值：1
         */
        private Integer protectionType;
        /**
         * 如保护期类型为职位保护，返回职位保护所在的投递id
         * <p> 示例值：6930815272790114323
         */
        private String applicationId;
        /**
         * 保护期开始时间
         * <p> 示例值：1700023694629
         */
        private String startTime;
        /**
         * 保护期过期时间
         * <p> 示例值：1700023694630
         */
        private String expireTime;
        /**
         * 推荐的猎头供应商 ID
         * <p> 示例值：6930815272790114324
         */
        private String agencySupplierId;
        /**
         * 推荐的猎头供应商名称
         * <p> 示例值：
         */
        private I18n agencySupplierName;
        /**
         * 推荐的猎头顾问ID，目前仅作为唯一标识，不可查询具体的人员信息
         * <p> 示例值：6930815272790114324
         */
        private String agencySupplierUserId;
        /**
         * 推荐的猎头顾问名称
         * <p> 示例值：
         */
        private I18n agencySupplierUserName;

        /**
         * 保护期类型
         * <p> 示例值：1
         *
         * @param protectionType
         * @return
         */
        public Builder protectionType(Integer protectionType) {
            this.protectionType = protectionType;
            return this;
        }


        /**
         * 如保护期类型为职位保护，返回职位保护所在的投递id
         * <p> 示例值：6930815272790114323
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 保护期开始时间
         * <p> 示例值：1700023694629
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 保护期过期时间
         * <p> 示例值：1700023694630
         *
         * @param expireTime
         * @return
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }


        /**
         * 推荐的猎头供应商 ID
         * <p> 示例值：6930815272790114324
         *
         * @param agencySupplierId
         * @return
         */
        public Builder agencySupplierId(String agencySupplierId) {
            this.agencySupplierId = agencySupplierId;
            return this;
        }


        /**
         * 推荐的猎头供应商名称
         * <p> 示例值：
         *
         * @param agencySupplierName
         * @return
         */
        public Builder agencySupplierName(I18n agencySupplierName) {
            this.agencySupplierName = agencySupplierName;
            return this;
        }


        /**
         * 推荐的猎头顾问ID，目前仅作为唯一标识，不可查询具体的人员信息
         * <p> 示例值：6930815272790114324
         *
         * @param agencySupplierUserId
         * @return
         */
        public Builder agencySupplierUserId(String agencySupplierUserId) {
            this.agencySupplierUserId = agencySupplierUserId;
            return this;
        }


        /**
         * 推荐的猎头顾问名称
         * <p> 示例值：
         *
         * @param agencySupplierUserName
         * @return
         */
        public Builder agencySupplierUserName(I18n agencySupplierUserName) {
            this.agencySupplierUserName = agencySupplierUserName;
            return this;
        }


        public AgencyProtection build() {
            return new AgencyProtection(this);
        }
    }
}
