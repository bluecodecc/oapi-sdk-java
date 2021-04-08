// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class NotificationOption {
    @SerializedName("channels")
    private String[] channels;
    @SerializedName("language")
    private String language;

    public String[] getChannels() {
        return this.channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
