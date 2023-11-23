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

import com.google.gson.annotations.SerializedName;

public class OnboardingTask {
    /**
     * 任务名称
     * <p> 示例值：task_1
     */
    @SerializedName("task_name")
    private String taskName;
    /**
     * 任务名称
     * <p> 示例值：
     */
    @SerializedName("task_status")
    private String taskStatus;
    /**
     * 当前操作人雇佣 ID
     * <p> 示例值：7032210902531327521
     */
    @SerializedName("operator_id")
    private String operatorId;

    // builder 开始
    public OnboardingTask() {
    }

    public OnboardingTask(Builder builder) {
        /**
         * 任务名称
         * <p> 示例值：task_1
         */
        this.taskName = builder.taskName;
        /**
         * 任务名称
         * <p> 示例值：
         */
        this.taskStatus = builder.taskStatus;
        /**
         * 当前操作人雇佣 ID
         * <p> 示例值：7032210902531327521
         */
        this.operatorId = builder.operatorId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public static class Builder {
        /**
         * 任务名称
         * <p> 示例值：task_1
         */
        private String taskName;
        /**
         * 任务名称
         * <p> 示例值：
         */
        private String taskStatus;
        /**
         * 当前操作人雇佣 ID
         * <p> 示例值：7032210902531327521
         */
        private String operatorId;

        /**
         * 任务名称
         * <p> 示例值：task_1
         *
         * @param taskName
         * @return
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }


        /**
         * 任务名称
         * <p> 示例值：
         *
         * @param taskStatus
         * @return
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * 任务名称
         * <p> 示例值：
         *
         * @param taskStatus {@link com.lark.oapi.service.corehr.v2.enums.OnboardingTaskTaskStatusEnum}
         * @return
         */
        public Builder taskStatus(com.lark.oapi.service.corehr.v2.enums.OnboardingTaskTaskStatusEnum taskStatus) {
            this.taskStatus = taskStatus.getValue();
            return this;
        }


        /**
         * 当前操作人雇佣 ID
         * <p> 示例值：7032210902531327521
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        public OnboardingTask build() {
            return new OnboardingTask(this);
        }
    }
}
