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

package com.lark.oapi.service.vc.v1.enums;

/**
 * 触发告警规则的监控对象
 */
public enum AlertMonitorTargetEnum {
    ROOMS(1), // 飞书会议室
    CHECKBOARD(2), // 飞书会议室签到板
    ROOMBOX(3), // 飞书投屏盒子
    ROOM_TV_SHARE(4), // 飞书投屏
    SIP(5), // sip会议室系统
    ERC(6), // erc节点
    ROOM_SENSOR(7), // 飞书传感器
    ;
    private Integer value;

    AlertMonitorTargetEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}