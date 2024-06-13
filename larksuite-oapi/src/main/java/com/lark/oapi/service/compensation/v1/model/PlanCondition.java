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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PlanCondition {
    /**
     * 适用范围左值
     * <p> 示例值：7
     */
    @SerializedName("left_type")
    private Integer leftType;
    /**
     * 适用范围操作
     * <p> 示例值：1
     */
    @SerializedName("operator")
    private Integer operator;
    /**
     * 适用范围右值
     * <p> 示例值：21341234
     */
    @SerializedName("right_value")
    private String[] rightValue;

    // builder 开始
    public PlanCondition() {
    }

    public PlanCondition(Builder builder) {
        /**
         * 适用范围左值
         * <p> 示例值：7
         */
        this.leftType = builder.leftType;
        /**
         * 适用范围操作
         * <p> 示例值：1
         */
        this.operator = builder.operator;
        /**
         * 适用范围右值
         * <p> 示例值：21341234
         */
        this.rightValue = builder.rightValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getLeftType() {
        return this.leftType;
    }

    public void setLeftType(Integer leftType) {
        this.leftType = leftType;
    }

    public Integer getOperator() {
        return this.operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String[] getRightValue() {
        return this.rightValue;
    }

    public void setRightValue(String[] rightValue) {
        this.rightValue = rightValue;
    }

    public static class Builder {
        /**
         * 适用范围左值
         * <p> 示例值：7
         */
        private Integer leftType;
        /**
         * 适用范围操作
         * <p> 示例值：1
         */
        private Integer operator;
        /**
         * 适用范围右值
         * <p> 示例值：21341234
         */
        private String[] rightValue;

        /**
         * 适用范围左值
         * <p> 示例值：7
         *
         * @param leftType
         * @return
         */
        public Builder leftType(Integer leftType) {
            this.leftType = leftType;
            return this;
        }

        /**
         * 适用范围左值
         * <p> 示例值：7
         *
         * @param leftType {@link com.lark.oapi.service.compensation.v1.enums.PlanConditionScopeLeftTypeEnum}
         * @return
         */
        public Builder leftType(com.lark.oapi.service.compensation.v1.enums.PlanConditionScopeLeftTypeEnum leftType) {
            this.leftType = leftType.getValue();
            return this;
        }


        /**
         * 适用范围操作
         * <p> 示例值：1
         *
         * @param operator
         * @return
         */
        public Builder operator(Integer operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 适用范围操作
         * <p> 示例值：1
         *
         * @param operator {@link com.lark.oapi.service.compensation.v1.enums.PlanConditionScopeOperatorEnum}
         * @return
         */
        public Builder operator(com.lark.oapi.service.compensation.v1.enums.PlanConditionScopeOperatorEnum operator) {
            this.operator = operator.getValue();
            return this;
        }


        /**
         * 适用范围右值
         * <p> 示例值：21341234
         *
         * @param rightValue
         * @return
         */
        public Builder rightValue(String[] rightValue) {
            this.rightValue = rightValue;
            return this;
        }


        public PlanCondition build() {
            return new PlanCondition(this);
        }
    }
}
