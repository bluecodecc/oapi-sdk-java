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

import com.google.gson.annotations.SerializedName;

public class CustomName {
    /**
     * 中文
     * <p> 示例值：自定义姓名
     */
    @SerializedName("zh_cn")
    private String zhCn;
    /**
     * 英文
     * <p> 示例值：Custom Name
     */
    @SerializedName("en_us")
    private String enUs;

    // builder 开始
    public CustomName() {
    }

    public CustomName(Builder builder) {
        /**
         * 中文
         * <p> 示例值：自定义姓名
         */
        this.zhCn = builder.zhCn;
        /**
         * 英文
         * <p> 示例值：Custom Name
         */
        this.enUs = builder.enUs;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getZhCn() {
        return this.zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public String getEnUs() {
        return this.enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public static class Builder {
        /**
         * 中文
         * <p> 示例值：自定义姓名
         */
        private String zhCn;
        /**
         * 英文
         * <p> 示例值：Custom Name
         */
        private String enUs;

        /**
         * 中文
         * <p> 示例值：自定义姓名
         *
         * @param zhCn
         * @return
         */
        public Builder zhCn(String zhCn) {
            this.zhCn = zhCn;
            return this;
        }


        /**
         * 英文
         * <p> 示例值：Custom Name
         *
         * @param enUs
         * @return
         */
        public Builder enUs(String enUs) {
            this.enUs = enUs;
            return this;
        }


        public CustomName build() {
            return new CustomName(this);
        }
    }
}