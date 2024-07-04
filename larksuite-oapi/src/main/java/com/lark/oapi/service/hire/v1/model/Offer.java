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

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Offer {
    /**
     * Offer ID
     * <p> 示例值：1231231231231231
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递 ID
     * <p> 示例值：1231231232312312
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 基础信息
     * <p> 示例值：
     */
    @SerializedName("basic_info")
    private ApplicationOfferBasicInfo basicInfo;
    /**
     * 薪酬计划
     * <p> 示例值：
     */
    @SerializedName("salary_plan")
    private ApplicationOfferSalaryPlan salaryPlan;
    /**
     * 当前 Offer 使用的 Schema
     * <p> 示例值：6963562624677398823
     */
    @SerializedName("schema_id")
    private String schemaId;
    /**
     * Offer 状态
     * <p> 示例值：1
     */
    @SerializedName("offer_status")
    private Integer offerStatus;
    /**
     * Offer 类型
     * <p> 示例值：Offer 类型
     */
    @SerializedName("offer_type")
    private Integer offerType;
    /**
     * 职位信息
     * <p> 示例值：
     */
    @SerializedName("job_info")
    private OfferJobInfo jobInfo;
    /**
     * offer自定义模块列表
     * <p> 示例值：
     */
    @SerializedName("customized_module_list")
    private ApplicationOfferCustomModule[] customizedModuleList;
    /**
     * 招聘需求 ID
     * <p> 示例值：1231231232312312
     */
    @SerializedName("job_requirement_id")
    private String jobRequirementId;

    // builder 开始
    public Offer() {
    }

    public Offer(Builder builder) {
        /**
         * Offer ID
         * <p> 示例值：1231231231231231
         */
        this.id = builder.id;
        /**
         * 投递 ID
         * <p> 示例值：1231231232312312
         */
        this.applicationId = builder.applicationId;
        /**
         * 基础信息
         * <p> 示例值：
         */
        this.basicInfo = builder.basicInfo;
        /**
         * 薪酬计划
         * <p> 示例值：
         */
        this.salaryPlan = builder.salaryPlan;
        /**
         * 当前 Offer 使用的 Schema
         * <p> 示例值：6963562624677398823
         */
        this.schemaId = builder.schemaId;
        /**
         * Offer 状态
         * <p> 示例值：1
         */
        this.offerStatus = builder.offerStatus;
        /**
         * Offer 类型
         * <p> 示例值：Offer 类型
         */
        this.offerType = builder.offerType;
        /**
         * 职位信息
         * <p> 示例值：
         */
        this.jobInfo = builder.jobInfo;
        /**
         * offer自定义模块列表
         * <p> 示例值：
         */
        this.customizedModuleList = builder.customizedModuleList;
        /**
         * 招聘需求 ID
         * <p> 示例值：1231231232312312
         */
        this.jobRequirementId = builder.jobRequirementId;
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

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationOfferBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public void setBasicInfo(ApplicationOfferBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ApplicationOfferSalaryPlan getSalaryPlan() {
        return this.salaryPlan;
    }

    public void setSalaryPlan(ApplicationOfferSalaryPlan salaryPlan) {
        this.salaryPlan = salaryPlan;
    }

    public String getSchemaId() {
        return this.schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getOfferStatus() {
        return this.offerStatus;
    }

    public void setOfferStatus(Integer offerStatus) {
        this.offerStatus = offerStatus;
    }

    public Integer getOfferType() {
        return this.offerType;
    }

    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }

    public OfferJobInfo getJobInfo() {
        return this.jobInfo;
    }

    public void setJobInfo(OfferJobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public ApplicationOfferCustomModule[] getCustomizedModuleList() {
        return this.customizedModuleList;
    }

    public void setCustomizedModuleList(ApplicationOfferCustomModule[] customizedModuleList) {
        this.customizedModuleList = customizedModuleList;
    }

    public String getJobRequirementId() {
        return this.jobRequirementId;
    }

    public void setJobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
    }

    public static class Builder {
        /**
         * Offer ID
         * <p> 示例值：1231231231231231
         */
        private String id;
        /**
         * 投递 ID
         * <p> 示例值：1231231232312312
         */
        private String applicationId;
        /**
         * 基础信息
         * <p> 示例值：
         */
        private ApplicationOfferBasicInfo basicInfo;
        /**
         * 薪酬计划
         * <p> 示例值：
         */
        private ApplicationOfferSalaryPlan salaryPlan;
        /**
         * 当前 Offer 使用的 Schema
         * <p> 示例值：6963562624677398823
         */
        private String schemaId;
        /**
         * Offer 状态
         * <p> 示例值：1
         */
        private Integer offerStatus;
        /**
         * Offer 类型
         * <p> 示例值：Offer 类型
         */
        private Integer offerType;
        /**
         * 职位信息
         * <p> 示例值：
         */
        private OfferJobInfo jobInfo;
        /**
         * offer自定义模块列表
         * <p> 示例值：
         */
        private ApplicationOfferCustomModule[] customizedModuleList;
        /**
         * 招聘需求 ID
         * <p> 示例值：1231231232312312
         */
        private String jobRequirementId;

        /**
         * Offer ID
         * <p> 示例值：1231231231231231
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：1231231232312312
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 基础信息
         * <p> 示例值：
         *
         * @param basicInfo
         * @return
         */
        public Builder basicInfo(ApplicationOfferBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }


        /**
         * 薪酬计划
         * <p> 示例值：
         *
         * @param salaryPlan
         * @return
         */
        public Builder salaryPlan(ApplicationOfferSalaryPlan salaryPlan) {
            this.salaryPlan = salaryPlan;
            return this;
        }


        /**
         * 当前 Offer 使用的 Schema
         * <p> 示例值：6963562624677398823
         *
         * @param schemaId
         * @return
         */
        public Builder schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }


        /**
         * Offer 状态
         * <p> 示例值：1
         *
         * @param offerStatus
         * @return
         */
        public Builder offerStatus(Integer offerStatus) {
            this.offerStatus = offerStatus;
            return this;
        }


        /**
         * Offer 类型
         * <p> 示例值：Offer 类型
         *
         * @param offerType
         * @return
         */
        public Builder offerType(Integer offerType) {
            this.offerType = offerType;
            return this;
        }


        /**
         * 职位信息
         * <p> 示例值：
         *
         * @param jobInfo
         * @return
         */
        public Builder jobInfo(OfferJobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }


        /**
         * offer自定义模块列表
         * <p> 示例值：
         *
         * @param customizedModuleList
         * @return
         */
        public Builder customizedModuleList(ApplicationOfferCustomModule[] customizedModuleList) {
            this.customizedModuleList = customizedModuleList;
            return this;
        }


        /**
         * 招聘需求 ID
         * <p> 示例值：1231231232312312
         *
         * @param jobRequirementId
         * @return
         */
        public Builder jobRequirementId(String jobRequirementId) {
            this.jobRequirementId = jobRequirementId;
            return this;
        }


        public Offer build() {
            return new Offer(this);
        }
    }
}
