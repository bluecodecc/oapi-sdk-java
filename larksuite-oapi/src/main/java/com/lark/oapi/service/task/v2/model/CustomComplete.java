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

package com.lark.oapi.service.task.v2.model;

import com.google.gson.annotations.SerializedName;

public class CustomComplete {
    /**
     * pc客户端自定义完成配置（含mac和windows）
     * <p> 示例值：
     */
    @SerializedName("pc")
    private CustomCompleteItem pc;
    /**
     * ios端的自定义完成配置
     * <p> 示例值：
     */
    @SerializedName("ios")
    private CustomCompleteItem ios;
    /**
     * android端的自定义完成配置
     * <p> 示例值：
     */
    @SerializedName("android")
    private CustomCompleteItem android;

    // builder 开始
    public CustomComplete() {
    }

    public CustomComplete(Builder builder) {
        /**
         * pc客户端自定义完成配置（含mac和windows）
         * <p> 示例值：
         */
        this.pc = builder.pc;
        /**
         * ios端的自定义完成配置
         * <p> 示例值：
         */
        this.ios = builder.ios;
        /**
         * android端的自定义完成配置
         * <p> 示例值：
         */
        this.android = builder.android;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CustomCompleteItem getPc() {
        return this.pc;
    }

    public void setPc(CustomCompleteItem pc) {
        this.pc = pc;
    }

    public CustomCompleteItem getIos() {
        return this.ios;
    }

    public void setIos(CustomCompleteItem ios) {
        this.ios = ios;
    }

    public CustomCompleteItem getAndroid() {
        return this.android;
    }

    public void setAndroid(CustomCompleteItem android) {
        this.android = android;
    }

    public static class Builder {
        /**
         * pc客户端自定义完成配置（含mac和windows）
         * <p> 示例值：
         */
        private CustomCompleteItem pc;
        /**
         * ios端的自定义完成配置
         * <p> 示例值：
         */
        private CustomCompleteItem ios;
        /**
         * android端的自定义完成配置
         * <p> 示例值：
         */
        private CustomCompleteItem android;

        /**
         * pc客户端自定义完成配置（含mac和windows）
         * <p> 示例值：
         *
         * @param pc
         * @return
         */
        public Builder pc(CustomCompleteItem pc) {
            this.pc = pc;
            return this;
        }


        /**
         * ios端的自定义完成配置
         * <p> 示例值：
         *
         * @param ios
         * @return
         */
        public Builder ios(CustomCompleteItem ios) {
            this.ios = ios;
            return this;
        }


        /**
         * android端的自定义完成配置
         * <p> 示例值：
         *
         * @param android
         * @return
         */
        public Builder android(CustomCompleteItem android) {
            this.android = android;
            return this;
        }


        public CustomComplete build() {
            return new CustomComplete(this);
        }
    }
}
