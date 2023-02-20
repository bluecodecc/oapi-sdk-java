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

public class EnumFieldSetting {
    /**
     * 选项信息
     * <p> 示例值：
     */
    @SerializedName("enum_field_option_list")
    private CommonSchemaOption[] enumFieldOptionList;
    /**
     * 是否为多选
     * <p> 示例值：false
     */
    @SerializedName("is_multiple")
    private Boolean isMultiple;

    // builder 开始
    public EnumFieldSetting() {
    }

    public EnumFieldSetting(Builder builder) {
        /**
         * 选项信息
         * <p> 示例值：
         */
        this.enumFieldOptionList = builder.enumFieldOptionList;
        /**
         * 是否为多选
         * <p> 示例值：false
         */
        this.isMultiple = builder.isMultiple;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CommonSchemaOption[] getEnumFieldOptionList() {
        return this.enumFieldOptionList;
    }

    public void setEnumFieldOptionList(CommonSchemaOption[] enumFieldOptionList) {
        this.enumFieldOptionList = enumFieldOptionList;
    }

    public Boolean getIsMultiple() {
        return this.isMultiple;
    }

    public void setIsMultiple(Boolean isMultiple) {
        this.isMultiple = isMultiple;
    }

    public static class Builder {
        /**
         * 选项信息
         * <p> 示例值：
         */
        private CommonSchemaOption[] enumFieldOptionList;
        /**
         * 是否为多选
         * <p> 示例值：false
         */
        private Boolean isMultiple;

        /**
         * 选项信息
         * <p> 示例值：
         *
         * @param enumFieldOptionList
         * @return
         */
        public Builder enumFieldOptionList(CommonSchemaOption[] enumFieldOptionList) {
            this.enumFieldOptionList = enumFieldOptionList;
            return this;
        }


        /**
         * 是否为多选
         * <p> 示例值：false
         *
         * @param isMultiple
         * @return
         */
        public Builder isMultiple(Boolean isMultiple) {
            this.isMultiple = isMultiple;
            return this;
        }


        public EnumFieldSetting build() {
            return new EnumFieldSetting(this);
        }
    }
}
