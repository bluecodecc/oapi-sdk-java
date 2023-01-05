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

public class FreePunchCfg {
    /**
     * 自由班制打卡开始时间
     * <p> 示例值：7:00
     */
    @SerializedName("free_start_time")
    private String freeStartTime;
    /**
     * 自由班制打卡结束时间
     * <p> 示例值：18:00
     */
    @SerializedName("free_end_time")
    private String freeEndTime;
    /**
     * 打卡的时间，为 7 位数字，每一位依次代表周一到周日，0 为不上班，1 为上班
     * <p> 示例值：1111100
     */
    @SerializedName("punch_day")
    private Integer punchDay;
    /**
     * 工作日不打卡是否记为缺卡
     * <p> 示例值：true
     */
    @SerializedName("work_day_no_punch_as_lack")
    private Boolean workDayNoPunchAsLack;

    // builder 开始
    public FreePunchCfg() {
    }

    public FreePunchCfg(Builder builder) {
        /**
         * 自由班制打卡开始时间
         * <p> 示例值：7:00
         */
        this.freeStartTime = builder.freeStartTime;
        /**
         * 自由班制打卡结束时间
         * <p> 示例值：18:00
         */
        this.freeEndTime = builder.freeEndTime;
        /**
         * 打卡的时间，为 7 位数字，每一位依次代表周一到周日，0 为不上班，1 为上班
         * <p> 示例值：1111100
         */
        this.punchDay = builder.punchDay;
        /**
         * 工作日不打卡是否记为缺卡
         * <p> 示例值：true
         */
        this.workDayNoPunchAsLack = builder.workDayNoPunchAsLack;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFreeStartTime() {
        return this.freeStartTime;
    }

    public void setFreeStartTime(String freeStartTime) {
        this.freeStartTime = freeStartTime;
    }

    public String getFreeEndTime() {
        return this.freeEndTime;
    }

    public void setFreeEndTime(String freeEndTime) {
        this.freeEndTime = freeEndTime;
    }

    public Integer getPunchDay() {
        return this.punchDay;
    }

    public void setPunchDay(Integer punchDay) {
        this.punchDay = punchDay;
    }

    public Boolean getWorkDayNoPunchAsLack() {
        return this.workDayNoPunchAsLack;
    }

    public void setWorkDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
        this.workDayNoPunchAsLack = workDayNoPunchAsLack;
    }

    public static class Builder {
        /**
         * 自由班制打卡开始时间
         * <p> 示例值：7:00
         */
        private String freeStartTime;
        /**
         * 自由班制打卡结束时间
         * <p> 示例值：18:00
         */
        private String freeEndTime;
        /**
         * 打卡的时间，为 7 位数字，每一位依次代表周一到周日，0 为不上班，1 为上班
         * <p> 示例值：1111100
         */
        private Integer punchDay;
        /**
         * 工作日不打卡是否记为缺卡
         * <p> 示例值：true
         */
        private Boolean workDayNoPunchAsLack;

        /**
         * 自由班制打卡开始时间
         * <p> 示例值：7:00
         *
         * @param freeStartTime
         * @return
         */
        public Builder freeStartTime(String freeStartTime) {
            this.freeStartTime = freeStartTime;
            return this;
        }


        /**
         * 自由班制打卡结束时间
         * <p> 示例值：18:00
         *
         * @param freeEndTime
         * @return
         */
        public Builder freeEndTime(String freeEndTime) {
            this.freeEndTime = freeEndTime;
            return this;
        }


        /**
         * 打卡的时间，为 7 位数字，每一位依次代表周一到周日，0 为不上班，1 为上班
         * <p> 示例值：1111100
         *
         * @param punchDay
         * @return
         */
        public Builder punchDay(Integer punchDay) {
            this.punchDay = punchDay;
            return this;
        }


        /**
         * 工作日不打卡是否记为缺卡
         * <p> 示例值：true
         *
         * @param workDayNoPunchAsLack
         * @return
         */
        public Builder workDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
            this.workDayNoPunchAsLack = workDayNoPunchAsLack;
            return this;
        }


        public FreePunchCfg build() {
            return new FreePunchCfg(this);
        }
    }
}
