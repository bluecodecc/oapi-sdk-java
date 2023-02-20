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

public class InstanceCreate {
    /**
     * 审批定义 code
     * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
     */
    @SerializedName("approval_code")
    private String approvalCode;
    /**
     * 发起审批用户
     * <p> 示例值：f7cb567e
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 发起审批用户 open id, 如果传了 user_id 则优先使用 user_id
     * <p> 示例值：ou_3cda9c969f737aaa05e6915dce306cb9
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 发起审批用户部门id，如果用户只属于一个部门，可以不填。如果属于多个部门，默认会选择部门列表第一个部门
     * <p> 示例值：9293493ccacbdb9a
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * json 数组，控件值
     * <p> 示例值：[{\"id\":\"111\", \"type\": \"input\", \"value\":\"test\"}]
     */
    @SerializedName("form")
    private String form;
    /**
     * 如果有发起人自选节点，则需要填写对应节点的审批人
     * <p> 示例值：
     */
    @SerializedName("node_approver_user_id_list")
    private NodeApprover[] nodeApproverUserIdList;
    /**
     * 审批人发起人自选 open id，与上述node_approver_user_id_list字段取并集
     * <p> 示例值：
     */
    @SerializedName("node_approver_open_id_list")
    private NodeApprover[] nodeApproverOpenIdList;
    /**
     * 如果有发起人自选节点，则可填写对应节点的抄送人，单个节点最多选择20位抄送人
     * <p> 示例值：
     */
    @SerializedName("node_cc_user_id_list")
    private NodeCc[] nodeCcUserIdList;
    /**
     * 抄送人发起人自选 open id 单个节点最多选择20位抄送人
     * <p> 示例值：
     */
    @SerializedName("node_cc_open_id_list")
    private NodeCc[] nodeCcOpenIdList;
    /**
     * 审批实例 uuid，用于幂等操作, 每个租户下面的唯一key，同一个 uuid 只能用于创建一个审批实例，如果冲突，返回错误码 60012 ，格式建议为 XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX，不区分大小写
     * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A87
     */
    @SerializedName("uuid")
    private String uuid;
    /**
     * 可配置是否可以再次提交
     * <p> 示例值：true
     */
    @SerializedName("allow_resubmit")
    private Boolean allowResubmit;
    /**
     * 可配置是否可以重新提交
     * <p> 示例值：true
     */
    @SerializedName("allow_submit_again")
    private Boolean allowSubmitAgain;
    /**
     * 配置bot是否取消通知结果
     * <p> 示例值：0
     */
    @SerializedName("cancel_bot_notification")
    private String cancelBotNotification;
    /**
     * 配置是否可以禁止撤销
     * <p> 示例值：false
     */
    @SerializedName("forbid_revoke")
    private Boolean forbidRevoke;
    /**
     * 国际化文案
     * <p> 示例值：
     */
    @SerializedName("i18n_resources")
    private I18nResource[] i18nResources;

    // builder 开始
    public InstanceCreate() {
    }

    public InstanceCreate(Builder builder) {
        /**
         * 审批定义 code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        this.approvalCode = builder.approvalCode;
        /**
         * 发起审批用户
         * <p> 示例值：f7cb567e
         */
        this.userId = builder.userId;
        /**
         * 发起审批用户 open id, 如果传了 user_id 则优先使用 user_id
         * <p> 示例值：ou_3cda9c969f737aaa05e6915dce306cb9
         */
        this.openId = builder.openId;
        /**
         * 发起审批用户部门id，如果用户只属于一个部门，可以不填。如果属于多个部门，默认会选择部门列表第一个部门
         * <p> 示例值：9293493ccacbdb9a
         */
        this.departmentId = builder.departmentId;
        /**
         * json 数组，控件值
         * <p> 示例值：[{\"id\":\"111\", \"type\": \"input\", \"value\":\"test\"}]
         */
        this.form = builder.form;
        /**
         * 如果有发起人自选节点，则需要填写对应节点的审批人
         * <p> 示例值：
         */
        this.nodeApproverUserIdList = builder.nodeApproverUserIdList;
        /**
         * 审批人发起人自选 open id，与上述node_approver_user_id_list字段取并集
         * <p> 示例值：
         */
        this.nodeApproverOpenIdList = builder.nodeApproverOpenIdList;
        /**
         * 如果有发起人自选节点，则可填写对应节点的抄送人，单个节点最多选择20位抄送人
         * <p> 示例值：
         */
        this.nodeCcUserIdList = builder.nodeCcUserIdList;
        /**
         * 抄送人发起人自选 open id 单个节点最多选择20位抄送人
         * <p> 示例值：
         */
        this.nodeCcOpenIdList = builder.nodeCcOpenIdList;
        /**
         * 审批实例 uuid，用于幂等操作, 每个租户下面的唯一key，同一个 uuid 只能用于创建一个审批实例，如果冲突，返回错误码 60012 ，格式建议为 XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX，不区分大小写
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A87
         */
        this.uuid = builder.uuid;
        /**
         * 可配置是否可以再次提交
         * <p> 示例值：true
         */
        this.allowResubmit = builder.allowResubmit;
        /**
         * 可配置是否可以重新提交
         * <p> 示例值：true
         */
        this.allowSubmitAgain = builder.allowSubmitAgain;
        /**
         * 配置bot是否取消通知结果
         * <p> 示例值：0
         */
        this.cancelBotNotification = builder.cancelBotNotification;
        /**
         * 配置是否可以禁止撤销
         * <p> 示例值：false
         */
        this.forbidRevoke = builder.forbidRevoke;
        /**
         * 国际化文案
         * <p> 示例值：
         */
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

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getForm() {
        return this.form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public NodeApprover[] getNodeApproverUserIdList() {
        return this.nodeApproverUserIdList;
    }

    public void setNodeApproverUserIdList(NodeApprover[] nodeApproverUserIdList) {
        this.nodeApproverUserIdList = nodeApproverUserIdList;
    }

    public NodeApprover[] getNodeApproverOpenIdList() {
        return this.nodeApproverOpenIdList;
    }

    public void setNodeApproverOpenIdList(NodeApprover[] nodeApproverOpenIdList) {
        this.nodeApproverOpenIdList = nodeApproverOpenIdList;
    }

    public NodeCc[] getNodeCcUserIdList() {
        return this.nodeCcUserIdList;
    }

    public void setNodeCcUserIdList(NodeCc[] nodeCcUserIdList) {
        this.nodeCcUserIdList = nodeCcUserIdList;
    }

    public NodeCc[] getNodeCcOpenIdList() {
        return this.nodeCcOpenIdList;
    }

    public void setNodeCcOpenIdList(NodeCc[] nodeCcOpenIdList) {
        this.nodeCcOpenIdList = nodeCcOpenIdList;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getAllowResubmit() {
        return this.allowResubmit;
    }

    public void setAllowResubmit(Boolean allowResubmit) {
        this.allowResubmit = allowResubmit;
    }

    public Boolean getAllowSubmitAgain() {
        return this.allowSubmitAgain;
    }

    public void setAllowSubmitAgain(Boolean allowSubmitAgain) {
        this.allowSubmitAgain = allowSubmitAgain;
    }

    public String getCancelBotNotification() {
        return this.cancelBotNotification;
    }

    public void setCancelBotNotification(String cancelBotNotification) {
        this.cancelBotNotification = cancelBotNotification;
    }

    public Boolean getForbidRevoke() {
        return this.forbidRevoke;
    }

    public void setForbidRevoke(Boolean forbidRevoke) {
        this.forbidRevoke = forbidRevoke;
    }

    public I18nResource[] getI18nResources() {
        return this.i18nResources;
    }

    public void setI18nResources(I18nResource[] i18nResources) {
        this.i18nResources = i18nResources;
    }

    public static class Builder {
        /**
         * 审批定义 code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        private String approvalCode;
        /**
         * 发起审批用户
         * <p> 示例值：f7cb567e
         */
        private String userId;
        /**
         * 发起审批用户 open id, 如果传了 user_id 则优先使用 user_id
         * <p> 示例值：ou_3cda9c969f737aaa05e6915dce306cb9
         */
        private String openId;
        /**
         * 发起审批用户部门id，如果用户只属于一个部门，可以不填。如果属于多个部门，默认会选择部门列表第一个部门
         * <p> 示例值：9293493ccacbdb9a
         */
        private String departmentId;
        /**
         * json 数组，控件值
         * <p> 示例值：[{\"id\":\"111\", \"type\": \"input\", \"value\":\"test\"}]
         */
        private String form;
        /**
         * 如果有发起人自选节点，则需要填写对应节点的审批人
         * <p> 示例值：
         */
        private NodeApprover[] nodeApproverUserIdList;
        /**
         * 审批人发起人自选 open id，与上述node_approver_user_id_list字段取并集
         * <p> 示例值：
         */
        private NodeApprover[] nodeApproverOpenIdList;
        /**
         * 如果有发起人自选节点，则可填写对应节点的抄送人，单个节点最多选择20位抄送人
         * <p> 示例值：
         */
        private NodeCc[] nodeCcUserIdList;
        /**
         * 抄送人发起人自选 open id 单个节点最多选择20位抄送人
         * <p> 示例值：
         */
        private NodeCc[] nodeCcOpenIdList;
        /**
         * 审批实例 uuid，用于幂等操作, 每个租户下面的唯一key，同一个 uuid 只能用于创建一个审批实例，如果冲突，返回错误码 60012 ，格式建议为 XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX，不区分大小写
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A87
         */
        private String uuid;
        /**
         * 可配置是否可以再次提交
         * <p> 示例值：true
         */
        private Boolean allowResubmit;
        /**
         * 可配置是否可以重新提交
         * <p> 示例值：true
         */
        private Boolean allowSubmitAgain;
        /**
         * 配置bot是否取消通知结果
         * <p> 示例值：0
         */
        private String cancelBotNotification;
        /**
         * 配置是否可以禁止撤销
         * <p> 示例值：false
         */
        private Boolean forbidRevoke;
        /**
         * 国际化文案
         * <p> 示例值：
         */
        private I18nResource[] i18nResources;

        /**
         * 审批定义 code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         *
         * @param approvalCode
         * @return
         */
        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }


        /**
         * 发起审批用户
         * <p> 示例值：f7cb567e
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 发起审批用户 open id, 如果传了 user_id 则优先使用 user_id
         * <p> 示例值：ou_3cda9c969f737aaa05e6915dce306cb9
         *
         * @param openId
         * @return
         */
        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }


        /**
         * 发起审批用户部门id，如果用户只属于一个部门，可以不填。如果属于多个部门，默认会选择部门列表第一个部门
         * <p> 示例值：9293493ccacbdb9a
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * json 数组，控件值
         * <p> 示例值：[{\"id\":\"111\", \"type\": \"input\", \"value\":\"test\"}]
         *
         * @param form
         * @return
         */
        public Builder form(String form) {
            this.form = form;
            return this;
        }


        /**
         * 如果有发起人自选节点，则需要填写对应节点的审批人
         * <p> 示例值：
         *
         * @param nodeApproverUserIdList
         * @return
         */
        public Builder nodeApproverUserIdList(NodeApprover[] nodeApproverUserIdList) {
            this.nodeApproverUserIdList = nodeApproverUserIdList;
            return this;
        }


        /**
         * 审批人发起人自选 open id，与上述node_approver_user_id_list字段取并集
         * <p> 示例值：
         *
         * @param nodeApproverOpenIdList
         * @return
         */
        public Builder nodeApproverOpenIdList(NodeApprover[] nodeApproverOpenIdList) {
            this.nodeApproverOpenIdList = nodeApproverOpenIdList;
            return this;
        }


        /**
         * 如果有发起人自选节点，则可填写对应节点的抄送人，单个节点最多选择20位抄送人
         * <p> 示例值：
         *
         * @param nodeCcUserIdList
         * @return
         */
        public Builder nodeCcUserIdList(NodeCc[] nodeCcUserIdList) {
            this.nodeCcUserIdList = nodeCcUserIdList;
            return this;
        }


        /**
         * 抄送人发起人自选 open id 单个节点最多选择20位抄送人
         * <p> 示例值：
         *
         * @param nodeCcOpenIdList
         * @return
         */
        public Builder nodeCcOpenIdList(NodeCc[] nodeCcOpenIdList) {
            this.nodeCcOpenIdList = nodeCcOpenIdList;
            return this;
        }


        /**
         * 审批实例 uuid，用于幂等操作, 每个租户下面的唯一key，同一个 uuid 只能用于创建一个审批实例，如果冲突，返回错误码 60012 ，格式建议为 XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX，不区分大小写
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A87
         *
         * @param uuid
         * @return
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }


        /**
         * 可配置是否可以再次提交
         * <p> 示例值：true
         *
         * @param allowResubmit
         * @return
         */
        public Builder allowResubmit(Boolean allowResubmit) {
            this.allowResubmit = allowResubmit;
            return this;
        }


        /**
         * 可配置是否可以重新提交
         * <p> 示例值：true
         *
         * @param allowSubmitAgain
         * @return
         */
        public Builder allowSubmitAgain(Boolean allowSubmitAgain) {
            this.allowSubmitAgain = allowSubmitAgain;
            return this;
        }


        /**
         * 配置bot是否取消通知结果
         * <p> 示例值：0
         *
         * @param cancelBotNotification
         * @return
         */
        public Builder cancelBotNotification(String cancelBotNotification) {
            this.cancelBotNotification = cancelBotNotification;
            return this;
        }


        /**
         * 配置是否可以禁止撤销
         * <p> 示例值：false
         *
         * @param forbidRevoke
         * @return
         */
        public Builder forbidRevoke(Boolean forbidRevoke) {
            this.forbidRevoke = forbidRevoke;
            return this;
        }


        /**
         * 国际化文案
         * <p> 示例值：
         *
         * @param i18nResources
         * @return
         */
        public Builder i18nResources(I18nResource[] i18nResources) {
            this.i18nResources = i18nResources;
            return this;
        }


        public InstanceCreate build() {
            return new InstanceCreate(this);
        }
    }
}
