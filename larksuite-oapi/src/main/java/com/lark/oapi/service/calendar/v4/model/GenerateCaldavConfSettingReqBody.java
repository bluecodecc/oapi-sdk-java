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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class GenerateCaldavConfSettingReqBody {
    /**
     * 需要同步日历的设备名，在日历中展示用来管理密码
     * <p> 示例值：iPhone
     */
    @SerializedName("device_name")
    private String deviceName;

    // builder 开始
    public GenerateCaldavConfSettingReqBody() {
    }

    public GenerateCaldavConfSettingReqBody(Builder builder) {
        /**
         * 需要同步日历的设备名，在日历中展示用来管理密码
         * <p> 示例值：iPhone
         */
        this.deviceName = builder.deviceName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public static class Builder {
        /**
         * 需要同步日历的设备名，在日历中展示用来管理密码
         * <p> 示例值：iPhone
         */
        private String deviceName;

        /**
         * 需要同步日历的设备名，在日历中展示用来管理密码
         * <p> 示例值：iPhone
         *
         * @param deviceName
         * @return
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }


        public GenerateCaldavConfSettingReqBody build() {
            return new GenerateCaldavConfSettingReqBody(this);
        }
    }
}
