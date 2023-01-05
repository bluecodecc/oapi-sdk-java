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

import com.google.gson.annotations.SerializedName;

public class JobCity {
    /**
     * 工作地点城市代码
     * <p> 示例值：C20
     */
    @SerializedName("city_code")
    private String cityCode;
    /**
     * 工作地点中文名称
     * <p> 示例值：成都
     */
    @SerializedName("zh_name")
    private String zhName;
    /**
     * 工作地点英文名称
     * <p> 示例值：Chengdu
     */
    @SerializedName("en_name")
    private String enName;

    // builder 开始
    public JobCity() {
    }

    public JobCity(Builder builder) {
        /**
         * 工作地点城市代码
         * <p> 示例值：C20
         */
        this.cityCode = builder.cityCode;
        /**
         * 工作地点中文名称
         * <p> 示例值：成都
         */
        this.zhName = builder.zhName;
        /**
         * 工作地点英文名称
         * <p> 示例值：Chengdu
         */
        this.enName = builder.enName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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

    public static class Builder {
        /**
         * 工作地点城市代码
         * <p> 示例值：C20
         */
        private String cityCode;
        /**
         * 工作地点中文名称
         * <p> 示例值：成都
         */
        private String zhName;
        /**
         * 工作地点英文名称
         * <p> 示例值：Chengdu
         */
        private String enName;

        /**
         * 工作地点城市代码
         * <p> 示例值：C20
         *
         * @param cityCode
         * @return
         */
        public Builder cityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }


        /**
         * 工作地点中文名称
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
         * 工作地点英文名称
         * <p> 示例值：Chengdu
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        public JobCity build() {
            return new JobCity(this);
        }
    }
}
