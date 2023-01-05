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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class BitableTableRecordActionField {
    /**
     * 字段 ID
     * <p> 示例值：
     */
    @SerializedName("field_id")
    private String fieldId;
    /**
     * 字段值
     * <p> 示例值：
     */
    @SerializedName("field_value")
    private String fieldValue;
    /**
     * 人员字段补充信息
     * <p> 示例值：
     */
    @SerializedName("field_identity_value")
    private BitableTableRecordActionFieldIdentity fieldIdentityValue;

    // builder 开始
    public BitableTableRecordActionField() {
    }

    public BitableTableRecordActionField(Builder builder) {
        /**
         * 字段 ID
         * <p> 示例值：
         */
        this.fieldId = builder.fieldId;
        /**
         * 字段值
         * <p> 示例值：
         */
        this.fieldValue = builder.fieldValue;
        /**
         * 人员字段补充信息
         * <p> 示例值：
         */
        this.fieldIdentityValue = builder.fieldIdentityValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public BitableTableRecordActionFieldIdentity getFieldIdentityValue() {
        return this.fieldIdentityValue;
    }

    public void setFieldIdentityValue(BitableTableRecordActionFieldIdentity fieldIdentityValue) {
        this.fieldIdentityValue = fieldIdentityValue;
    }

    public static class Builder {
        /**
         * 字段 ID
         * <p> 示例值：
         */
        private String fieldId;
        /**
         * 字段值
         * <p> 示例值：
         */
        private String fieldValue;
        /**
         * 人员字段补充信息
         * <p> 示例值：
         */
        private BitableTableRecordActionFieldIdentity fieldIdentityValue;

        /**
         * 字段 ID
         * <p> 示例值：
         *
         * @param fieldId
         * @return
         */
        public Builder fieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }


        /**
         * 字段值
         * <p> 示例值：
         *
         * @param fieldValue
         * @return
         */
        public Builder fieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }


        /**
         * 人员字段补充信息
         * <p> 示例值：
         *
         * @param fieldIdentityValue
         * @return
         */
        public Builder fieldIdentityValue(BitableTableRecordActionFieldIdentity fieldIdentityValue) {
            this.fieldIdentityValue = fieldIdentityValue;
            return this;
        }


        public BitableTableRecordActionField build() {
            return new BitableTableRecordActionField(this);
        }
    }
}
