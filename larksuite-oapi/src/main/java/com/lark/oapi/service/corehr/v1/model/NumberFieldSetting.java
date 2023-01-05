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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class NumberFieldSetting {
    /**
     * 数字类型，含以下枚举值：;1. Percent 百分比;2. Integer 整数;3. Value 数值（浮点数）;4. Money 金额（浮点数）
     * <p> 示例值：1
     */
    @SerializedName("number_field_type")
    private Integer numberFieldType;
    /**
     * 小数部分位数（浮点数整数部分和小数部分分别最大30位）
     * <p> 示例值：1
     */
    @SerializedName("decimal_places")
    private Integer decimalPlaces;
    /**
     * 四舍五入规则，含以下枚举值：;;0. Round 四舍五入;1. Ceil 向上舍入;2. Floor 向下舍入
     * <p> 示例值：1
     */
    @SerializedName("round_type")
    private Integer roundType;
    /**
     * 整数+小数总位数
     * <p> 示例值：1
     */
    @SerializedName("decimal_total_places")
    private Integer decimalTotalPlaces;

    // builder 开始
    public NumberFieldSetting() {
    }

    public NumberFieldSetting(Builder builder) {
        /**
         * 数字类型，含以下枚举值：;1. Percent 百分比;2. Integer 整数;3. Value 数值（浮点数）;4. Money 金额（浮点数）
         * <p> 示例值：1
         */
        this.numberFieldType = builder.numberFieldType;
        /**
         * 小数部分位数（浮点数整数部分和小数部分分别最大30位）
         * <p> 示例值：1
         */
        this.decimalPlaces = builder.decimalPlaces;
        /**
         * 四舍五入规则，含以下枚举值：;;0. Round 四舍五入;1. Ceil 向上舍入;2. Floor 向下舍入
         * <p> 示例值：1
         */
        this.roundType = builder.roundType;
        /**
         * 整数+小数总位数
         * <p> 示例值：1
         */
        this.decimalTotalPlaces = builder.decimalTotalPlaces;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getNumberFieldType() {
        return this.numberFieldType;
    }

    public void setNumberFieldType(Integer numberFieldType) {
        this.numberFieldType = numberFieldType;
    }

    public Integer getDecimalPlaces() {
        return this.decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Integer getRoundType() {
        return this.roundType;
    }

    public void setRoundType(Integer roundType) {
        this.roundType = roundType;
    }

    public Integer getDecimalTotalPlaces() {
        return this.decimalTotalPlaces;
    }

    public void setDecimalTotalPlaces(Integer decimalTotalPlaces) {
        this.decimalTotalPlaces = decimalTotalPlaces;
    }

    public static class Builder {
        /**
         * 数字类型，含以下枚举值：;1. Percent 百分比;2. Integer 整数;3. Value 数值（浮点数）;4. Money 金额（浮点数）
         * <p> 示例值：1
         */
        private Integer numberFieldType;
        /**
         * 小数部分位数（浮点数整数部分和小数部分分别最大30位）
         * <p> 示例值：1
         */
        private Integer decimalPlaces;
        /**
         * 四舍五入规则，含以下枚举值：;;0. Round 四舍五入;1. Ceil 向上舍入;2. Floor 向下舍入
         * <p> 示例值：1
         */
        private Integer roundType;
        /**
         * 整数+小数总位数
         * <p> 示例值：1
         */
        private Integer decimalTotalPlaces;

        /**
         * 数字类型，含以下枚举值：;1. Percent 百分比;2. Integer 整数;3. Value 数值（浮点数）;4. Money 金额（浮点数）
         * <p> 示例值：1
         *
         * @param numberFieldType
         * @return
         */
        public Builder numberFieldType(Integer numberFieldType) {
            this.numberFieldType = numberFieldType;
            return this;
        }


        /**
         * 小数部分位数（浮点数整数部分和小数部分分别最大30位）
         * <p> 示例值：1
         *
         * @param decimalPlaces
         * @return
         */
        public Builder decimalPlaces(Integer decimalPlaces) {
            this.decimalPlaces = decimalPlaces;
            return this;
        }


        /**
         * 四舍五入规则，含以下枚举值：;;0. Round 四舍五入;1. Ceil 向上舍入;2. Floor 向下舍入
         * <p> 示例值：1
         *
         * @param roundType
         * @return
         */
        public Builder roundType(Integer roundType) {
            this.roundType = roundType;
            return this;
        }


        /**
         * 整数+小数总位数
         * <p> 示例值：1
         *
         * @param decimalTotalPlaces
         * @return
         */
        public Builder decimalTotalPlaces(Integer decimalTotalPlaces) {
            this.decimalTotalPlaces = decimalTotalPlaces;
            return this;
        }


        public NumberFieldSetting build() {
            return new NumberFieldSetting(this);
        }
    }
}
