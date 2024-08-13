package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.annotation.Body;

public class CreateCardMessageReq
{

    @Body
    private CreateCardMessageReqBody body;

    public CreateCardMessageReq()
    {
    }

    public CreateCardMessageReqBody getBody()
    {
        return body;
    }

    public void setBody(CreateCardMessageReqBody body)
    {
        this.body = body;
    }
}
