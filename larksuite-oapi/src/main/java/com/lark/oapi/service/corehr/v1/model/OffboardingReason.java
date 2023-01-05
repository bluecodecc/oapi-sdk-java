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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class OffboardingReason {
    /**
     * 离职原因唯一标识
     * <p> 示例值：reason_for_offboarding_option8
     */
    @SerializedName("offboarding_reason_unique_identifier")
    private String offboardingReasonUniqueIdentifier;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 是否启用，true为启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 当前离职原因的父级原因唯一标识
     * <p> 示例值：offboarding_reason_1
     */
    @SerializedName("parent_offboarding_reason_unique_identifier")
    private String parentOffboardingReasonUniqueIdentifier;
    /**
     * 创建时间
     * <p> 示例值：2021-08-20 20:28:23
     */
    @SerializedName("created_time")
    private String createdTime;
    /**
     * 更新时间
     * <p> 示例值：2022-01-07 17:21:06
     */
    @SerializedName("updated_time")
    private String updatedTime;

    // builder 开始
    public OffboardingReason() {
    }

    public OffboardingReason(Builder builder) {
        /**
         * 离职原因唯一标识
         * <p> 示例值：reason_for_offboarding_option8
         */
        this.offboardingReasonUniqueIdentifier = builder.offboardingReasonUniqueIdentifier;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 是否启用，true为启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 当前离职原因的父级原因唯一标识
         * <p> 示例值：offboarding_reason_1
         */
        this.parentOffboardingReasonUniqueIdentifier = builder.parentOffboardingReasonUniqueIdentifier;
        /**
         * 创建时间
         * <p> 示例值：2021-08-20 20:28:23
         */
        this.createdTime = builder.createdTime;
        /**
         * 更新时间
         * <p> 示例值：2022-01-07 17:21:06
         */
        this.updatedTime = builder.updatedTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOffboardingReasonUniqueIdentifier() {
        return this.offboardingReasonUniqueIdentifier;
    }

    public void setOffboardingReasonUniqueIdentifier(String offboardingReasonUniqueIdentifier) {
        this.offboardingReasonUniqueIdentifier = offboardingReasonUniqueIdentifier;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getParentOffboardingReasonUniqueIdentifier() {
        return this.parentOffboardingReasonUniqueIdentifier;
    }

    public void setParentOffboardingReasonUniqueIdentifier(String parentOffboardingReasonUniqueIdentifier) {
        this.parentOffboardingReasonUniqueIdentifier = parentOffboardingReasonUniqueIdentifier;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public static class Builder {
        /**
         * 离职原因唯一标识
         * <p> 示例值：reason_for_offboarding_option8
         */
        private String offboardingReasonUniqueIdentifier;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 是否启用，true为启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 当前离职原因的父级原因唯一标识
         * <p> 示例值：offboarding_reason_1
         */
        private String parentOffboardingReasonUniqueIdentifier;
        /**
         * 创建时间
         * <p> 示例值：2021-08-20 20:28:23
         */
        private String createdTime;
        /**
         * 更新时间
         * <p> 示例值：2022-01-07 17:21:06
         */
        private String updatedTime;

        /**
         * 离职原因唯一标识
         * <p> 示例值：reason_for_offboarding_option8
         *
         * @param offboardingReasonUniqueIdentifier
         * @return
         */
        public Builder offboardingReasonUniqueIdentifier(String offboardingReasonUniqueIdentifier) {
            this.offboardingReasonUniqueIdentifier = offboardingReasonUniqueIdentifier;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 是否启用，true为启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 当前离职原因的父级原因唯一标识
         * <p> 示例值：offboarding_reason_1
         *
         * @param parentOffboardingReasonUniqueIdentifier
         * @return
         */
        public Builder parentOffboardingReasonUniqueIdentifier(String parentOffboardingReasonUniqueIdentifier) {
            this.parentOffboardingReasonUniqueIdentifier = parentOffboardingReasonUniqueIdentifier;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：2021-08-20 20:28:23
         *
         * @param createdTime
         * @return
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：2022-01-07 17:21:06
         *
         * @param updatedTime
         * @return
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }


        public OffboardingReason build() {
            return new OffboardingReason(this);
        }
    }
}
