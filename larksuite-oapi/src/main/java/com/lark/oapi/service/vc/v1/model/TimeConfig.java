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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class TimeConfig {
    /**
     * 预定时间开关：0 代表关闭，1 代表开启
     * <p> 示例值：1
     */
    @SerializedName("time_switch")
    private Integer timeSwitch;
    /**
     * 最早可提前 ; days_in_advance 预定会议室（单位：天，取值范围[1-730]）;<b>说明</b>：不填写时，默认更新为 365
     * <p> 示例值：30
     */
    @SerializedName("days_in_advance")
    private Integer daysInAdvance;
    /**
     * 开放当天可于 ; opening_hour 开始预定（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时默认更新为 ; 28800 ;2.  如果填写的值不是 60 ; 的倍数，则自动会更新为离其最近的 60 整数倍的值。
     * <p> 示例值：27900
     */
    @SerializedName("opening_hour")
    private String openingHour;
    /**
     * 每日可预定时间范围的开始时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 0 ，此时填写的  end_time 不得小于 30。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少超过 ; start_time 30 。;3.  如果填写的值不是 60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
     * <p> 示例值：0
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 每日可预定时间范围结束时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 86400 ，此时填写的; start_time 不得大于等于 86370 。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少要超过;  start_time 30。;3.  如果填写的值不是  60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
     * <p> 示例值：86400
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 单次会议室可预定时长上限（单位：小时，取值范围[1,99]）;<b>说明</b>：不填写时默认更新为 2
     * <p> 示例值：24
     */
    @SerializedName("max_duration")
    private Integer maxDuration;

    // builder 开始
    public TimeConfig() {
    }

    public TimeConfig(Builder builder) {
        /**
         * 预定时间开关：0 代表关闭，1 代表开启
         * <p> 示例值：1
         */
        this.timeSwitch = builder.timeSwitch;
        /**
         * 最早可提前 ; days_in_advance 预定会议室（单位：天，取值范围[1-730]）;<b>说明</b>：不填写时，默认更新为 365
         * <p> 示例值：30
         */
        this.daysInAdvance = builder.daysInAdvance;
        /**
         * 开放当天可于 ; opening_hour 开始预定（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时默认更新为 ; 28800 ;2.  如果填写的值不是 60 ; 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：27900
         */
        this.openingHour = builder.openingHour;
        /**
         * 每日可预定时间范围的开始时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 0 ，此时填写的  end_time 不得小于 30。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少超过 ; start_time 30 。;3.  如果填写的值不是 60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：0
         */
        this.startTime = builder.startTime;
        /**
         * 每日可预定时间范围结束时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 86400 ，此时填写的; start_time 不得大于等于 86370 。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少要超过;  start_time 30。;3.  如果填写的值不是  60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：86400
         */
        this.endTime = builder.endTime;
        /**
         * 单次会议室可预定时长上限（单位：小时，取值范围[1,99]）;<b>说明</b>：不填写时默认更新为 2
         * <p> 示例值：24
         */
        this.maxDuration = builder.maxDuration;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getTimeSwitch() {
        return this.timeSwitch;
    }

    public void setTimeSwitch(Integer timeSwitch) {
        this.timeSwitch = timeSwitch;
    }

    public Integer getDaysInAdvance() {
        return this.daysInAdvance;
    }

    public void setDaysInAdvance(Integer daysInAdvance) {
        this.daysInAdvance = daysInAdvance;
    }

    public String getOpeningHour() {
        return this.openingHour;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public static class Builder {
        /**
         * 预定时间开关：0 代表关闭，1 代表开启
         * <p> 示例值：1
         */
        private Integer timeSwitch;
        /**
         * 最早可提前 ; days_in_advance 预定会议室（单位：天，取值范围[1-730]）;<b>说明</b>：不填写时，默认更新为 365
         * <p> 示例值：30
         */
        private Integer daysInAdvance;
        /**
         * 开放当天可于 ; opening_hour 开始预定（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时默认更新为 ; 28800 ;2.  如果填写的值不是 60 ; 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：27900
         */
        private String openingHour;
        /**
         * 每日可预定时间范围的开始时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 0 ，此时填写的  end_time 不得小于 30。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少超过 ; start_time 30 。;3.  如果填写的值不是 60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：0
         */
        private String startTime;
        /**
         * 每日可预定时间范围结束时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 86400 ，此时填写的; start_time 不得大于等于 86370 。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少要超过;  start_time 30。;3.  如果填写的值不是  60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：86400
         */
        private String endTime;
        /**
         * 单次会议室可预定时长上限（单位：小时，取值范围[1,99]）;<b>说明</b>：不填写时默认更新为 2
         * <p> 示例值：24
         */
        private Integer maxDuration;

        /**
         * 预定时间开关：0 代表关闭，1 代表开启
         * <p> 示例值：1
         *
         * @param timeSwitch
         * @return
         */
        public Builder timeSwitch(Integer timeSwitch) {
            this.timeSwitch = timeSwitch;
            return this;
        }


        /**
         * 最早可提前 ; days_in_advance 预定会议室（单位：天，取值范围[1-730]）;<b>说明</b>：不填写时，默认更新为 365
         * <p> 示例值：30
         *
         * @param daysInAdvance
         * @return
         */
        public Builder daysInAdvance(Integer daysInAdvance) {
            this.daysInAdvance = daysInAdvance;
            return this;
        }


        /**
         * 开放当天可于 ; opening_hour 开始预定（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时默认更新为 ; 28800 ;2.  如果填写的值不是 60 ; 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：27900
         *
         * @param openingHour
         * @return
         */
        public Builder openingHour(String openingHour) {
            this.openingHour = openingHour;
            return this;
        }


        /**
         * 每日可预定时间范围的开始时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 0 ，此时填写的  end_time 不得小于 30。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少超过 ; start_time 30 。;3.  如果填写的值不是 60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：0
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 每日可预定时间范围结束时间（单位：秒，取值范围[0,86400]）;<b>说明</b>：;1.  不填写时，默认更新为 86400 ，此时填写的; start_time 不得大于等于 86370 。;2.  当 start_time 与;  end_time 均填写时，; end_time 至少要超过;  start_time 30。;3.  如果填写的值不是  60 的倍数，则自动会更新为离其最近的 60 整数倍的值。
         * <p> 示例值：86400
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 单次会议室可预定时长上限（单位：小时，取值范围[1,99]）;<b>说明</b>：不填写时默认更新为 2
         * <p> 示例值：24
         *
         * @param maxDuration
         * @return
         */
        public Builder maxDuration(Integer maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }


        public TimeConfig build() {
            return new TimeConfig(this);
        }
    }
}
