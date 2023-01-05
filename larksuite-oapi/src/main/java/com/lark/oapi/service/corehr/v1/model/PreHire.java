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

public class PreHire {
    /**
     * 招聘系统的候选人 ID
     * <p> 示例值：4719168654814483759
     */
    @SerializedName("ats_application_id")
    private String atsApplicationId;
    /**
     * 待入职ID
     * <p> 示例值：154545454
     */
    @SerializedName("id")
    private String id;
    /**
     * 入职日期
     * <p> 示例值：2020-01-01
     */
    @SerializedName("hire_date")
    private String hireDate;
    /**
     * 雇佣类型
     * <p> 示例值：
     */
    @SerializedName("employee_type")
    private Enum employeeType;
    /**
     * 人员编号
     * <p> 示例值：1245646
     */
    @SerializedName("worker_id")
    private String workerId;
    /**
     * 雇佣类型
     * <p> 示例值：正式
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 引用Person ID
     * <p> 示例值：656464648662
     */
    @SerializedName("person_id")
    private String personId;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;
    /**
     * 入职状态;;- 待入职(preboarding);;- 已删除(deleted);;- 准备就绪(day_one);;- 已撤销(withdrawn);;- 已完成(completed)
     * <p> 示例值：
     */
    @SerializedName("onboarding_status")
    private Enum onboardingStatus;

    // builder 开始
    public PreHire() {
    }

    public PreHire(Builder builder) {
        /**
         * 招聘系统的候选人 ID
         * <p> 示例值：4719168654814483759
         */
        this.atsApplicationId = builder.atsApplicationId;
        /**
         * 待入职ID
         * <p> 示例值：154545454
         */
        this.id = builder.id;
        /**
         * 入职日期
         * <p> 示例值：2020-01-01
         */
        this.hireDate = builder.hireDate;
        /**
         * 雇佣类型
         * <p> 示例值：
         */
        this.employeeType = builder.employeeType;
        /**
         * 人员编号
         * <p> 示例值：1245646
         */
        this.workerId = builder.workerId;
        /**
         * 雇佣类型
         * <p> 示例值：正式
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 引用Person ID
         * <p> 示例值：656464648662
         */
        this.personId = builder.personId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 入职状态;;- 待入职(preboarding);;- 已删除(deleted);;- 准备就绪(day_one);;- 已撤销(withdrawn);;- 已完成(completed)
         * <p> 示例值：
         */
        this.onboardingStatus = builder.onboardingStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAtsApplicationId() {
        return this.atsApplicationId;
    }

    public void setAtsApplicationId(String atsApplicationId) {
        this.atsApplicationId = atsApplicationId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Enum getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(Enum employeeType) {
        this.employeeType = employeeType;
    }

    public String getWorkerId() {
        return this.workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public Enum getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public void setOnboardingStatus(Enum onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
    }

    public static class Builder {
        /**
         * 招聘系统的候选人 ID
         * <p> 示例值：4719168654814483759
         */
        private String atsApplicationId;
        /**
         * 待入职ID
         * <p> 示例值：154545454
         */
        private String id;
        /**
         * 入职日期
         * <p> 示例值：2020-01-01
         */
        private String hireDate;
        /**
         * 雇佣类型
         * <p> 示例值：
         */
        private Enum employeeType;
        /**
         * 人员编号
         * <p> 示例值：1245646
         */
        private String workerId;
        /**
         * 雇佣类型
         * <p> 示例值：正式
         */
        private String employeeTypeId;
        /**
         * 引用Person ID
         * <p> 示例值：656464648662
         */
        private String personId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;
        /**
         * 入职状态;;- 待入职(preboarding);;- 已删除(deleted);;- 准备就绪(day_one);;- 已撤销(withdrawn);;- 已完成(completed)
         * <p> 示例值：
         */
        private Enum onboardingStatus;

        /**
         * 招聘系统的候选人 ID
         * <p> 示例值：4719168654814483759
         *
         * @param atsApplicationId
         * @return
         */
        public Builder atsApplicationId(String atsApplicationId) {
            this.atsApplicationId = atsApplicationId;
            return this;
        }


        /**
         * 待入职ID
         * <p> 示例值：154545454
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 入职日期
         * <p> 示例值：2020-01-01
         *
         * @param hireDate
         * @return
         */
        public Builder hireDate(String hireDate) {
            this.hireDate = hireDate;
            return this;
        }


        /**
         * 雇佣类型
         * <p> 示例值：
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(Enum employeeType) {
            this.employeeType = employeeType;
            return this;
        }


        /**
         * 人员编号
         * <p> 示例值：1245646
         *
         * @param workerId
         * @return
         */
        public Builder workerId(String workerId) {
            this.workerId = workerId;
            return this;
        }


        /**
         * 雇佣类型
         * <p> 示例值：正式
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 引用Person ID
         * <p> 示例值：656464648662
         *
         * @param personId
         * @return
         */
        public Builder personId(String personId) {
            this.personId = personId;
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


        /**
         * 入职状态;;- 待入职(preboarding);;- 已删除(deleted);;- 准备就绪(day_one);;- 已撤销(withdrawn);;- 已完成(completed)
         * <p> 示例值：
         *
         * @param onboardingStatus
         * @return
         */
        public Builder onboardingStatus(Enum onboardingStatus) {
            this.onboardingStatus = onboardingStatus;
            return this;
        }


        public PreHire build() {
            return new PreHire(this);
        }
    }
}
