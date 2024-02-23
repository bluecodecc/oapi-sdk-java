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

public class EventBriefInfoAi {
    /**
     * 日程ID
     * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
     */
    @SerializedName("event_id")
    private String eventId;
    /**
     * 日程名称
     * <p> 示例值：会议
     */
    @SerializedName("summary")
    private String summary;
    /**
     * 日程开始时间
     * <p> 示例值：2022-10-01 10:00:00
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 日程结束时间
     * <p> 示例值：2022-10-01 11:00:00
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 日程链接
     * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
     */
    @SerializedName("app_link")
    private String appLink;
    /**
     * 日程组织者
     * <p> 示例值：
     */
    @SerializedName("organizer")
    private EventOrganizer organizer;

    // builder 开始
    public EventBriefInfoAi() {
    }

    public EventBriefInfoAi(Builder builder) {
        /**
         * 日程ID
         * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
         */
        this.eventId = builder.eventId;
        /**
         * 日程名称
         * <p> 示例值：会议
         */
        this.summary = builder.summary;
        /**
         * 日程开始时间
         * <p> 示例值：2022-10-01 10:00:00
         */
        this.startTime = builder.startTime;
        /**
         * 日程结束时间
         * <p> 示例值：2022-10-01 11:00:00
         */
        this.endTime = builder.endTime;
        /**
         * 日程链接
         * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
         */
        this.appLink = builder.appLink;
        /**
         * 日程组织者
         * <p> 示例值：
         */
        this.organizer = builder.organizer;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getAppLink() {
        return this.appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public EventOrganizer getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(EventOrganizer organizer) {
        this.organizer = organizer;
    }

    public static class Builder {
        /**
         * 日程ID
         * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
         */
        private String eventId;
        /**
         * 日程名称
         * <p> 示例值：会议
         */
        private String summary;
        /**
         * 日程开始时间
         * <p> 示例值：2022-10-01 10:00:00
         */
        private String startTime;
        /**
         * 日程结束时间
         * <p> 示例值：2022-10-01 11:00:00
         */
        private String endTime;
        /**
         * 日程链接
         * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
         */
        private String appLink;
        /**
         * 日程组织者
         * <p> 示例值：
         */
        private EventOrganizer organizer;

        /**
         * 日程ID
         * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
         *
         * @param eventId
         * @return
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }


        /**
         * 日程名称
         * <p> 示例值：会议
         *
         * @param summary
         * @return
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }


        /**
         * 日程开始时间
         * <p> 示例值：2022-10-01 10:00:00
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 日程结束时间
         * <p> 示例值：2022-10-01 11:00:00
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 日程链接
         * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
         *
         * @param appLink
         * @return
         */
        public Builder appLink(String appLink) {
            this.appLink = appLink;
            return this;
        }


        /**
         * 日程组织者
         * <p> 示例值：
         *
         * @param organizer
         * @return
         */
        public Builder organizer(EventOrganizer organizer) {
            this.organizer = organizer;
            return this;
        }


        public EventBriefInfoAi build() {
            return new EventBriefInfoAi(this);
        }
    }
}