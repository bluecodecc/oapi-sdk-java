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

public class ChildItem {
    /**
     * 子标题编号
     * <p> 示例值：50101
     */
    @SerializedName("code")
    private String code;
    /**
     * 开关字段，0：关闭，1：开启（非开关字段场景：code = 51501 可选值为1-6）
     * <p> 示例值：0
     */
    @SerializedName("value")
    private String value;
    /**
     * 子标题名称
     * <p> 示例值：工号
     */
    @SerializedName("title")
    private String title;
    /**
     * 列类型
     * <p> 示例值：
     */
    @SerializedName("column_type")
    private Integer columnType;
    /**
     * 是否只读
     * <p> 示例值：
     */
    @SerializedName("read_only")
    private Boolean readOnly;
    /**
     * 最小值
     * <p> 示例值：
     */
    @SerializedName("min_value")
    private String minValue;
    /**
     * 最大值
     * <p> 示例值：
     */
    @SerializedName("max_value")
    private String maxValue;

    // builder 开始
    public ChildItem() {
    }

    public ChildItem(Builder builder) {
        /**
         * 子标题编号
         * <p> 示例值：50101
         */
        this.code = builder.code;
        /**
         * 开关字段，0：关闭，1：开启（非开关字段场景：code = 51501 可选值为1-6）
         * <p> 示例值：0
         */
        this.value = builder.value;
        /**
         * 子标题名称
         * <p> 示例值：工号
         */
        this.title = builder.title;
        /**
         * 列类型
         * <p> 示例值：
         */
        this.columnType = builder.columnType;
        /**
         * 是否只读
         * <p> 示例值：
         */
        this.readOnly = builder.readOnly;
        /**
         * 最小值
         * <p> 示例值：
         */
        this.minValue = builder.minValue;
        /**
         * 最大值
         * <p> 示例值：
         */
        this.maxValue = builder.maxValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getColumnType() {
        return this.columnType;
    }

    public void setColumnType(Integer columnType) {
        this.columnType = columnType;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getMinValue() {
        return this.minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public static class Builder {
        /**
         * 子标题编号
         * <p> 示例值：50101
         */
        private String code;
        /**
         * 开关字段，0：关闭，1：开启（非开关字段场景：code = 51501 可选值为1-6）
         * <p> 示例值：0
         */
        private String value;
        /**
         * 子标题名称
         * <p> 示例值：工号
         */
        private String title;
        /**
         * 列类型
         * <p> 示例值：
         */
        private Integer columnType;
        /**
         * 是否只读
         * <p> 示例值：
         */
        private Boolean readOnly;
        /**
         * 最小值
         * <p> 示例值：
         */
        private String minValue;
        /**
         * 最大值
         * <p> 示例值：
         */
        private String maxValue;

        /**
         * 子标题编号
         * <p> 示例值：50101
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 开关字段，0：关闭，1：开启（非开关字段场景：code = 51501 可选值为1-6）
         * <p> 示例值：0
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        /**
         * 子标题名称
         * <p> 示例值：工号
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 列类型
         * <p> 示例值：
         *
         * @param columnType
         * @return
         */
        public Builder columnType(Integer columnType) {
            this.columnType = columnType;
            return this;
        }


        /**
         * 是否只读
         * <p> 示例值：
         *
         * @param readOnly
         * @return
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }


        /**
         * 最小值
         * <p> 示例值：
         *
         * @param minValue
         * @return
         */
        public Builder minValue(String minValue) {
            this.minValue = minValue;
            return this;
        }


        /**
         * 最大值
         * <p> 示例值：
         *
         * @param maxValue
         * @return
         */
        public Builder maxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }


        public ChildItem build() {
            return new ChildItem(this);
        }
    }
}
