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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class QueryUserStatsDataReq {
    /**
     * 请求体中的 user_ids 和响应体中的 user_id 的员工工号类型
     * <p> 示例值：employee_id
     */
    @Query
    @SerializedName("employee_type")
    private String employeeType;
    @Body
    private QueryUserStatsDataReqBody body;

    // builder 开始
    public QueryUserStatsDataReq() {
    }

    public QueryUserStatsDataReq(Builder builder) {
        /**
         * 请求体中的 user_ids 和响应体中的 user_id 的员工工号类型
         * <p> 示例值：employee_id
         */
        this.employeeType = builder.employeeType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public QueryUserStatsDataReqBody getQueryUserStatsDataReqBody() {
        return this.body;
    }

    public void setQueryUserStatsDataReqBody(QueryUserStatsDataReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String employeeType; // 请求体中的 user_ids 和响应体中的 user_id 的员工工号类型
        private QueryUserStatsDataReqBody body;

        /**
         * 请求体中的 user_ids 和响应体中的 user_id 的员工工号类型
         * <p> 示例值：employee_id
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        /**
         * 请求体中的 user_ids 和响应体中的 user_id 的员工工号类型
         * <p> 示例值：employee_id
         *
         * @param employeeType {@link com.lark.oapi.service.attendance.v1.enums.QueryUserStatsDataEmployeeTypeEnum}
         * @return
         */
        public Builder employeeType(com.lark.oapi.service.attendance.v1.enums.QueryUserStatsDataEmployeeTypeEnum employeeType) {
            this.employeeType = employeeType.getValue();
            return this;
        }

        public QueryUserStatsDataReqBody getQueryUserStatsDataReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder queryUserStatsDataReqBody(QueryUserStatsDataReqBody body) {
            this.body = body;
            return this;
        }

        public QueryUserStatsDataReq build() {
            return new QueryUserStatsDataReq(this);
        }
    }
}
