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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class ApplicationResumeSource {
    /**
     * 投递来源 ID
     * <p> 示例值：614218419274131
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递来源名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 投递来源类型
     * <p> 示例值：10002
     */
    @SerializedName("resume_source_type")
    private Integer resumeSourceType;

    // builder 开始
    public ApplicationResumeSource() {
    }

    public ApplicationResumeSource(Builder builder) {
        /**
         * 投递来源 ID
         * <p> 示例值：614218419274131
         */
        this.id = builder.id;
        /**
         * 投递来源名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 投递来源类型
         * <p> 示例值：10002
         */
        this.resumeSourceType = builder.resumeSourceType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Integer getResumeSourceType() {
        return this.resumeSourceType;
    }

    public void setResumeSourceType(Integer resumeSourceType) {
        this.resumeSourceType = resumeSourceType;
    }

    public static class Builder {
        /**
         * 投递来源 ID
         * <p> 示例值：614218419274131
         */
        private String id;
        /**
         * 投递来源名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 投递来源类型
         * <p> 示例值：10002
         */
        private Integer resumeSourceType;

        /**
         * 投递来源 ID
         * <p> 示例值：614218419274131
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递来源名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 投递来源类型
         * <p> 示例值：10002
         *
         * @param resumeSourceType
         * @return
         */
        public Builder resumeSourceType(Integer resumeSourceType) {
            this.resumeSourceType = resumeSourceType;
            return this;
        }


        public ApplicationResumeSource build() {
            return new ApplicationResumeSource(this);
        }
    }
}
