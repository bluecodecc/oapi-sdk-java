// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class ListChat {
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("owner_id")
    private String ownerId;
    @SerializedName("owner_id_type")
    private String ownerIdType;
    @SerializedName("external")
    private Boolean external;
    @SerializedName("tenant_key")
    private String tenantKey;

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerIdType() {
        return this.ownerIdType;
    }

    public void setOwnerIdType(String ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }


}
