package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class CardAction extends BaseEventV2 {
    @SerializedName("event")
    private CardActionData event;

    public CardActionData getEvent() {
        return event;
    }

    public void setEvent(CardActionData event) {
        this.event = event;
    }
}
