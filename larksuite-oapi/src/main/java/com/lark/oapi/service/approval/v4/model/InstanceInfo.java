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

public class InstanceInfo {

    @SerializedName("approval_code")
    private String approvalCode;
    @SerializedName("approval_name")
    private String approvalName;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("serial_number")
    private String serialNumber;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("status")
    private String status;
    @SerializedName("uuid")
    private String uuid;
    @SerializedName("form")
    private String form;
    @SerializedName("task_list")
    private InstanceTask[] taskList;
    @SerializedName("comment_list")
    private InstanceComment[] commentList;
    @SerializedName("timeline")
    private InstanceTimeline[] timeline;

    // builder 开始
    public InstanceInfo() {
    }

    public InstanceInfo(Builder builder) {
        this.approvalCode = builder.approvalCode;
        this.approvalName = builder.approvalName;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.userId = builder.userId;
        this.openId = builder.openId;
        this.serialNumber = builder.serialNumber;
        this.departmentId = builder.departmentId;
        this.status = builder.status;
        this.uuid = builder.uuid;
        this.form = builder.form;
        this.taskList = builder.taskList;
        this.commentList = builder.commentList;
        this.timeline = builder.timeline;
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

    public String getApprovalName() {
        return this.approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getForm() {
        return this.form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public InstanceTask[] getTaskList() {
        return this.taskList;
    }

    public void setTaskList(InstanceTask[] taskList) {
        this.taskList = taskList;
    }

    public InstanceComment[] getCommentList() {
        return this.commentList;
    }

    public void setCommentList(InstanceComment[] commentList) {
        this.commentList = commentList;
    }

    public InstanceTimeline[] getTimeline() {
        return this.timeline;
    }

    public void setTimeline(InstanceTimeline[] timeline) {
        this.timeline = timeline;
    }

    public static class Builder {

        private String approvalCode;
        private String approvalName;
        private String startTime;
        private String endTime;
        private String userId;
        private String openId;
        private String serialNumber;
        private String departmentId;
        private String status;
        private String uuid;
        private String form;
        private InstanceTask[] taskList;
        private InstanceComment[] commentList;
        private InstanceTimeline[] timeline;

        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }

        public Builder approvalName(String approvalName) {
            this.approvalName = approvalName;
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

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
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

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder form(String form) {
            this.form = form;
            return this;
        }

        public Builder taskList(InstanceTask[] taskList) {
            this.taskList = taskList;
            return this;
        }

        public Builder commentList(InstanceComment[] commentList) {
            this.commentList = commentList;
            return this;
        }

        public Builder timeline(InstanceTimeline[] timeline) {
            this.timeline = timeline;
            return this;
        }


        public InstanceInfo build() {
            return new InstanceInfo(this);
        }
    }
}
