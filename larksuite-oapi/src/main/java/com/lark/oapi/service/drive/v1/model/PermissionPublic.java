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

import com.google.gson.annotations.SerializedName;

public class PermissionPublic {
    /**
     * 允许内容被分享到组织外;;**可选值有：** ;- `true`: 允许;- `false`: 不允许
     * <p> 示例值：true
     */
    @SerializedName("external_access")
    private Boolean externalAccess;
    /**
     * 谁可以复制内容、创建副本、打印、下载
     * <p> 示例值：anyone_can_view
     */
    @SerializedName("security_entity")
    private String securityEntity;
    /**
     * 可评论设置
     * <p> 示例值：anyone_can_view
     */
    @SerializedName("comment_entity")
    private String commentEntity;
    /**
     * 谁可以添加和管理协作者
     * <p> 示例值：anyone
     */
    @SerializedName("share_entity")
    private String shareEntity;
    /**
     * 链接分享设置
     * <p> 示例值：tenant_readable
     */
    @SerializedName("link_share_entity")
    private String linkShareEntity;
    /**
     * 允许非「可管理权限」的人分享到组织外
     * <p> 示例值：true
     */
    @SerializedName("invite_external")
    private Boolean inviteExternal;
    /**
     * 节点加锁状态
     * <p> 示例值：false
     */
    @SerializedName("lock_switch")
    private Boolean lockSwitch;

    // builder 开始
    public PermissionPublic() {
    }

    public PermissionPublic(Builder builder) {
        /**
         * 允许内容被分享到组织外;;**可选值有：** ;- `true`: 允许;- `false`: 不允许
         * <p> 示例值：true
         */
        this.externalAccess = builder.externalAccess;
        /**
         * 谁可以复制内容、创建副本、打印、下载
         * <p> 示例值：anyone_can_view
         */
        this.securityEntity = builder.securityEntity;
        /**
         * 可评论设置
         * <p> 示例值：anyone_can_view
         */
        this.commentEntity = builder.commentEntity;
        /**
         * 谁可以添加和管理协作者
         * <p> 示例值：anyone
         */
        this.shareEntity = builder.shareEntity;
        /**
         * 链接分享设置
         * <p> 示例值：tenant_readable
         */
        this.linkShareEntity = builder.linkShareEntity;
        /**
         * 允许非「可管理权限」的人分享到组织外
         * <p> 示例值：true
         */
        this.inviteExternal = builder.inviteExternal;
        /**
         * 节点加锁状态
         * <p> 示例值：false
         */
        this.lockSwitch = builder.lockSwitch;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getExternalAccess() {
        return this.externalAccess;
    }

    public void setExternalAccess(Boolean externalAccess) {
        this.externalAccess = externalAccess;
    }

    public String getSecurityEntity() {
        return this.securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getCommentEntity() {
        return this.commentEntity;
    }

    public void setCommentEntity(String commentEntity) {
        this.commentEntity = commentEntity;
    }

    public String getShareEntity() {
        return this.shareEntity;
    }

    public void setShareEntity(String shareEntity) {
        this.shareEntity = shareEntity;
    }

    public String getLinkShareEntity() {
        return this.linkShareEntity;
    }

    public void setLinkShareEntity(String linkShareEntity) {
        this.linkShareEntity = linkShareEntity;
    }

    public Boolean getInviteExternal() {
        return this.inviteExternal;
    }

    public void setInviteExternal(Boolean inviteExternal) {
        this.inviteExternal = inviteExternal;
    }

    public Boolean getLockSwitch() {
        return this.lockSwitch;
    }

    public void setLockSwitch(Boolean lockSwitch) {
        this.lockSwitch = lockSwitch;
    }

    public static class Builder {
        /**
         * 允许内容被分享到组织外;;**可选值有：** ;- `true`: 允许;- `false`: 不允许
         * <p> 示例值：true
         */
        private Boolean externalAccess;
        /**
         * 谁可以复制内容、创建副本、打印、下载
         * <p> 示例值：anyone_can_view
         */
        private String securityEntity;
        /**
         * 可评论设置
         * <p> 示例值：anyone_can_view
         */
        private String commentEntity;
        /**
         * 谁可以添加和管理协作者
         * <p> 示例值：anyone
         */
        private String shareEntity;
        /**
         * 链接分享设置
         * <p> 示例值：tenant_readable
         */
        private String linkShareEntity;
        /**
         * 允许非「可管理权限」的人分享到组织外
         * <p> 示例值：true
         */
        private Boolean inviteExternal;
        /**
         * 节点加锁状态
         * <p> 示例值：false
         */
        private Boolean lockSwitch;

        /**
         * 允许内容被分享到组织外;;**可选值有：** ;- `true`: 允许;- `false`: 不允许
         * <p> 示例值：true
         *
         * @param externalAccess
         * @return
         */
        public Builder externalAccess(Boolean externalAccess) {
            this.externalAccess = externalAccess;
            return this;
        }


        /**
         * 谁可以复制内容、创建副本、打印、下载
         * <p> 示例值：anyone_can_view
         *
         * @param securityEntity
         * @return
         */
        public Builder securityEntity(String securityEntity) {
            this.securityEntity = securityEntity;
            return this;
        }

        /**
         * 谁可以复制内容、创建副本、打印、下载
         * <p> 示例值：anyone_can_view
         *
         * @param securityEntity {@link com.lark.oapi.service.drive.v1.enums.PermissionPublicSecurityEntityEnum}
         * @return
         */
        public Builder securityEntity(com.lark.oapi.service.drive.v1.enums.PermissionPublicSecurityEntityEnum securityEntity) {
            this.securityEntity = securityEntity.getValue();
            return this;
        }


        /**
         * 可评论设置
         * <p> 示例值：anyone_can_view
         *
         * @param commentEntity
         * @return
         */
        public Builder commentEntity(String commentEntity) {
            this.commentEntity = commentEntity;
            return this;
        }

        /**
         * 可评论设置
         * <p> 示例值：anyone_can_view
         *
         * @param commentEntity {@link com.lark.oapi.service.drive.v1.enums.PermissionPublicCommentEntityEnum}
         * @return
         */
        public Builder commentEntity(com.lark.oapi.service.drive.v1.enums.PermissionPublicCommentEntityEnum commentEntity) {
            this.commentEntity = commentEntity.getValue();
            return this;
        }


        /**
         * 谁可以添加和管理协作者
         * <p> 示例值：anyone
         *
         * @param shareEntity
         * @return
         */
        public Builder shareEntity(String shareEntity) {
            this.shareEntity = shareEntity;
            return this;
        }

        /**
         * 谁可以添加和管理协作者
         * <p> 示例值：anyone
         *
         * @param shareEntity {@link com.lark.oapi.service.drive.v1.enums.PermissionPublicShareEntityEnum}
         * @return
         */
        public Builder shareEntity(com.lark.oapi.service.drive.v1.enums.PermissionPublicShareEntityEnum shareEntity) {
            this.shareEntity = shareEntity.getValue();
            return this;
        }


        /**
         * 链接分享设置
         * <p> 示例值：tenant_readable
         *
         * @param linkShareEntity
         * @return
         */
        public Builder linkShareEntity(String linkShareEntity) {
            this.linkShareEntity = linkShareEntity;
            return this;
        }

        /**
         * 链接分享设置
         * <p> 示例值：tenant_readable
         *
         * @param linkShareEntity {@link com.lark.oapi.service.drive.v1.enums.PermissionPublicLinkShareEntityEnum}
         * @return
         */
        public Builder linkShareEntity(com.lark.oapi.service.drive.v1.enums.PermissionPublicLinkShareEntityEnum linkShareEntity) {
            this.linkShareEntity = linkShareEntity.getValue();
            return this;
        }


        /**
         * 允许非「可管理权限」的人分享到组织外
         * <p> 示例值：true
         *
         * @param inviteExternal
         * @return
         */
        public Builder inviteExternal(Boolean inviteExternal) {
            this.inviteExternal = inviteExternal;
            return this;
        }


        /**
         * 节点加锁状态
         * <p> 示例值：false
         *
         * @param lockSwitch
         * @return
         */
        public Builder lockSwitch(Boolean lockSwitch) {
            this.lockSwitch = lockSwitch;
            return this;
        }


        public PermissionPublic build() {
            return new PermissionPublic(this);
        }
    }
}
