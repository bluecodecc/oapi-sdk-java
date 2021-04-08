// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class CalendarAclCreatedEventData {
    @SerializedName("acl_id")
    private String aclId;
    @SerializedName("role")
    private String role;
    @SerializedName("scope")
    private AclScope scope;

    public String getAclId() {
        return this.aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AclScope getScope() {
        return this.scope;
    }

    public void setScope(AclScope scope) {
        this.scope = scope;
    }

}
