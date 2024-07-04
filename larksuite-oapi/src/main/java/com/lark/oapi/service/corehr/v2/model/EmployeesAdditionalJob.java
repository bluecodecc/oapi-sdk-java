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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class EmployeesAdditionalJob {
    /**
     * 兼职记录ID
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("id")
    private String id;
    /**
     * 人员类型 ID，可通过[【查询单个人员类型】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/employee_type/get)获取详细信息
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 工时制度 ID，可通过[【查询单个工时制度】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/working_hours_type/get)获取详细信息
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 工作地点 ID，可通过[【查询单个地点】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/location/get)获取详细信息
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("work_location_id")
    private String workLocationId;
    /**
     * 部门 ID，可通过[【查询单个部门】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/department/get)获取详细信息；类型与department_id_type一致
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 职务 ID，可通过[【查询单个职务】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job/get)获取详细信息
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 职级 ID，可通过[【查询单个职级】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_level/get)获取详细信息
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 序列 ID，可通过[【查询单个序列】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_family/get)获取详细信息
     * <p> 示例值：1245678
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 雇佣 ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 兼职开始日期
     * <p> 示例值：2020-05-01
     */
    @SerializedName("start_date")
    private String startDate;
    /**
     * 兼职结束日期
     * <p> 示例值：2020-05-02
     */
    @SerializedName("end_date")
    private String endDate;
    /**
     * 直属上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
     * <p> 示例值：6890452208593372680
     */
    @SerializedName("direct_manager_id")
    private String directManagerId;
    /**
     * 虚线上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
     * <p> 示例值：6890452208593372680
     */
    @SerializedName("dotted_line_manager_id")
    private String dottedLineManagerId;
    /**
     * 排班类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "work_shift"
     * <p> 示例值：
     */
    @SerializedName("work_shift")
    private Enum workShift;
    /**
     * 薪资类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "compensation_type"
     * <p> 示例值：
     */
    @SerializedName("compensation_type")
    private Enum compensationType;
    /**
     * 任职公司，可通过[【查询单个公司】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/company/get)获取详细信息
     * <p> 示例值：6890452208593372680
     */
    @SerializedName("service_company")
    private String serviceCompany;
    /**
     * 周工作时长【0~168】
     * <p> 示例值：5
     */
    @SerializedName("weekly_working_hours")
    private String weeklyWorkingHours;
    /**
     * 工作日历ID
     * <p> 示例值：6890452208593372680
     */
    @SerializedName("work_calendar_id")
    private String workCalendarId;

    // builder 开始
    public EmployeesAdditionalJob() {
    }

    public EmployeesAdditionalJob(Builder builder) {
        /**
         * 兼职记录ID
         * <p> 示例值：6890452208593372679
         */
        this.id = builder.id;
        /**
         * 人员类型 ID，可通过[【查询单个人员类型】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/employee_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 工时制度 ID，可通过[【查询单个工时制度】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/working_hours_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 工作地点 ID，可通过[【查询单个地点】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/location/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        this.workLocationId = builder.workLocationId;
        /**
         * 部门 ID，可通过[【查询单个部门】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/department/get)获取详细信息；类型与department_id_type一致
         * <p> 示例值：6890452208593372679
         */
        this.departmentId = builder.departmentId;
        /**
         * 职务 ID，可通过[【查询单个职务】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        this.jobId = builder.jobId;
        /**
         * 职级 ID，可通过[【查询单个职级】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_level/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 序列 ID，可通过[【查询单个序列】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_family/get)获取详细信息
         * <p> 示例值：1245678
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 雇佣 ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6893014062142064135
         */
        this.employmentId = builder.employmentId;
        /**
         * 兼职开始日期
         * <p> 示例值：2020-05-01
         */
        this.startDate = builder.startDate;
        /**
         * 兼职结束日期
         * <p> 示例值：2020-05-02
         */
        this.endDate = builder.endDate;
        /**
         * 直属上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         */
        this.directManagerId = builder.directManagerId;
        /**
         * 虚线上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         */
        this.dottedLineManagerId = builder.dottedLineManagerId;
        /**
         * 排班类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "work_shift"
         * <p> 示例值：
         */
        this.workShift = builder.workShift;
        /**
         * 薪资类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "compensation_type"
         * <p> 示例值：
         */
        this.compensationType = builder.compensationType;
        /**
         * 任职公司，可通过[【查询单个公司】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/company/get)获取详细信息
         * <p> 示例值：6890452208593372680
         */
        this.serviceCompany = builder.serviceCompany;
        /**
         * 周工作时长【0~168】
         * <p> 示例值：5
         */
        this.weeklyWorkingHours = builder.weeklyWorkingHours;
        /**
         * 工作日历ID
         * <p> 示例值：6890452208593372680
         */
        this.workCalendarId = builder.workCalendarId;
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

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getWorkLocationId() {
        return this.workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDirectManagerId() {
        return this.directManagerId;
    }

    public void setDirectManagerId(String directManagerId) {
        this.directManagerId = directManagerId;
    }

    public String getDottedLineManagerId() {
        return this.dottedLineManagerId;
    }

    public void setDottedLineManagerId(String dottedLineManagerId) {
        this.dottedLineManagerId = dottedLineManagerId;
    }

    public Enum getWorkShift() {
        return this.workShift;
    }

    public void setWorkShift(Enum workShift) {
        this.workShift = workShift;
    }

    public Enum getCompensationType() {
        return this.compensationType;
    }

    public void setCompensationType(Enum compensationType) {
        this.compensationType = compensationType;
    }

    public String getServiceCompany() {
        return this.serviceCompany;
    }

    public void setServiceCompany(String serviceCompany) {
        this.serviceCompany = serviceCompany;
    }

    public String getWeeklyWorkingHours() {
        return this.weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(String weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public String getWorkCalendarId() {
        return this.workCalendarId;
    }

    public void setWorkCalendarId(String workCalendarId) {
        this.workCalendarId = workCalendarId;
    }

    public static class Builder {
        /**
         * 兼职记录ID
         * <p> 示例值：6890452208593372679
         */
        private String id;
        /**
         * 人员类型 ID，可通过[【查询单个人员类型】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/employee_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        private String employeeTypeId;
        /**
         * 工时制度 ID，可通过[【查询单个工时制度】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/working_hours_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        private String workingHoursTypeId;
        /**
         * 工作地点 ID，可通过[【查询单个地点】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/location/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        private String workLocationId;
        /**
         * 部门 ID，可通过[【查询单个部门】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/department/get)获取详细信息；类型与department_id_type一致
         * <p> 示例值：6890452208593372679
         */
        private String departmentId;
        /**
         * 职务 ID，可通过[【查询单个职务】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        private String jobId;
        /**
         * 职级 ID，可通过[【查询单个职级】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_level/get)获取详细信息
         * <p> 示例值：6890452208593372679
         */
        private String jobLevelId;
        /**
         * 序列 ID，可通过[【查询单个序列】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_family/get)获取详细信息
         * <p> 示例值：1245678
         */
        private String jobFamilyId;
        /**
         * 雇佣 ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6893014062142064135
         */
        private String employmentId;
        /**
         * 兼职开始日期
         * <p> 示例值：2020-05-01
         */
        private String startDate;
        /**
         * 兼职结束日期
         * <p> 示例值：2020-05-02
         */
        private String endDate;
        /**
         * 直属上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         */
        private String directManagerId;
        /**
         * 虚线上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         */
        private String dottedLineManagerId;
        /**
         * 排班类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "work_shift"
         * <p> 示例值：
         */
        private Enum workShift;
        /**
         * 薪资类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "compensation_type"
         * <p> 示例值：
         */
        private Enum compensationType;
        /**
         * 任职公司，可通过[【查询单个公司】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/company/get)获取详细信息
         * <p> 示例值：6890452208593372680
         */
        private String serviceCompany;
        /**
         * 周工作时长【0~168】
         * <p> 示例值：5
         */
        private String weeklyWorkingHours;
        /**
         * 工作日历ID
         * <p> 示例值：6890452208593372680
         */
        private String workCalendarId;

        /**
         * 兼职记录ID
         * <p> 示例值：6890452208593372679
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 人员类型 ID，可通过[【查询单个人员类型】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/employee_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 工时制度 ID，可通过[【查询单个工时制度】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/working_hours_type/get)获取详细信息
         * <p> 示例值：6890452208593372679
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 工作地点 ID，可通过[【查询单个地点】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/location/get)获取详细信息
         * <p> 示例值：6890452208593372679
         *
         * @param workLocationId
         * @return
         */
        public Builder workLocationId(String workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }


        /**
         * 部门 ID，可通过[【查询单个部门】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/department/get)获取详细信息；类型与department_id_type一致
         * <p> 示例值：6890452208593372679
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 职务 ID，可通过[【查询单个职务】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job/get)获取详细信息
         * <p> 示例值：6890452208593372679
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 职级 ID，可通过[【查询单个职级】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_level/get)获取详细信息
         * <p> 示例值：6890452208593372679
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 序列 ID，可通过[【查询单个序列】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/job_family/get)获取详细信息
         * <p> 示例值：1245678
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 雇佣 ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6893014062142064135
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 兼职开始日期
         * <p> 示例值：2020-05-01
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 兼职结束日期
         * <p> 示例值：2020-05-02
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 直属上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         *
         * @param directManagerId
         * @return
         */
        public Builder directManagerId(String directManagerId) {
            this.directManagerId = directManagerId;
            return this;
        }


        /**
         * 虚线上级的雇佣ID，可通过[【批量查询员工信息】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/employee/batch_get)获取详细信息；类型与user_id_type一致
         * <p> 示例值：6890452208593372680
         *
         * @param dottedLineManagerId
         * @return
         */
        public Builder dottedLineManagerId(String dottedLineManagerId) {
            this.dottedLineManagerId = dottedLineManagerId;
            return this;
        }


        /**
         * 排班类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "work_shift"
         * <p> 示例值：
         *
         * @param workShift
         * @return
         */
        public Builder workShift(Enum workShift) {
            this.workShift = workShift;
            return this;
        }


        /**
         * 薪资类型，可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;- object_api_name = "job_data";- custom_api_name = "compensation_type"
         * <p> 示例值：
         *
         * @param compensationType
         * @return
         */
        public Builder compensationType(Enum compensationType) {
            this.compensationType = compensationType;
            return this;
        }


        /**
         * 任职公司，可通过[【查询单个公司】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/company/get)获取详细信息
         * <p> 示例值：6890452208593372680
         *
         * @param serviceCompany
         * @return
         */
        public Builder serviceCompany(String serviceCompany) {
            this.serviceCompany = serviceCompany;
            return this;
        }


        /**
         * 周工作时长【0~168】
         * <p> 示例值：5
         *
         * @param weeklyWorkingHours
         * @return
         */
        public Builder weeklyWorkingHours(String weeklyWorkingHours) {
            this.weeklyWorkingHours = weeklyWorkingHours;
            return this;
        }


        /**
         * 工作日历ID
         * <p> 示例值：6890452208593372680
         *
         * @param workCalendarId
         * @return
         */
        public Builder workCalendarId(String workCalendarId) {
            this.workCalendarId = workCalendarId;
            return this;
        }


        public EmployeesAdditionalJob build() {
            return new EmployeesAdditionalJob(this);
        }
    }
}
