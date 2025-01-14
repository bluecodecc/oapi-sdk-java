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

public class SignatureEnumInfo {
    /**
     * <p> 示例值：
     */
    @SerializedName("label")
    private SignatureEnumInfoLabel label;
    /**
     * 主数据apiname
     * <p> 示例值：status
     */
    @SerializedName("apiname")
    private String apiname;
    /**
     * 是否启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;

    // builder 开始
    public SignatureEnumInfo() {
    }

    public SignatureEnumInfo(Builder builder) {
        /**
         *
         * <p> 示例值：
         */
        this.label = builder.label;
        /**
         * 主数据apiname
         * <p> 示例值：status
         */
        this.apiname = builder.apiname;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        this.active = builder.active;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SignatureEnumInfoLabel getLabel() {
        return this.label;
    }

    public void setLabel(SignatureEnumInfoLabel label) {
        this.label = label;
    }

    public String getApiname() {
        return this.apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public static class Builder {
        /**
         * <p> 示例值：
         */
        private SignatureEnumInfoLabel label;
        /**
         * 主数据apiname
         * <p> 示例值：status
         */
        private String apiname;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        private Boolean active;

        /**
         * <p> 示例值：
         *
         * @param label
         * @return
         */
        public Builder label(SignatureEnumInfoLabel label) {
            this.label = label;
            return this;
        }


        /**
         * 主数据apiname
         * <p> 示例值：status
         *
         * @param apiname
         * @return
         */
        public Builder apiname(String apiname) {
            this.apiname = apiname;
            return this;
        }


        /**
         * 是否启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        public SignatureEnumInfo build() {
            return new SignatureEnumInfo(this);
        }
    }
}
