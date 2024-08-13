package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateCardMessageRespBody
{
    @SerializedName("message_id")
    private String messageId;

    public String getMessageId()
    {
        return messageId;
    }

    public void setMessageId(String messageId)
    {
        this.messageId = messageId;
    }

    public CreateCardMessageRespBody()
    {
    }
}
