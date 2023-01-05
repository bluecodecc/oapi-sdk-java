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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class Scope {
    /**
     * 权限名称，形如 user.phone:readonly
     * <p> 示例值：
     */
    @SerializedName("scope_name")
    private String scopeName;
    /**
     * 租户应用权限授予状态
     * <p> 示例值：
     */
    @SerializedName("grant_status")
    private Integer grantStatus;

    // builder 开始
    public Scope() {
    }

    public Scope(Builder builder) {
        /**
         * 权限名称，形如 user.phone:readonly
         * <p> 示例值：
         */
        this.scopeName = builder.scopeName;
        /**
         * 租户应用权限授予状态
         * <p> 示例值：
         */
        this.grantStatus = builder.grantStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getScopeName() {
        return this.scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public Integer getGrantStatus() {
        return this.grantStatus;
    }

    public void setGrantStatus(Integer grantStatus) {
        this.grantStatus = grantStatus;
    }

    public static class Builder {
        /**
         * 权限名称，形如 user.phone:readonly
         * <p> 示例值：
         */
        private String scopeName;
        /**
         * 租户应用权限授予状态
         * <p> 示例值：
         */
        private Integer grantStatus;

        /**
         * 权限名称，形如 user.phone:readonly
         * <p> 示例值：
         *
         * @param scopeName
         * @return
         */
        public Builder scopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }


        /**
         * 租户应用权限授予状态
         * <p> 示例值：
         *
         * @param grantStatus
         * @return
         */
        public Builder grantStatus(Integer grantStatus) {
            this.grantStatus = grantStatus;
            return this;
        }

        /**
         * 租户应用权限授予状态
         * <p> 示例值：
         *
         * @param grantStatus {@link com.lark.oapi.service.application.v6.enums.ScopeGrantStatusEnum}
         * @return
         */
        public Builder grantStatus(com.lark.oapi.service.application.v6.enums.ScopeGrantStatusEnum grantStatus) {
            this.grantStatus = grantStatus.getValue();
            return this;
        }


        public Scope build() {
            return new Scope(this);
        }
    }
}
