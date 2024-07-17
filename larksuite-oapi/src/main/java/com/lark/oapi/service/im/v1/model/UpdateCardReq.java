package com.lark.oapi.service.im.v1.model;

public class UpdateCardReq {
    private String token;
    private InteractiveContent card;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InteractiveContent getCard() {
        return card;
    }

    public void setCard(InteractiveContent card) {
        this.card = card;
    }
}
