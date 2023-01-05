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

public class FormFieldVariableI18nValue {
    /**
     * i18n值
     * <p> 示例值：
     */
    @SerializedName("value")
    private BpmDataengineI18n value;

    // builder 开始
    public FormFieldVariableI18nValue() {
    }

    public FormFieldVariableI18nValue(Builder builder) {
        /**
         * i18n值
         * <p> 示例值：
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BpmDataengineI18n getValue() {
        return this.value;
    }

    public void setValue(BpmDataengineI18n value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * i18n值
         * <p> 示例值：
         */
        private BpmDataengineI18n value;

        /**
         * i18n值
         * <p> 示例值：
         *
         * @param value
         * @return
         */
        public Builder value(BpmDataengineI18n value) {
            this.value = value;
            return this;
        }


        public FormFieldVariableI18nValue build() {
            return new FormFieldVariableI18nValue(this);
        }
    }
}
