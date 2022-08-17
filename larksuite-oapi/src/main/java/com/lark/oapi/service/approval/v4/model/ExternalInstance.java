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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class ExternalInstance {

  @SerializedName("approval_code")
  private String approvalCode;
  @SerializedName("status")
  private String status;
  @SerializedName("extra")
  private String extra;
  @SerializedName("instance_id")
  private String instanceId;
  @SerializedName("links")
  private ExternalInstanceLink links;
  @SerializedName("title")
  private String title;
  @SerializedName("form")
  private ExternalInstanceForm[] form;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("user_name")
  private String userName;
  @SerializedName("open_id")
  private String openId;
  @SerializedName("department_id")
  private String departmentId;
  @SerializedName("department_name")
  private String departmentName;
  @SerializedName("start_time")
  private String startTime;
  @SerializedName("end_time")
  private String endTime;
  @SerializedName("update_time")
  private String updateTime;
  @SerializedName("display_method")
  private String displayMethod;
  @SerializedName("update_mode")
  private String updateMode;
  @SerializedName("task_list")
  private ExternalInstanceTaskNode[] taskList;
  @SerializedName("cc_list")
  private CcNode[] ccList;
  @SerializedName("i18n_resources")
  private I18nResource[] i18nResources;

  // builder 开始
  public ExternalInstance() {
  }

  public ExternalInstance(Builder builder) {
    this.approvalCode = builder.approvalCode;
    this.status = builder.status;
    this.extra = builder.extra;
    this.instanceId = builder.instanceId;
    this.links = builder.links;
    this.title = builder.title;
    this.form = builder.form;
    this.userId = builder.userId;
    this.userName = builder.userName;
    this.openId = builder.openId;
    this.departmentId = builder.departmentId;
    this.departmentName = builder.departmentName;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.updateTime = builder.updateTime;
    this.displayMethod = builder.displayMethod;
    this.updateMode = builder.updateMode;
    this.taskList = builder.taskList;
    this.ccList = builder.ccList;
    this.i18nResources = builder.i18nResources;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getApprovalCode() {
    return this.approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getInstanceId() {
    return this.instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ExternalInstanceLink getLinks() {
    return this.links;
  }

  public void setLinks(ExternalInstanceLink links) {
    this.links = links;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ExternalInstanceForm[] getForm() {
    return this.form;
  }

  public void setForm(ExternalInstanceForm[] form) {
    this.form = form;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return this.departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public String getDisplayMethod() {
    return this.displayMethod;
  }

  public void setDisplayMethod(String displayMethod) {
    this.displayMethod = displayMethod;
  }

  public String getUpdateMode() {
    return this.updateMode;
  }

  public void setUpdateMode(String updateMode) {
    this.updateMode = updateMode;
  }

  public ExternalInstanceTaskNode[] getTaskList() {
    return this.taskList;
  }

  public void setTaskList(ExternalInstanceTaskNode[] taskList) {
    this.taskList = taskList;
  }

  public CcNode[] getCcList() {
    return this.ccList;
  }

  public void setCcList(CcNode[] ccList) {
    this.ccList = ccList;
  }

  public I18nResource[] getI18nResources() {
    return this.i18nResources;
  }

  public void setI18nResources(I18nResource[] i18nResources) {
    this.i18nResources = i18nResources;
  }

  public static class Builder {

    private String approvalCode;
    private String status;
    private String extra;
    private String instanceId;
    private ExternalInstanceLink links;
    private String title;
    private ExternalInstanceForm[] form;
    private String userId;
    private String userName;
    private String openId;
    private String departmentId;
    private String departmentName;
    private String startTime;
    private String endTime;
    private String updateTime;
    private String displayMethod;
    private String updateMode;
    private ExternalInstanceTaskNode[] taskList;
    private CcNode[] ccList;
    private I18nResource[] i18nResources;

    public Builder approvalCode(String approvalCode) {
      this.approvalCode = approvalCode;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.approval.v4.enums.StatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    public Builder links(ExternalInstanceLink links) {
      this.links = links;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder form(ExternalInstanceForm[] form) {
      this.form = form;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    public Builder openId(String openId) {
      this.openId = openId;
      return this;
    }

    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder departmentName(String departmentName) {
      this.departmentName = departmentName;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder updateTime(String updateTime) {
      this.updateTime = updateTime;
      return this;
    }

    public Builder displayMethod(String displayMethod) {
      this.displayMethod = displayMethod;
      return this;
    }

    public Builder displayMethod(
        com.lark.oapi.service.approval.v4.enums.DisplayMethodEnum displayMethod) {
      this.displayMethod = displayMethod.getValue();
      return this;
    }

    public Builder updateMode(String updateMode) {
      this.updateMode = updateMode;
      return this;
    }

    public Builder updateMode(com.lark.oapi.service.approval.v4.enums.UpdateModeEnum updateMode) {
      this.updateMode = updateMode.getValue();
      return this;
    }

    public Builder taskList(ExternalInstanceTaskNode[] taskList) {
      this.taskList = taskList;
      return this;
    }

    public Builder ccList(CcNode[] ccList) {
      this.ccList = ccList;
      return this;
    }

    public Builder i18nResources(I18nResource[] i18nResources) {
      this.i18nResources = i18nResources;
      return this;
    }


    public ExternalInstance build() {
      return new ExternalInstance(this);
    }
  }
}