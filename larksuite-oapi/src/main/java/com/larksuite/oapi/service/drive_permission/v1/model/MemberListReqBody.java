// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive_permission.v1.model;
import com.google.gson.annotations.SerializedName;

public class MemberListReqBody {
    @SerializedName("token")
    private String token;
    @SerializedName("type")
    private String type;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
