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

public class Coordinate {
    /**
     * 经度
     * <p> 示例值：
     */
    @SerializedName("longitude")
    private Double longitude;
    /**
     * 纬度
     * <p> 示例值：
     */
    @SerializedName("latitude")
    private Double latitude;
    /**
     * 精度
     * <p> 示例值：
     */
    @SerializedName("accuracy")
    private Double accuracy;

    // builder 开始
    public Coordinate() {
    }

    public Coordinate(Builder builder) {
        /**
         * 经度
         * <p> 示例值：
         */
        this.longitude = builder.longitude;
        /**
         * 纬度
         * <p> 示例值：
         */
        this.latitude = builder.latitude;
        /**
         * 精度
         * <p> 示例值：
         */
        this.accuracy = builder.accuracy;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public static class Builder {
        /**
         * 经度
         * <p> 示例值：
         */
        private Double longitude;
        /**
         * 纬度
         * <p> 示例值：
         */
        private Double latitude;
        /**
         * 精度
         * <p> 示例值：
         */
        private Double accuracy;

        /**
         * 经度
         * <p> 示例值：
         *
         * @param longitude
         * @return
         */
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }


        /**
         * 纬度
         * <p> 示例值：
         *
         * @param latitude
         * @return
         */
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }


        /**
         * 精度
         * <p> 示例值：
         *
         * @param accuracy
         * @return
         */
        public Builder accuracy(Double accuracy) {
            this.accuracy = accuracy;
            return this;
        }


        public Coordinate build() {
            return new Coordinate(this);
        }
    }
}
