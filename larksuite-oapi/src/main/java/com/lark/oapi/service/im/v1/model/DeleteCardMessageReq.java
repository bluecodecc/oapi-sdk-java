package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.annotation.Body;

public class DeleteCardMessageReq
{
    @Body
    private DeleteCardMessageReqBody body;

    public DeleteCardMessageReqBody getBody()
    {
        return body;
    }

    public void setBody(DeleteCardMessageReqBody body)
    {
        this.body = body;
    }
}
