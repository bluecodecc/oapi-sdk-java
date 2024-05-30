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

public class P2OffboardingUpdatedV2Data {
    /**
     * Saas租户ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("tenant_id")
    private String tenantId;
    /**
     * 离职记录ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("offboarding_info_id")
    private String offboardingInfoId;
    /**
     * 离职流程ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 离职手续办了流程ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("checklist_process_id")
    private String checklistProcessId;
    /**
     * 离职员工雇佣ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 操作人雇佣ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("operator")
    private String operator;
    /**
     * 变更后的离职状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 变更后的离职手续办理状态
     * <p> 示例值：1
     */
    @SerializedName("checklist_status")
    private Integer checklistStatus;
    /**
     * 更新时间毫秒时间戳
     * <p> 示例值：1714985958000
     */
    @SerializedName("updated_time")
    private String updatedTime;
    /**
     * 所有变更的离职信息字段
     * <p> 示例值：
     */
    @SerializedName("updated_fields")
    private String[] updatedFields;
    /**
     * 员工的飞书用户 ID
     * <p> 示例值：
     */
    @SerializedName("target_user_id")
    private UserId targetUserId;

    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getOffboardingInfoId() {
        return this.offboardingInfoId;
    }

    public void setOffboardingInfoId(String offboardingInfoId) {
        this.offboardingInfoId = offboardingInfoId;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getChecklistProcessId() {
        return this.checklistProcessId;
    }

    public void setChecklistProcessId(String checklistProcessId) {
        this.checklistProcessId = checklistProcessId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChecklistStatus() {
        return this.checklistStatus;
    }

    public void setChecklistStatus(Integer checklistStatus) {
        this.checklistStatus = checklistStatus;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String[] getUpdatedFields() {
        return this.updatedFields;
    }

    public void setUpdatedFields(String[] updatedFields) {
        this.updatedFields = updatedFields;
    }

    public UserId getTargetUserId() {
        return this.targetUserId;
    }

    public void setTargetUserId(UserId targetUserId) {
        this.targetUserId = targetUserId;
    }

}