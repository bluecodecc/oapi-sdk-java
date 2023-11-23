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

package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;

public class OpeningTimePeriodExternal {
    /**
     * 起始时间
     * <p> 示例值：1200
     */
    @SerializedName("start_hhmm")
    private Integer startHhmm;
    /**
     * 结束时间
     * <p> 示例值：1400
     */
    @SerializedName("end_hhmm")
    private Integer endHhmm;

    // builder 开始
    public OpeningTimePeriodExternal() {
    }

    public OpeningTimePeriodExternal(Builder builder) {
        /**
         * 起始时间
         * <p> 示例值：1200
         */
        this.startHhmm = builder.startHhmm;
        /**
         * 结束时间
         * <p> 示例值：1400
         */
        this.endHhmm = builder.endHhmm;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getStartHhmm() {
        return this.startHhmm;
    }

    public void setStartHhmm(Integer startHhmm) {
        this.startHhmm = startHhmm;
    }

    public Integer getEndHhmm() {
        return this.endHhmm;
    }

    public void setEndHhmm(Integer endHhmm) {
        this.endHhmm = endHhmm;
    }

    public static class Builder {
        /**
         * 起始时间
         * <p> 示例值：1200
         */
        private Integer startHhmm;
        /**
         * 结束时间
         * <p> 示例值：1400
         */
        private Integer endHhmm;

        /**
         * 起始时间
         * <p> 示例值：1200
         *
         * @param startHhmm
         * @return
         */
        public Builder startHhmm(Integer startHhmm) {
            this.startHhmm = startHhmm;
            return this;
        }


        /**
         * 结束时间
         * <p> 示例值：1400
         *
         * @param endHhmm
         * @return
         */
        public Builder endHhmm(Integer endHhmm) {
            this.endHhmm = endHhmm;
            return this;
        }


        public OpeningTimePeriodExternal build() {
            return new OpeningTimePeriodExternal(this);
        }
    }
}