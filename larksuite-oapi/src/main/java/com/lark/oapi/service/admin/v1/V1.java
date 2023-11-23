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

package com.lark.oapi.service.admin.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.admin.v1.resource.*;

public class V1 {
    private final AdminDeptStat adminDeptStat; // 部门维度的数据报表
    private final AdminUserStat adminUserStat; // 用户维度的数据报表
    private final AuditInfo auditInfo; // 行为审计日志（灰度租户可见）
    private final Badge badge; // 勋章
    private final BadgeGrant badgeGrant; // 勋章授予名单
    private final BadgeImage badgeImage; // 勋章图片
    private final Password password; // 登录密码管理

    public V1(Config config) {
        this.adminDeptStat = new AdminDeptStat(config);
        this.adminUserStat = new AdminUserStat(config);
        this.auditInfo = new AuditInfo(config);
        this.badge = new Badge(config);
        this.badgeGrant = new BadgeGrant(config);
        this.badgeImage = new BadgeImage(config);
        this.password = new Password(config);
    }

    public AdminDeptStat adminDeptStat() {
        return adminDeptStat;
    }

    public AdminUserStat adminUserStat() {
        return adminUserStat;
    }

    public AuditInfo auditInfo() {
        return auditInfo;
    }

    public Badge badge() {
        return badge;
    }

    public BadgeGrant badgeGrant() {
        return badgeGrant;
    }

    public BadgeImage badgeImage() {
        return badgeImage;
    }

    public Password password() {
        return password;
    }
}