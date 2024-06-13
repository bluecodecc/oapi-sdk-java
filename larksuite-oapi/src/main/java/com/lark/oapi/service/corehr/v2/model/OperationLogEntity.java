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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class OperationLogEntity {
    /**
     * 操作类型（create、update、delete）
     * <p> 示例值：update
     */
    @SerializedName("opt_type")
    private String optType;
    /**
     * 变更字段
     * <p> 示例值：
     */
    @SerializedName("fields")
    private OperationLogEntityField[] fields;
    /**
     * 雇员ID
     * <p> 示例值：7373878233473271340
     */
    @SerializedName("employment_id")
    private String employmentId;

    // builder 开始
    public OperationLogEntity() {
    }

    public OperationLogEntity(Builder builder) {
        /**
         * 操作类型（create、update、delete）
         * <p> 示例值：update
         */
        this.optType = builder.optType;
        /**
         * 变更字段
         * <p> 示例值：
         */
        this.fields = builder.fields;
        /**
         * 雇员ID
         * <p> 示例值：7373878233473271340
         */
        this.employmentId = builder.employmentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOptType() {
        return this.optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    public OperationLogEntityField[] getFields() {
        return this.fields;
    }

    public void setFields(OperationLogEntityField[] fields) {
        this.fields = fields;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public static class Builder {
        /**
         * 操作类型（create、update、delete）
         * <p> 示例值：update
         */
        private String optType;
        /**
         * 变更字段
         * <p> 示例值：
         */
        private OperationLogEntityField[] fields;
        /**
         * 雇员ID
         * <p> 示例值：7373878233473271340
         */
        private String employmentId;

        /**
         * 操作类型（create、update、delete）
         * <p> 示例值：update
         *
         * @param optType
         * @return
         */
        public Builder optType(String optType) {
            this.optType = optType;
            return this;
        }


        /**
         * 变更字段
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(OperationLogEntityField[] fields) {
            this.fields = fields;
            return this;
        }


        /**
         * 雇员ID
         * <p> 示例值：7373878233473271340
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        public OperationLogEntity build() {
            return new OperationLogEntity(this);
        }
    }
}
