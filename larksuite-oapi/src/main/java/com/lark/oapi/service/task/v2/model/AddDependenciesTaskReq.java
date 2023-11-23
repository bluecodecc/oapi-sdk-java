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

package com.lark.oapi.service.task.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class AddDependenciesTaskReq {
    /**
     * 任务GUID
     * <p> 示例值：93b7bd05-35e6-4371-b3c9-6b7cbd7100c0
     */
    @Path
    @SerializedName("task_guid")
    private String taskGuid;
    @Body
    private AddDependenciesTaskReqBody body;

    // builder 开始
    public AddDependenciesTaskReq() {
    }

    public AddDependenciesTaskReq(Builder builder) {
        /**
         * 任务GUID
         * <p> 示例值：93b7bd05-35e6-4371-b3c9-6b7cbd7100c0
         */
        this.taskGuid = builder.taskGuid;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTaskGuid() {
        return this.taskGuid;
    }

    public void setTaskGuid(String taskGuid) {
        this.taskGuid = taskGuid;
    }

    public AddDependenciesTaskReqBody getAddDependenciesTaskReqBody() {
        return this.body;
    }

    public void setAddDependenciesTaskReqBody(AddDependenciesTaskReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String taskGuid; // 任务GUID
        private AddDependenciesTaskReqBody body;

        /**
         * 任务GUID
         * <p> 示例值：93b7bd05-35e6-4371-b3c9-6b7cbd7100c0
         *
         * @param taskGuid
         * @return
         */
        public Builder taskGuid(String taskGuid) {
            this.taskGuid = taskGuid;
            return this;
        }

        public AddDependenciesTaskReqBody getAddDependenciesTaskReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder addDependenciesTaskReqBody(AddDependenciesTaskReqBody body) {
            this.body = body;
            return this;
        }

        public AddDependenciesTaskReq build() {
            return new AddDependenciesTaskReq(this);
        }
    }
}
