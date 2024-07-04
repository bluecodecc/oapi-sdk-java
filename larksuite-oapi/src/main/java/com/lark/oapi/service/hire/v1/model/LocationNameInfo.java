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

public class LocationNameInfo {
    /**
     * 地址中文名
     * <p> 示例值：成都
     */
    @SerializedName("zh_name")
    private String zhName;
    /**
     * 地址英文名
     * <p> 示例值：ChengDu
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 地址拼音名
     * <p> 示例值：chengdu
     */
    @SerializedName("py_name")
    private String pyName;

    // builder 开始
    public LocationNameInfo() {
    }

    public LocationNameInfo(Builder builder) {
        /**
         * 地址中文名
         * <p> 示例值：成都
         */
        this.zhName = builder.zhName;
        /**
         * 地址英文名
         * <p> 示例值：ChengDu
         */
        this.enName = builder.enName;
        /**
         * 地址拼音名
         * <p> 示例值：chengdu
         */
        this.pyName = builder.pyName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getZhName() {
        return this.zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPyName() {
        return this.pyName;
    }

    public void setPyName(String pyName) {
        this.pyName = pyName;
    }

    public static class Builder {
        /**
         * 地址中文名
         * <p> 示例值：成都
         */
        private String zhName;
        /**
         * 地址英文名
         * <p> 示例值：ChengDu
         */
        private String enName;
        /**
         * 地址拼音名
         * <p> 示例值：chengdu
         */
        private String pyName;

        /**
         * 地址中文名
         * <p> 示例值：成都
         *
         * @param zhName
         * @return
         */
        public Builder zhName(String zhName) {
            this.zhName = zhName;
            return this;
        }


        /**
         * 地址英文名
         * <p> 示例值：ChengDu
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 地址拼音名
         * <p> 示例值：chengdu
         *
         * @param pyName
         * @return
         */
        public Builder pyName(String pyName) {
            this.pyName = pyName;
            return this;
        }


        public LocationNameInfo build() {
            return new LocationNameInfo(this);
        }
    }
}