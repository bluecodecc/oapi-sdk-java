// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

import java.util.Map;

public class CalendarAclCreatedEvent extends BaseEventV2{
    @SerializedName("event")
    private CalendarAclCreatedEventData event;

    public CalendarAclCreatedEventData getEvent() {
        return this.event;
    }

    public void setEvent(CalendarAclCreatedEventData event) {
        this.event = event;
    }

}
