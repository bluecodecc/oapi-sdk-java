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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListTaskReq {
    /**
     * 分页大小
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：MTYzMTg3ODUxNQ==
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 范围查询任务时，查询的起始时间。不填时默认起始时间为第一个任务的创建时间。
     * <p> 示例值：1652323331
     */
    @Query
    @SerializedName("start_create_time")
    private String startCreateTime;
    /**
     * 范围查询任务时，查询的结束时间。不填时默认结束时间为最后一个任务的创建时间。
     * <p> 示例值：1652323335
     */
    @Query
    @SerializedName("end_create_time")
    private String endCreateTime;
    /**
     * 可用于查询时过滤任务完成状态。true表示只返回已完成的任务，false表示只返回未完成的任务。不填时表示同时返回两种完成状态的任务。
     * <p> 示例值：false
     */
    @Query
    @SerializedName("task_completed")
    private Boolean taskCompleted;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public ListTaskReq() {
    }

    public ListTaskReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：MTYzMTg3ODUxNQ==
         */
        this.pageToken = builder.pageToken;
        /**
         * 范围查询任务时，查询的起始时间。不填时默认起始时间为第一个任务的创建时间。
         * <p> 示例值：1652323331
         */
        this.startCreateTime = builder.startCreateTime;
        /**
         * 范围查询任务时，查询的结束时间。不填时默认结束时间为最后一个任务的创建时间。
         * <p> 示例值：1652323335
         */
        this.endCreateTime = builder.endCreateTime;
        /**
         * 可用于查询时过滤任务完成状态。true表示只返回已完成的任务，false表示只返回未完成的任务。不填时表示同时返回两种完成状态的任务。
         * <p> 示例值：false
         */
        this.taskCompleted = builder.taskCompleted;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getStartCreateTime() {
        return this.startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return this.endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public Boolean getTaskCompleted() {
        return this.taskCompleted;
    }

    public void setTaskCompleted(Boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String startCreateTime; // 范围查询任务时，查询的起始时间。不填时默认起始时间为第一个任务的创建时间。
        private String endCreateTime; // 范围查询任务时，查询的结束时间。不填时默认结束时间为最后一个任务的创建时间。
        private Boolean taskCompleted; // 可用于查询时过滤任务完成状态。true表示只返回已完成的任务，false表示只返回未完成的任务。不填时表示同时返回两种完成状态的任务。
        private String userIdType; // 此次调用中使用的用户ID的类型


        /**
         * 分页大小
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：MTYzMTg3ODUxNQ==
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 范围查询任务时，查询的起始时间。不填时默认起始时间为第一个任务的创建时间。
         * <p> 示例值：1652323331
         *
         * @param startCreateTime
         * @return
         */
        public Builder startCreateTime(String startCreateTime) {
            this.startCreateTime = startCreateTime;
            return this;
        }


        /**
         * 范围查询任务时，查询的结束时间。不填时默认结束时间为最后一个任务的创建时间。
         * <p> 示例值：1652323335
         *
         * @param endCreateTime
         * @return
         */
        public Builder endCreateTime(String endCreateTime) {
            this.endCreateTime = endCreateTime;
            return this;
        }


        /**
         * 可用于查询时过滤任务完成状态。true表示只返回已完成的任务，false表示只返回未完成的任务。不填时表示同时返回两种完成状态的任务。
         * <p> 示例值：false
         *
         * @param taskCompleted
         * @return
         */
        public Builder taskCompleted(Boolean taskCompleted) {
            this.taskCompleted = taskCompleted;
            return this;
        }


        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.task.v1.enums.ListTaskUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.task.v1.enums.ListTaskUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public ListTaskReq build() {
            return new ListTaskReq(this);
        }
    }
}
