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

public class SignatureTemplateContentInfo {
    /**
     * 模版内容list
     * <p> 示例值：
     */
    @SerializedName("contents")
    private SignatureTemplateContentItem[] contents;
    /**
     * 自定义字段列表
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private SignatureTemplateCustomField[] customFields;
    /**
     * 筛选条件列表
     * <p> 示例值：
     */
    @SerializedName("filter_fields")
    private SignatureTemplateFilter[] filterFields;
    /**
     * 模板公共字段信息列表
     * <p> 示例值：
     */
    @SerializedName("using_fields")
    private SignatureTemplateCommonFieldInfo[] usingFields;
    /**
     * 系统设置字段列表
     * <p> 示例值：
     */
    @SerializedName("system_setting_fields")
    private SignatureTemplateField[] systemSettingFields;

    // builder 开始
    public SignatureTemplateContentInfo() {
    }

    public SignatureTemplateContentInfo(Builder builder) {
        /**
         * 模版内容list
         * <p> 示例值：
         */
        this.contents = builder.contents;
        /**
         * 自定义字段列表
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 筛选条件列表
         * <p> 示例值：
         */
        this.filterFields = builder.filterFields;
        /**
         * 模板公共字段信息列表
         * <p> 示例值：
         */
        this.usingFields = builder.usingFields;
        /**
         * 系统设置字段列表
         * <p> 示例值：
         */
        this.systemSettingFields = builder.systemSettingFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SignatureTemplateContentItem[] getContents() {
        return this.contents;
    }

    public void setContents(SignatureTemplateContentItem[] contents) {
        this.contents = contents;
    }

    public SignatureTemplateCustomField[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(SignatureTemplateCustomField[] customFields) {
        this.customFields = customFields;
    }

    public SignatureTemplateFilter[] getFilterFields() {
        return this.filterFields;
    }

    public void setFilterFields(SignatureTemplateFilter[] filterFields) {
        this.filterFields = filterFields;
    }

    public SignatureTemplateCommonFieldInfo[] getUsingFields() {
        return this.usingFields;
    }

    public void setUsingFields(SignatureTemplateCommonFieldInfo[] usingFields) {
        this.usingFields = usingFields;
    }

    public SignatureTemplateField[] getSystemSettingFields() {
        return this.systemSettingFields;
    }

    public void setSystemSettingFields(SignatureTemplateField[] systemSettingFields) {
        this.systemSettingFields = systemSettingFields;
    }

    public static class Builder {
        /**
         * 模版内容list
         * <p> 示例值：
         */
        private SignatureTemplateContentItem[] contents;
        /**
         * 自定义字段列表
         * <p> 示例值：
         */
        private SignatureTemplateCustomField[] customFields;
        /**
         * 筛选条件列表
         * <p> 示例值：
         */
        private SignatureTemplateFilter[] filterFields;
        /**
         * 模板公共字段信息列表
         * <p> 示例值：
         */
        private SignatureTemplateCommonFieldInfo[] usingFields;
        /**
         * 系统设置字段列表
         * <p> 示例值：
         */
        private SignatureTemplateField[] systemSettingFields;

        /**
         * 模版内容list
         * <p> 示例值：
         *
         * @param contents
         * @return
         */
        public Builder contents(SignatureTemplateContentItem[] contents) {
            this.contents = contents;
            return this;
        }


        /**
         * 自定义字段列表
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(SignatureTemplateCustomField[] customFields) {
            this.customFields = customFields;
            return this;
        }


        /**
         * 筛选条件列表
         * <p> 示例值：
         *
         * @param filterFields
         * @return
         */
        public Builder filterFields(SignatureTemplateFilter[] filterFields) {
            this.filterFields = filterFields;
            return this;
        }


        /**
         * 模板公共字段信息列表
         * <p> 示例值：
         *
         * @param usingFields
         * @return
         */
        public Builder usingFields(SignatureTemplateCommonFieldInfo[] usingFields) {
            this.usingFields = usingFields;
            return this;
        }


        /**
         * 系统设置字段列表
         * <p> 示例值：
         *
         * @param systemSettingFields
         * @return
         */
        public Builder systemSettingFields(SignatureTemplateField[] systemSettingFields) {
            this.systemSettingFields = systemSettingFields;
            return this;
        }


        public SignatureTemplateContentInfo build() {
            return new SignatureTemplateContentInfo(this);
        }
    }
}
