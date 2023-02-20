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

public class ApprovalSetting {
    /**
     * 审批实例通过后允许撤回的时间，以秒为单位，默认 31 天，0 为不可撤回
     * <p> 示例值：0
     */
    @SerializedName("revert_interval")
    private Integer revertInterval;
    /**
     * 是否支持审批通过第一个节点后撤回，默认为1，0为不支持
     * <p> 示例值：0
     */
    @SerializedName("revert_option")
    private Integer revertOption;
    /**
     * 拒绝设置
     * <p> 示例值：0
     */
    @SerializedName("reject_option")
    private Integer rejectOption;

    // builder 开始
    public ApprovalSetting() {
    }

    public ApprovalSetting(Builder builder) {
        /**
         * 审批实例通过后允许撤回的时间，以秒为单位，默认 31 天，0 为不可撤回
         * <p> 示例值：0
         */
        this.revertInterval = builder.revertInterval;
        /**
         * 是否支持审批通过第一个节点后撤回，默认为1，0为不支持
         * <p> 示例值：0
         */
        this.revertOption = builder.revertOption;
        /**
         * 拒绝设置
         * <p> 示例值：0
         */
        this.rejectOption = builder.rejectOption;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getRevertInterval() {
        return this.revertInterval;
    }

    public void setRevertInterval(Integer revertInterval) {
        this.revertInterval = revertInterval;
    }

    public Integer getRevertOption() {
        return this.revertOption;
    }

    public void setRevertOption(Integer revertOption) {
        this.revertOption = revertOption;
    }

    public Integer getRejectOption() {
        return this.rejectOption;
    }

    public void setRejectOption(Integer rejectOption) {
        this.rejectOption = rejectOption;
    }

    public static class Builder {
        /**
         * 审批实例通过后允许撤回的时间，以秒为单位，默认 31 天，0 为不可撤回
         * <p> 示例值：0
         */
        private Integer revertInterval;
        /**
         * 是否支持审批通过第一个节点后撤回，默认为1，0为不支持
         * <p> 示例值：0
         */
        private Integer revertOption;
        /**
         * 拒绝设置
         * <p> 示例值：0
         */
        private Integer rejectOption;

        /**
         * 审批实例通过后允许撤回的时间，以秒为单位，默认 31 天，0 为不可撤回
         * <p> 示例值：0
         *
         * @param revertInterval
         * @return
         */
        public Builder revertInterval(Integer revertInterval) {
            this.revertInterval = revertInterval;
            return this;
        }


        /**
         * 是否支持审批通过第一个节点后撤回，默认为1，0为不支持
         * <p> 示例值：0
         *
         * @param revertOption
         * @return
         */
        public Builder revertOption(Integer revertOption) {
            this.revertOption = revertOption;
            return this;
        }


        /**
         * 拒绝设置
         * <p> 示例值：0
         *
         * @param rejectOption
         * @return
         */
        public Builder rejectOption(Integer rejectOption) {
            this.rejectOption = rejectOption;
            return this;
        }

        /**
         * 拒绝设置
         * <p> 示例值：0
         *
         * @param rejectOption {@link com.lark.oapi.service.approval.v4.enums.ApprovalSettingRejectOptionEnum}
         * @return
         */
        public Builder rejectOption(com.lark.oapi.service.approval.v4.enums.ApprovalSettingRejectOptionEnum rejectOption) {
            this.rejectOption = rejectOption.getValue();
            return this;
        }


        public ApprovalSetting build() {
            return new ApprovalSetting(this);
        }
    }
}
