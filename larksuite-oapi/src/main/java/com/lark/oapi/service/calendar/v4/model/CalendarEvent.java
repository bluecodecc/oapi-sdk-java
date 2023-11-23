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

public class CalendarEvent {
    /**
     * 日程ID。参见[日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
     * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
     */
    @SerializedName("event_id")
    private String eventId;
    /**
     * 日程组织者日历ID。参见[日历ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
     * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
     */
    @SerializedName("organizer_calendar_id")
    private String organizerCalendarId;
    /**
     * 日程标题
     * <p> 示例值：日程标题
     */
    @SerializedName("summary")
    private String summary;
    /**
     * 日程描述；目前不支持编辑富文本描述，如果日程描述通过客户端编辑过，更新描述会导致富文本格式丢失
     * <p> 示例值：日程描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 更新日程是否给日程参与人发送bot通知，默认为true
     * <p> 示例值：false
     */
    @SerializedName("need_notification")
    private Boolean needNotification;
    /**
     * 日程开始时间
     * <p> 示例值：
     */
    @SerializedName("start_time")
    private TimeInfo startTime;
    /**
     * 日程结束时间
     * <p> 示例值：
     */
    @SerializedName("end_time")
    private TimeInfo endTime;
    /**
     * 视频会议信息。
     * <p> 示例值：
     */
    @SerializedName("vchat")
    private Vchat vchat;
    /**
     * 日程公开范围，新建日程默认为Default；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
     * <p> 示例值：default
     */
    @SerializedName("visibility")
    private String visibility;
    /**
     * 参与人权限
     * <p> 示例值：can_see_others
     */
    @SerializedName("attendee_ability")
    private String attendeeAbility;
    /**
     * 日程占用的忙闲状态，新建日程默认为Busy；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
     * <p> 示例值：busy
     */
    @SerializedName("free_busy_status")
    private String freeBusyStatus;
    /**
     * 日程地点
     * <p> 示例值：
     */
    @SerializedName("location")
    private EventLocation location;
    /**
     * 日程颜色，颜色RGB值的int32表示。仅对当前身份生效；客户端展示时会映射到色板上最接近的一种颜色；值为0或-1时默认跟随日历颜色。
     * <p> 示例值：-1
     */
    @SerializedName("color")
    private Integer color;
    /**
     * 日程提醒列表
     * <p> 示例值：
     */
    @SerializedName("reminders")
    private Reminder[] reminders;
    /**
     * 重复日程的重复性规则；参考[rfc5545](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10)；;- 不支持COUNT和UNTIL同时出现；;- 预定会议室重复日程长度不得超过两年。
     * <p> 示例值：FREQ=DAILY;INTERVAL=1
     */
    @SerializedName("recurrence")
    private String recurrence;
    /**
     * 日程状态
     * <p> 示例值：confirmed
     */
    @SerializedName("status")
    private String status;
    /**
     * 日程是否是一个重复日程的例外日程
     * <p> 示例值：false
     */
    @SerializedName("is_exception")
    private Boolean isException;
    /**
     * 例外日程的原重复日程的event_id
     * <p> 示例值：1cd45aaa-fa70-4195-80b7-c93b2e208f45
     */
    @SerializedName("recurring_event_id")
    private String recurringEventId;
    /**
     * 日程的创建时间（秒级时间戳）
     * <p> 示例值：1602504000
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 日程自定义信息；控制日程详情页的ui展示。
     * <p> 示例值：
     */
    @SerializedName("schemas")
    private Schema[] schemas;
    /**
     * 日程组织者信息
     * <p> 示例值：
     */
    @SerializedName("event_organizer")
    private EventOrganizer eventOrganizer;
    /**
     * 日程的app_link,跳转到具体的某个日程
     * <p> 示例值：https://applink.larkoffice.com/client/calendar/event/detail?calendarId=7039673579105026066&key=aeac9c56-aeb1-4179-a21b-02f278f59048&originalTime=0&startTime=1700496000
     */
    @SerializedName("app_link")
    private String appLink;

    // builder 开始
    public CalendarEvent() {
    }

    public CalendarEvent(Builder builder) {
        /**
         * 日程ID。参见[日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
         * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
         */
        this.eventId = builder.eventId;
        /**
         * 日程组织者日历ID。参见[日历ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
         * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
         */
        this.organizerCalendarId = builder.organizerCalendarId;
        /**
         * 日程标题
         * <p> 示例值：日程标题
         */
        this.summary = builder.summary;
        /**
         * 日程描述；目前不支持编辑富文本描述，如果日程描述通过客户端编辑过，更新描述会导致富文本格式丢失
         * <p> 示例值：日程描述
         */
        this.description = builder.description;
        /**
         * 更新日程是否给日程参与人发送bot通知，默认为true
         * <p> 示例值：false
         */
        this.needNotification = builder.needNotification;
        /**
         * 日程开始时间
         * <p> 示例值：
         */
        this.startTime = builder.startTime;
        /**
         * 日程结束时间
         * <p> 示例值：
         */
        this.endTime = builder.endTime;
        /**
         * 视频会议信息。
         * <p> 示例值：
         */
        this.vchat = builder.vchat;
        /**
         * 日程公开范围，新建日程默认为Default；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：default
         */
        this.visibility = builder.visibility;
        /**
         * 参与人权限
         * <p> 示例值：can_see_others
         */
        this.attendeeAbility = builder.attendeeAbility;
        /**
         * 日程占用的忙闲状态，新建日程默认为Busy；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：busy
         */
        this.freeBusyStatus = builder.freeBusyStatus;
        /**
         * 日程地点
         * <p> 示例值：
         */
        this.location = builder.location;
        /**
         * 日程颜色，颜色RGB值的int32表示。仅对当前身份生效；客户端展示时会映射到色板上最接近的一种颜色；值为0或-1时默认跟随日历颜色。
         * <p> 示例值：-1
         */
        this.color = builder.color;
        /**
         * 日程提醒列表
         * <p> 示例值：
         */
        this.reminders = builder.reminders;
        /**
         * 重复日程的重复性规则；参考[rfc5545](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10)；;- 不支持COUNT和UNTIL同时出现；;- 预定会议室重复日程长度不得超过两年。
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         */
        this.recurrence = builder.recurrence;
        /**
         * 日程状态
         * <p> 示例值：confirmed
         */
        this.status = builder.status;
        /**
         * 日程是否是一个重复日程的例外日程
         * <p> 示例值：false
         */
        this.isException = builder.isException;
        /**
         * 例外日程的原重复日程的event_id
         * <p> 示例值：1cd45aaa-fa70-4195-80b7-c93b2e208f45
         */
        this.recurringEventId = builder.recurringEventId;
        /**
         * 日程的创建时间（秒级时间戳）
         * <p> 示例值：1602504000
         */
        this.createTime = builder.createTime;
        /**
         * 日程自定义信息；控制日程详情页的ui展示。
         * <p> 示例值：
         */
        this.schemas = builder.schemas;
        /**
         * 日程组织者信息
         * <p> 示例值：
         */
        this.eventOrganizer = builder.eventOrganizer;
        /**
         * 日程的app_link,跳转到具体的某个日程
         * <p> 示例值：https://applink.larkoffice.com/client/calendar/event/detail?calendarId=7039673579105026066&key=aeac9c56-aeb1-4179-a21b-02f278f59048&originalTime=0&startTime=1700496000
         */
        this.appLink = builder.appLink;
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

    public String getOrganizerCalendarId() {
        return this.organizerCalendarId;
    }

    public void setOrganizerCalendarId(String organizerCalendarId) {
        this.organizerCalendarId = organizerCalendarId;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNeedNotification() {
        return this.needNotification;
    }

    public void setNeedNotification(Boolean needNotification) {
        this.needNotification = needNotification;
    }

    public TimeInfo getStartTime() {
        return this.startTime;
    }

    public void setStartTime(TimeInfo startTime) {
        this.startTime = startTime;
    }

    public TimeInfo getEndTime() {
        return this.endTime;
    }

    public void setEndTime(TimeInfo endTime) {
        this.endTime = endTime;
    }

    public Vchat getVchat() {
        return this.vchat;
    }

    public void setVchat(Vchat vchat) {
        this.vchat = vchat;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getAttendeeAbility() {
        return this.attendeeAbility;
    }

    public void setAttendeeAbility(String attendeeAbility) {
        this.attendeeAbility = attendeeAbility;
    }

    public String getFreeBusyStatus() {
        return this.freeBusyStatus;
    }

    public void setFreeBusyStatus(String freeBusyStatus) {
        this.freeBusyStatus = freeBusyStatus;
    }

    public EventLocation getLocation() {
        return this.location;
    }

    public void setLocation(EventLocation location) {
        this.location = location;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Reminder[] getReminders() {
        return this.reminders;
    }

    public void setReminders(Reminder[] reminders) {
        this.reminders = reminders;
    }

    public String getRecurrence() {
        return this.recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsException() {
        return this.isException;
    }

    public void setIsException(Boolean isException) {
        this.isException = isException;
    }

    public String getRecurringEventId() {
        return this.recurringEventId;
    }

    public void setRecurringEventId(String recurringEventId) {
        this.recurringEventId = recurringEventId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Schema[] getSchemas() {
        return this.schemas;
    }

    public void setSchemas(Schema[] schemas) {
        this.schemas = schemas;
    }

    public EventOrganizer getEventOrganizer() {
        return this.eventOrganizer;
    }

    public void setEventOrganizer(EventOrganizer eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }

    public String getAppLink() {
        return this.appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public static class Builder {
        /**
         * 日程ID。参见[日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
         * <p> 示例值：00592a0e-7edf-4678-bc9d-1b77383ef08e_0
         */
        private String eventId;
        /**
         * 日程组织者日历ID。参见[日历ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
         * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
         */
        private String organizerCalendarId;
        /**
         * 日程标题
         * <p> 示例值：日程标题
         */
        private String summary;
        /**
         * 日程描述；目前不支持编辑富文本描述，如果日程描述通过客户端编辑过，更新描述会导致富文本格式丢失
         * <p> 示例值：日程描述
         */
        private String description;
        /**
         * 更新日程是否给日程参与人发送bot通知，默认为true
         * <p> 示例值：false
         */
        private Boolean needNotification;
        /**
         * 日程开始时间
         * <p> 示例值：
         */
        private TimeInfo startTime;
        /**
         * 日程结束时间
         * <p> 示例值：
         */
        private TimeInfo endTime;
        /**
         * 视频会议信息。
         * <p> 示例值：
         */
        private Vchat vchat;
        /**
         * 日程公开范围，新建日程默认为Default；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：default
         */
        private String visibility;
        /**
         * 参与人权限
         * <p> 示例值：can_see_others
         */
        private String attendeeAbility;
        /**
         * 日程占用的忙闲状态，新建日程默认为Busy；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：busy
         */
        private String freeBusyStatus;
        /**
         * 日程地点
         * <p> 示例值：
         */
        private EventLocation location;
        /**
         * 日程颜色，颜色RGB值的int32表示。仅对当前身份生效；客户端展示时会映射到色板上最接近的一种颜色；值为0或-1时默认跟随日历颜色。
         * <p> 示例值：-1
         */
        private Integer color;
        /**
         * 日程提醒列表
         * <p> 示例值：
         */
        private Reminder[] reminders;
        /**
         * 重复日程的重复性规则；参考[rfc5545](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10)；;- 不支持COUNT和UNTIL同时出现；;- 预定会议室重复日程长度不得超过两年。
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         */
        private String recurrence;
        /**
         * 日程状态
         * <p> 示例值：confirmed
         */
        private String status;
        /**
         * 日程是否是一个重复日程的例外日程
         * <p> 示例值：false
         */
        private Boolean isException;
        /**
         * 例外日程的原重复日程的event_id
         * <p> 示例值：1cd45aaa-fa70-4195-80b7-c93b2e208f45
         */
        private String recurringEventId;
        /**
         * 日程的创建时间（秒级时间戳）
         * <p> 示例值：1602504000
         */
        private String createTime;
        /**
         * 日程自定义信息；控制日程详情页的ui展示。
         * <p> 示例值：
         */
        private Schema[] schemas;
        /**
         * 日程组织者信息
         * <p> 示例值：
         */
        private EventOrganizer eventOrganizer;
        /**
         * 日程的app_link,跳转到具体的某个日程
         * <p> 示例值：https://applink.larkoffice.com/client/calendar/event/detail?calendarId=7039673579105026066&key=aeac9c56-aeb1-4179-a21b-02f278f59048&originalTime=0&startTime=1700496000
         */
        private String appLink;

        /**
         * 日程ID。参见[日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
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
         * 日程组织者日历ID。参见[日历ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
         * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
         *
         * @param organizerCalendarId
         * @return
         */
        public Builder organizerCalendarId(String organizerCalendarId) {
            this.organizerCalendarId = organizerCalendarId;
            return this;
        }


        /**
         * 日程标题
         * <p> 示例值：日程标题
         *
         * @param summary
         * @return
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }


        /**
         * 日程描述；目前不支持编辑富文本描述，如果日程描述通过客户端编辑过，更新描述会导致富文本格式丢失
         * <p> 示例值：日程描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 更新日程是否给日程参与人发送bot通知，默认为true
         * <p> 示例值：false
         *
         * @param needNotification
         * @return
         */
        public Builder needNotification(Boolean needNotification) {
            this.needNotification = needNotification;
            return this;
        }


        /**
         * 日程开始时间
         * <p> 示例值：
         *
         * @param startTime
         * @return
         */
        public Builder startTime(TimeInfo startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 日程结束时间
         * <p> 示例值：
         *
         * @param endTime
         * @return
         */
        public Builder endTime(TimeInfo endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 视频会议信息。
         * <p> 示例值：
         *
         * @param vchat
         * @return
         */
        public Builder vchat(Vchat vchat) {
            this.vchat = vchat;
            return this;
        }


        /**
         * 日程公开范围，新建日程默认为Default；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：default
         *
         * @param visibility
         * @return
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * 日程公开范围，新建日程默认为Default；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：default
         *
         * @param visibility {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventEventVisibilityEnum}
         * @return
         */
        public Builder visibility(com.lark.oapi.service.calendar.v4.enums.CalendarEventEventVisibilityEnum visibility) {
            this.visibility = visibility.getValue();
            return this;
        }


        /**
         * 参与人权限
         * <p> 示例值：can_see_others
         *
         * @param attendeeAbility
         * @return
         */
        public Builder attendeeAbility(String attendeeAbility) {
            this.attendeeAbility = attendeeAbility;
            return this;
        }

        /**
         * 参与人权限
         * <p> 示例值：can_see_others
         *
         * @param attendeeAbility {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventEventAttendeeAbilityEnum}
         * @return
         */
        public Builder attendeeAbility(com.lark.oapi.service.calendar.v4.enums.CalendarEventEventAttendeeAbilityEnum attendeeAbility) {
            this.attendeeAbility = attendeeAbility.getValue();
            return this;
        }


        /**
         * 日程占用的忙闲状态，新建日程默认为Busy；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：busy
         *
         * @param freeBusyStatus
         * @return
         */
        public Builder freeBusyStatus(String freeBusyStatus) {
            this.freeBusyStatus = freeBusyStatus;
            return this;
        }

        /**
         * 日程占用的忙闲状态，新建日程默认为Busy；仅新建日程时对所有参与人生效，之后修改该属性仅对当前身份生效
         * <p> 示例值：busy
         *
         * @param freeBusyStatus {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventEventFreeBusyStatusEnum}
         * @return
         */
        public Builder freeBusyStatus(com.lark.oapi.service.calendar.v4.enums.CalendarEventEventFreeBusyStatusEnum freeBusyStatus) {
            this.freeBusyStatus = freeBusyStatus.getValue();
            return this;
        }


        /**
         * 日程地点
         * <p> 示例值：
         *
         * @param location
         * @return
         */
        public Builder location(EventLocation location) {
            this.location = location;
            return this;
        }


        /**
         * 日程颜色，颜色RGB值的int32表示。仅对当前身份生效；客户端展示时会映射到色板上最接近的一种颜色；值为0或-1时默认跟随日历颜色。
         * <p> 示例值：-1
         *
         * @param color
         * @return
         */
        public Builder color(Integer color) {
            this.color = color;
            return this;
        }


        /**
         * 日程提醒列表
         * <p> 示例值：
         *
         * @param reminders
         * @return
         */
        public Builder reminders(Reminder[] reminders) {
            this.reminders = reminders;
            return this;
        }


        /**
         * 重复日程的重复性规则；参考[rfc5545](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10)；;- 不支持COUNT和UNTIL同时出现；;- 预定会议室重复日程长度不得超过两年。
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         *
         * @param recurrence
         * @return
         */
        public Builder recurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }


        /**
         * 日程状态
         * <p> 示例值：confirmed
         *
         * @param status
         * @return
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 日程状态
         * <p> 示例值：confirmed
         *
         * @param status {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventEventStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.calendar.v4.enums.CalendarEventEventStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 日程是否是一个重复日程的例外日程
         * <p> 示例值：false
         *
         * @param isException
         * @return
         */
        public Builder isException(Boolean isException) {
            this.isException = isException;
            return this;
        }


        /**
         * 例外日程的原重复日程的event_id
         * <p> 示例值：1cd45aaa-fa70-4195-80b7-c93b2e208f45
         *
         * @param recurringEventId
         * @return
         */
        public Builder recurringEventId(String recurringEventId) {
            this.recurringEventId = recurringEventId;
            return this;
        }


        /**
         * 日程的创建时间（秒级时间戳）
         * <p> 示例值：1602504000
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 日程自定义信息；控制日程详情页的ui展示。
         * <p> 示例值：
         *
         * @param schemas
         * @return
         */
        public Builder schemas(Schema[] schemas) {
            this.schemas = schemas;
            return this;
        }


        /**
         * 日程组织者信息
         * <p> 示例值：
         *
         * @param eventOrganizer
         * @return
         */
        public Builder eventOrganizer(EventOrganizer eventOrganizer) {
            this.eventOrganizer = eventOrganizer;
            return this;
        }


        /**
         * 日程的app_link,跳转到具体的某个日程
         * <p> 示例值：https://applink.larkoffice.com/client/calendar/event/detail?calendarId=7039673579105026066&key=aeac9c56-aeb1-4179-a21b-02f278f59048&originalTime=0&startTime=1700496000
         *
         * @param appLink
         * @return
         */
        public Builder appLink(String appLink) {
            this.appLink = appLink;
            return this;
        }


        public CalendarEvent build() {
            return new CalendarEvent(this);
        }
    }
}
