package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateCardMessageReqBody
{
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("msg_type")
    private String msgType;
    private InteractiveContent card;

    public String getOpenId()
    {
        return openId;
    }

    public void setOpenId(String openId)
    {
        this.openId = openId;
    }

    public String getMsgType()
    {
        return msgType;
    }

    public void setMsgType(String msgType)
    {
        this.msgType = msgType;
    }

    public InteractiveContent getCard()
    {
        return card;
    }

    public void setCard(InteractiveContent card)
    {
        this.card = card;
    }

    public CreateCardMessageReqBody()
    {
    }

    public String getChatId()
    {
        return chatId;
    }

    public void setChatId(String chatId)
    {
        this.chatId = chatId;
    }
}
