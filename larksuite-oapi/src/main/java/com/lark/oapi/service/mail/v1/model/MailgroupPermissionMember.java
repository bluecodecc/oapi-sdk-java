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

public class MailgroupPermissionMember {
    /**
     * 权限组内成员唯一标识
     * <p> 示例值：xxxxxxxxxxxxxxx
     */
    @SerializedName("permission_member_id")
    private String permissionMemberId;
    /**
     * 租户内用户的唯一标识（当成员类型是USER时有值）
     * <p> 示例值：xxxxxxxxxx
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 租户内部门的唯一标识（当成员类型是DEPARTMENT时有值）
     * <p> 示例值：xxxxxxxxxx
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 成员邮箱地址（当成员类型是MAIL_GROUP/PUBLIC_MAILBOX时有值）
     * <p> 示例值：xxx@xx.x
     */
    @SerializedName("email")
    private String email;
    /**
     * 成员类型
     * <p> 示例值：USER
     */
    @SerializedName("type")
    private String type;

    // builder 开始
    public MailgroupPermissionMember() {
    }

    public MailgroupPermissionMember(Builder builder) {
        /**
         * 权限组内成员唯一标识
         * <p> 示例值：xxxxxxxxxxxxxxx
         */
        this.permissionMemberId = builder.permissionMemberId;
        /**
         * 租户内用户的唯一标识（当成员类型是USER时有值）
         * <p> 示例值：xxxxxxxxxx
         */
        this.userId = builder.userId;
        /**
         * 租户内部门的唯一标识（当成员类型是DEPARTMENT时有值）
         * <p> 示例值：xxxxxxxxxx
         */
        this.departmentId = builder.departmentId;
        /**
         * 成员邮箱地址（当成员类型是MAIL_GROUP/PUBLIC_MAILBOX时有值）
         * <p> 示例值：xxx@xx.x
         */
        this.email = builder.email;
        /**
         * 成员类型
         * <p> 示例值：USER
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPermissionMemberId() {
        return this.permissionMemberId;
    }

    public void setPermissionMemberId(String permissionMemberId) {
        this.permissionMemberId = permissionMemberId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * 权限组内成员唯一标识
         * <p> 示例值：xxxxxxxxxxxxxxx
         */
        private String permissionMemberId;
        /**
         * 租户内用户的唯一标识（当成员类型是USER时有值）
         * <p> 示例值：xxxxxxxxxx
         */
        private String userId;
        /**
         * 租户内部门的唯一标识（当成员类型是DEPARTMENT时有值）
         * <p> 示例值：xxxxxxxxxx
         */
        private String departmentId;
        /**
         * 成员邮箱地址（当成员类型是MAIL_GROUP/PUBLIC_MAILBOX时有值）
         * <p> 示例值：xxx@xx.x
         */
        private String email;
        /**
         * 成员类型
         * <p> 示例值：USER
         */
        private String type;

        /**
         * 权限组内成员唯一标识
         * <p> 示例值：xxxxxxxxxxxxxxx
         *
         * @param permissionMemberId
         * @return
         */
        public Builder permissionMemberId(String permissionMemberId) {
            this.permissionMemberId = permissionMemberId;
            return this;
        }


        /**
         * 租户内用户的唯一标识（当成员类型是USER时有值）
         * <p> 示例值：xxxxxxxxxx
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 租户内部门的唯一标识（当成员类型是DEPARTMENT时有值）
         * <p> 示例值：xxxxxxxxxx
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 成员邮箱地址（当成员类型是MAIL_GROUP/PUBLIC_MAILBOX时有值）
         * <p> 示例值：xxx@xx.x
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 成员类型
         * <p> 示例值：USER
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 成员类型
         * <p> 示例值：USER
         *
         * @param type {@link com.lark.oapi.service.mail.v1.enums.MailgroupPermissionMemberTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.mail.v1.enums.MailgroupPermissionMemberTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        public MailgroupPermissionMember build() {
            return new MailgroupPermissionMember(this);
        }
    }
}
