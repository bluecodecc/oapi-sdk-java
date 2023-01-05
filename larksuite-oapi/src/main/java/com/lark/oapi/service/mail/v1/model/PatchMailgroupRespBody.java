// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class PatchMailgroupRespBody {
    /**
     * The unique ID of a mail group
     * <p> 示例值：xxxxxxxxxxxxxxx
     */
    @SerializedName("mailgroup_id")
    private String mailgroupId;
    /**
     * The mail group's email address
     * <p> 示例值：test_mail_group@xxx.xx
     */
    @SerializedName("email")
    private String email;
    /**
     * The mail group's display name
     * <p> 示例值：test mail group
     */
    @SerializedName("name")
    private String name;
    /**
     * The mail group's description
     * <p> 示例值：mail group for testing
     */
    @SerializedName("description")
    private String description;
    /**
     * The number of mail group's direct members
     * <p> 示例值：10
     */
    @SerializedName("direct_members_count")
    private String directMembersCount;
    /**
     * Value is true if this mail group has external member
     * <p> 示例值：true
     */
    @SerializedName("include_external_member")
    private Boolean includeExternalMember;
    /**
     * Value is true if all company members are in this mail group
     * <p> 示例值：false
     */
    @SerializedName("include_all_company_member")
    private Boolean includeAllCompanyMember;
    /**
     * Who can send mail to this mail group. Possible values are:;- ANYONE: Any Internet user can send mail to this mail group;- ALL_INTERNAL_USERS: Anyone in the team can send mail to this mail group;- ALL_GROUP_MEMBERS: Any group member can send mail to this mail group;- CUSTOM_MEMBERS: Only custom members can send mail to this mail group, define in mailgroup.permission_members resoure
     * <p> 示例值：ALL_INTERNAL_USERS
     */
    @SerializedName("who_can_send_mail")
    private String whoCanSendMail;

    public String getMailgroupId() {
        return this.mailgroupId;
    }

    public void setMailgroupId(String mailgroupId) {
        this.mailgroupId = mailgroupId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDirectMembersCount() {
        return this.directMembersCount;
    }

    public void setDirectMembersCount(String directMembersCount) {
        this.directMembersCount = directMembersCount;
    }

    public Boolean getIncludeExternalMember() {
        return this.includeExternalMember;
    }

    public void setIncludeExternalMember(Boolean includeExternalMember) {
        this.includeExternalMember = includeExternalMember;
    }

    public Boolean getIncludeAllCompanyMember() {
        return this.includeAllCompanyMember;
    }

    public void setIncludeAllCompanyMember(Boolean includeAllCompanyMember) {
        this.includeAllCompanyMember = includeAllCompanyMember;
    }

    public String getWhoCanSendMail() {
        return this.whoCanSendMail;
    }

    public void setWhoCanSendMail(String whoCanSendMail) {
        this.whoCanSendMail = whoCanSendMail;
    }

}
