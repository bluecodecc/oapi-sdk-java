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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Member {
    /**
     * 协作者 ID 类型，与协作者 ID 需要对应
     * <p> 示例值：openid
     */
    @SerializedName("member_type")
    private String memberType;
    /**
     * 协作者 ID，与协作者 ID 类型需要对应
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("member_id")
    private String memberId;
    /**
     * 协作者对应的权限角色
     * <p> 示例值：view
     */
    @SerializedName("perm")
    private String perm;
    /**
     * 协作者的权限角色类型
     * <p> 示例值：container
     */
    @SerializedName("perm_type")
    private String permType;
    /**
     * 协作者的类型
     * <p> 示例值：user
     */
    @SerializedName("type")
    private String type;
    /**
     * 协作者的名字
     * <p> 示例值：zhangsan
     */
    @SerializedName("name")
    private String name;
    /**
     * 协作者的头像
     * <p> 示例值：https://foo.icon.com/xxxx
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 协作者的外部标签
     * <p> 示例值：true
     */
    @SerializedName("external_label")
    private Boolean externalLabel;

    // builder 开始
    public Member() {
    }

    public Member(Builder builder) {
        /**
         * 协作者 ID 类型，与协作者 ID 需要对应
         * <p> 示例值：openid
         */
        this.memberType = builder.memberType;
        /**
         * 协作者 ID，与协作者 ID 类型需要对应
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.memberId = builder.memberId;
        /**
         * 协作者对应的权限角色
         * <p> 示例值：view
         */
        this.perm = builder.perm;
        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         */
        this.permType = builder.permType;
        /**
         * 协作者的类型
         * <p> 示例值：user
         */
        this.type = builder.type;
        /**
         * 协作者的名字
         * <p> 示例值：zhangsan
         */
        this.name = builder.name;
        /**
         * 协作者的头像
         * <p> 示例值：https://foo.icon.com/xxxx
         */
        this.avatar = builder.avatar;
        /**
         * 协作者的外部标签
         * <p> 示例值：true
         */
        this.externalLabel = builder.externalLabel;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPerm() {
        return this.perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public String getPermType() {
        return this.permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getExternalLabel() {
        return this.externalLabel;
    }

    public void setExternalLabel(Boolean externalLabel) {
        this.externalLabel = externalLabel;
    }

    public static class Builder {
        /**
         * 协作者 ID 类型，与协作者 ID 需要对应
         * <p> 示例值：openid
         */
        private String memberType;
        /**
         * 协作者 ID，与协作者 ID 类型需要对应
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String memberId;
        /**
         * 协作者对应的权限角色
         * <p> 示例值：view
         */
        private String perm;
        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         */
        private String permType;
        /**
         * 协作者的类型
         * <p> 示例值：user
         */
        private String type;
        /**
         * 协作者的名字
         * <p> 示例值：zhangsan
         */
        private String name;
        /**
         * 协作者的头像
         * <p> 示例值：https://foo.icon.com/xxxx
         */
        private String avatar;
        /**
         * 协作者的外部标签
         * <p> 示例值：true
         */
        private Boolean externalLabel;

        /**
         * 协作者 ID 类型，与协作者 ID 需要对应
         * <p> 示例值：openid
         *
         * @param memberType
         * @return
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        /**
         * 协作者 ID 类型，与协作者 ID 需要对应
         * <p> 示例值：openid
         *
         * @param memberType {@link com.lark.oapi.service.drive.v1.enums.MemberMemberTypeEnum}
         * @return
         */
        public Builder memberType(com.lark.oapi.service.drive.v1.enums.MemberMemberTypeEnum memberType) {
            this.memberType = memberType.getValue();
            return this;
        }


        /**
         * 协作者 ID，与协作者 ID 类型需要对应
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param memberId
         * @return
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }


        /**
         * 协作者对应的权限角色
         * <p> 示例值：view
         *
         * @param perm
         * @return
         */
        public Builder perm(String perm) {
            this.perm = perm;
            return this;
        }

        /**
         * 协作者对应的权限角色
         * <p> 示例值：view
         *
         * @param perm {@link com.lark.oapi.service.drive.v1.enums.MemberPermEnum}
         * @return
         */
        public Builder perm(com.lark.oapi.service.drive.v1.enums.MemberPermEnum perm) {
            this.perm = perm.getValue();
            return this;
        }


        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType
         * @return
         */
        public Builder permType(String permType) {
            this.permType = permType;
            return this;
        }

        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType {@link com.lark.oapi.service.drive.v1.enums.MemberPermTypeEnum}
         * @return
         */
        public Builder permType(com.lark.oapi.service.drive.v1.enums.MemberPermTypeEnum permType) {
            this.permType = permType.getValue();
            return this;
        }


        /**
         * 协作者的类型
         * <p> 示例值：user
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 协作者的类型
         * <p> 示例值：user
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.MemberTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.MemberTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 协作者的名字
         * <p> 示例值：zhangsan
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 协作者的头像
         * <p> 示例值：https://foo.icon.com/xxxx
         *
         * @param avatar
         * @return
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }


        /**
         * 协作者的外部标签
         * <p> 示例值：true
         *
         * @param externalLabel
         * @return
         */
        public Builder externalLabel(Boolean externalLabel) {
            this.externalLabel = externalLabel;
            return this;
        }


        public Member build() {
            return new Member(this);
        }
    }
}
