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

public class GetApprovalRespBody {
    /**
     * 审批名称
     * <p> 示例值：Payment
     */
    @SerializedName("approval_name")
    private String approvalName;
    /**
     * 审批定义状态
     * <p> 示例值：ACTIVE
     */
    @SerializedName("status")
    private String status;
    /**
     * 控件信息，见下方form字段说明
     * <p> 示例值：[{\"id\": \"widget1\", \"custom_id\": \"user_name\",\"name\": \"Item application\",\"type\": \"textarea\",\"printable\": true,\"required\": true}\"]
     */
    @SerializedName("form")
    private String form;
    /**
     * 节点信息
     * <p> 示例值：
     */
    @SerializedName("node_list")
    private ApprovalNodeInfo[] nodeList;
    /**
     * 可见人列表
     * <p> 示例值：
     */
    @SerializedName("viewers")
    private ApprovalViewerInfo[] viewers;
    /**
     * 有数据管理权限的审批流程管理员ID
     * <p> 示例值：
     */
    @SerializedName("approval_admin_ids")
    private String[] approvalAdminIds;

    public String getApprovalName() {
        return this.approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getForm() {
        return this.form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public ApprovalNodeInfo[] getNodeList() {
        return this.nodeList;
    }

    public void setNodeList(ApprovalNodeInfo[] nodeList) {
        this.nodeList = nodeList;
    }

    public ApprovalViewerInfo[] getViewers() {
        return this.viewers;
    }

    public void setViewers(ApprovalViewerInfo[] viewers) {
        this.viewers = viewers;
    }

    public String[] getApprovalAdminIds() {
        return this.approvalAdminIds;
    }

    public void setApprovalAdminIds(String[] approvalAdminIds) {
        this.approvalAdminIds = approvalAdminIds;
    }

}
