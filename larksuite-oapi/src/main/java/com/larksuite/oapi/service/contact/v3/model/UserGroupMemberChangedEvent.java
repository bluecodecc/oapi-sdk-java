// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

import java.util.Map;

public class UserGroupMemberChangedEvent extends BaseEventV2{
    @SerializedName("event")
    private UserGroupMemberChangedEventData event;

    public UserGroupMemberChangedEventData getEvent() {
        return this.event;
    }

    public void setEvent(UserGroupMemberChangedEventData event) {
        this.event = event;
    }

}
