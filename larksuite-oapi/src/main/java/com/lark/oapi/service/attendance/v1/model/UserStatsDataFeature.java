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

public class UserStatsDataFeature {
    /**
     * 统计数据列附加属性的名称
     * <p> 示例值：Abnormal
     */
    @SerializedName("key")
    private String key;
    /**
     * 统计数据列附加属性的值
     * <p> 示例值：false
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public UserStatsDataFeature() {
    }

    public UserStatsDataFeature(Builder builder) {
        /**
         * 统计数据列附加属性的名称
         * <p> 示例值：Abnormal
         */
        this.key = builder.key;
        /**
         * 统计数据列附加属性的值
         * <p> 示例值：false
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 统计数据列附加属性的名称
         * <p> 示例值：Abnormal
         */
        private String key;
        /**
         * 统计数据列附加属性的值
         * <p> 示例值：false
         */
        private String value;

        /**
         * 统计数据列附加属性的名称
         * <p> 示例值：Abnormal
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 统计数据列附加属性的值
         * <p> 示例值：false
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public UserStatsDataFeature build() {
            return new UserStatsDataFeature(this);
        }
    }
}
