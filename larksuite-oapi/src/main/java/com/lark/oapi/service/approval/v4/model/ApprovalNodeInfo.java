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

public class ApprovalNodeInfo {
    /**
     * 节点名称
     * <p> 示例值：Approval
     */
    @SerializedName("name")
    private String name;
    /**
     * 是否发起人自选节点 true - 发起审批时需要提交审批人
     * <p> 示例值：true
     */
    @SerializedName("need_approver")
    private Boolean needApprover;
    /**
     * 节点 ID
     * <p> 示例值：46e6d96cfa756980907209209ec03b64
     */
    @SerializedName("node_id")
    private String nodeId;
    /**
     * 节点自定义 ID，如果没有设置则不返回
     * <p> 示例值：46e6d96cfa756980907209209ec03b64
     */
    @SerializedName("custom_node_id")
    private String customNodeId;
    /**
     * 审批方式
     * <p> 示例值：AND
     */
    @SerializedName("node_type")
    private String nodeType;
    /**
     * 是否支持多选：true-支持，发起、结束节点该值无意义
     * <p> 示例值：true
     */
    @SerializedName("approver_chosen_multi")
    private Boolean approverChosenMulti;
    /**
     * 自选范围
     * <p> 示例值：
     */
    @SerializedName("approver_chosen_range")
    private ApproverChosenRange[] approverChosenRange;

    // builder 开始
    public ApprovalNodeInfo() {
    }

    public ApprovalNodeInfo(Builder builder) {
        /**
         * 节点名称
         * <p> 示例值：Approval
         */
        this.name = builder.name;
        /**
         * 是否发起人自选节点 true - 发起审批时需要提交审批人
         * <p> 示例值：true
         */
        this.needApprover = builder.needApprover;
        /**
         * 节点 ID
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         */
        this.nodeId = builder.nodeId;
        /**
         * 节点自定义 ID，如果没有设置则不返回
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         */
        this.customNodeId = builder.customNodeId;
        /**
         * 审批方式
         * <p> 示例值：AND
         */
        this.nodeType = builder.nodeType;
        /**
         * 是否支持多选：true-支持，发起、结束节点该值无意义
         * <p> 示例值：true
         */
        this.approverChosenMulti = builder.approverChosenMulti;
        /**
         * 自选范围
         * <p> 示例值：
         */
        this.approverChosenRange = builder.approverChosenRange;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNeedApprover() {
        return this.needApprover;
    }

    public void setNeedApprover(Boolean needApprover) {
        this.needApprover = needApprover;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getCustomNodeId() {
        return this.customNodeId;
    }

    public void setCustomNodeId(String customNodeId) {
        this.customNodeId = customNodeId;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Boolean getApproverChosenMulti() {
        return this.approverChosenMulti;
    }

    public void setApproverChosenMulti(Boolean approverChosenMulti) {
        this.approverChosenMulti = approverChosenMulti;
    }

    public ApproverChosenRange[] getApproverChosenRange() {
        return this.approverChosenRange;
    }

    public void setApproverChosenRange(ApproverChosenRange[] approverChosenRange) {
        this.approverChosenRange = approverChosenRange;
    }

    public static class Builder {
        /**
         * 节点名称
         * <p> 示例值：Approval
         */
        private String name;
        /**
         * 是否发起人自选节点 true - 发起审批时需要提交审批人
         * <p> 示例值：true
         */
        private Boolean needApprover;
        /**
         * 节点 ID
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         */
        private String nodeId;
        /**
         * 节点自定义 ID，如果没有设置则不返回
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         */
        private String customNodeId;
        /**
         * 审批方式
         * <p> 示例值：AND
         */
        private String nodeType;
        /**
         * 是否支持多选：true-支持，发起、结束节点该值无意义
         * <p> 示例值：true
         */
        private Boolean approverChosenMulti;
        /**
         * 自选范围
         * <p> 示例值：
         */
        private ApproverChosenRange[] approverChosenRange;

        /**
         * 节点名称
         * <p> 示例值：Approval
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 是否发起人自选节点 true - 发起审批时需要提交审批人
         * <p> 示例值：true
         *
         * @param needApprover
         * @return
         */
        public Builder needApprover(Boolean needApprover) {
            this.needApprover = needApprover;
            return this;
        }


        /**
         * 节点 ID
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         *
         * @param nodeId
         * @return
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }


        /**
         * 节点自定义 ID，如果没有设置则不返回
         * <p> 示例值：46e6d96cfa756980907209209ec03b64
         *
         * @param customNodeId
         * @return
         */
        public Builder customNodeId(String customNodeId) {
            this.customNodeId = customNodeId;
            return this;
        }


        /**
         * 审批方式
         * <p> 示例值：AND
         *
         * @param nodeType
         * @return
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * 审批方式
         * <p> 示例值：AND
         *
         * @param nodeType {@link com.lark.oapi.service.approval.v4.enums.ApprovalNodeInfoNodeTypeEnum}
         * @return
         */
        public Builder nodeType(com.lark.oapi.service.approval.v4.enums.ApprovalNodeInfoNodeTypeEnum nodeType) {
            this.nodeType = nodeType.getValue();
            return this;
        }


        /**
         * 是否支持多选：true-支持，发起、结束节点该值无意义
         * <p> 示例值：true
         *
         * @param approverChosenMulti
         * @return
         */
        public Builder approverChosenMulti(Boolean approverChosenMulti) {
            this.approverChosenMulti = approverChosenMulti;
            return this;
        }


        /**
         * 自选范围
         * <p> 示例值：
         *
         * @param approverChosenRange
         * @return
         */
        public Builder approverChosenRange(ApproverChosenRange[] approverChosenRange) {
            this.approverChosenRange = approverChosenRange;
            return this;
        }


        public ApprovalNodeInfo build() {
            return new ApprovalNodeInfo(this);
        }
    }
}
