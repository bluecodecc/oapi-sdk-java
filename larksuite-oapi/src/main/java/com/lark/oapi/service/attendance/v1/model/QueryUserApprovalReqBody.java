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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class QueryUserApprovalReqBody {
    /**
     * employee_no 或 employee_id 列表
     * <p> 示例值：["abd754f7"]
     */
    @SerializedName("user_ids")
    private String[] userIds;
    /**
     * 查询的起始工作日
     * <p> 示例值：20190817
     */
    @SerializedName("check_date_from")
    private Integer checkDateFrom;
    /**
     * 查询的结束工作日，与 check_date_from 的时间间隔不超过 30 天
     * <p> 示例值：20190820
     */
    @SerializedName("check_date_to")
    private Integer checkDateTo;
    /**
     * 查询依据的时间类型（不填默认依据PeriodTime）
     * <p> 示例值：PeriodTime
     */
    @SerializedName("check_date_type")
    private String checkDateType;
    /**
     * 查询状态（不填默认查询已通过状态）
     * <p> 示例值：2
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 查询的起始时间，精确到秒的时间戳
     * <p> 示例值：1566641088
     */
    @SerializedName("check_time_from")
    private String checkTimeFrom;
    /**
     * 查询的结束时间，精确到秒的时间戳
     * <p> 示例值：1592561088
     */
    @SerializedName("check_time_to")
    private String checkTimeTo;

    // builder 开始
    public QueryUserApprovalReqBody() {
    }

    public QueryUserApprovalReqBody(Builder builder) {
        /**
         * employee_no 或 employee_id 列表
         * <p> 示例值：["abd754f7"]
         */
        this.userIds = builder.userIds;
        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         */
        this.checkDateFrom = builder.checkDateFrom;
        /**
         * 查询的结束工作日，与 check_date_from 的时间间隔不超过 30 天
         * <p> 示例值：20190820
         */
        this.checkDateTo = builder.checkDateTo;
        /**
         * 查询依据的时间类型（不填默认依据PeriodTime）
         * <p> 示例值：PeriodTime
         */
        this.checkDateType = builder.checkDateType;
        /**
         * 查询状态（不填默认查询已通过状态）
         * <p> 示例值：2
         */
        this.status = builder.status;
        /**
         * 查询的起始时间，精确到秒的时间戳
         * <p> 示例值：1566641088
         */
        this.checkTimeFrom = builder.checkTimeFrom;
        /**
         * 查询的结束时间，精确到秒的时间戳
         * <p> 示例值：1592561088
         */
        this.checkTimeTo = builder.checkTimeTo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getUserIds() {
        return this.userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }

    public Integer getCheckDateFrom() {
        return this.checkDateFrom;
    }

    public void setCheckDateFrom(Integer checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public Integer getCheckDateTo() {
        return this.checkDateTo;
    }

    public void setCheckDateTo(Integer checkDateTo) {
        this.checkDateTo = checkDateTo;
    }

    public String getCheckDateType() {
        return this.checkDateType;
    }

    public void setCheckDateType(String checkDateType) {
        this.checkDateType = checkDateType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCheckTimeFrom() {
        return this.checkTimeFrom;
    }

    public void setCheckTimeFrom(String checkTimeFrom) {
        this.checkTimeFrom = checkTimeFrom;
    }

    public String getCheckTimeTo() {
        return this.checkTimeTo;
    }

    public void setCheckTimeTo(String checkTimeTo) {
        this.checkTimeTo = checkTimeTo;
    }

    public static class Builder {
        /**
         * employee_no 或 employee_id 列表
         * <p> 示例值：["abd754f7"]
         */
        private String[] userIds;
        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         */
        private Integer checkDateFrom;
        /**
         * 查询的结束工作日，与 check_date_from 的时间间隔不超过 30 天
         * <p> 示例值：20190820
         */
        private Integer checkDateTo;
        /**
         * 查询依据的时间类型（不填默认依据PeriodTime）
         * <p> 示例值：PeriodTime
         */
        private String checkDateType;
        /**
         * 查询状态（不填默认查询已通过状态）
         * <p> 示例值：2
         */
        private Integer status;
        /**
         * 查询的起始时间，精确到秒的时间戳
         * <p> 示例值：1566641088
         */
        private String checkTimeFrom;
        /**
         * 查询的结束时间，精确到秒的时间戳
         * <p> 示例值：1592561088
         */
        private String checkTimeTo;

        /**
         * employee_no 或 employee_id 列表
         * <p> 示例值：["abd754f7"]
         *
         * @param userIds
         * @return
         */
        public Builder userIds(String[] userIds) {
            this.userIds = userIds;
            return this;
        }


        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         *
         * @param checkDateFrom
         * @return
         */
        public Builder checkDateFrom(Integer checkDateFrom) {
            this.checkDateFrom = checkDateFrom;
            return this;
        }


        /**
         * 查询的结束工作日，与 check_date_from 的时间间隔不超过 30 天
         * <p> 示例值：20190820
         *
         * @param checkDateTo
         * @return
         */
        public Builder checkDateTo(Integer checkDateTo) {
            this.checkDateTo = checkDateTo;
            return this;
        }


        /**
         * 查询依据的时间类型（不填默认依据PeriodTime）
         * <p> 示例值：PeriodTime
         *
         * @param checkDateType
         * @return
         */
        public Builder checkDateType(String checkDateType) {
            this.checkDateType = checkDateType;
            return this;
        }

        /**
         * 查询依据的时间类型（不填默认依据PeriodTime）
         * <p> 示例值：PeriodTime
         *
         * @param checkDateType {@link com.lark.oapi.service.attendance.v1.enums.QueryUserApprovalCheckDateTypeEnum}
         * @return
         */
        public Builder checkDateType(com.lark.oapi.service.attendance.v1.enums.QueryUserApprovalCheckDateTypeEnum checkDateType) {
            this.checkDateType = checkDateType.getValue();
            return this;
        }


        /**
         * 查询状态（不填默认查询已通过状态）
         * <p> 示例值：2
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 查询状态（不填默认查询已通过状态）
         * <p> 示例值：2
         *
         * @param status {@link com.lark.oapi.service.attendance.v1.enums.QueryUserApprovalApprovalStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.attendance.v1.enums.QueryUserApprovalApprovalStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 查询的起始时间，精确到秒的时间戳
         * <p> 示例值：1566641088
         *
         * @param checkTimeFrom
         * @return
         */
        public Builder checkTimeFrom(String checkTimeFrom) {
            this.checkTimeFrom = checkTimeFrom;
            return this;
        }


        /**
         * 查询的结束时间，精确到秒的时间戳
         * <p> 示例值：1592561088
         *
         * @param checkTimeTo
         * @return
         */
        public Builder checkTimeTo(String checkTimeTo) {
            this.checkTimeTo = checkTimeTo;
            return this;
        }


        public QueryUserApprovalReqBody build() {
            return new QueryUserApprovalReqBody(this);
        }
    }
}
