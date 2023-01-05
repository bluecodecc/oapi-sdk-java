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

package com.lark.oapi.service.calendar.v4.enums;

/**
 * 参与人RSVP状态
 */
public enum AttendeeChatMemberRsvpStatusEnum {
    NEEDSACTION("needs_action"), // 参与人尚未回复状态，或表示会议室预约中
    ACCEPT("accept"), // 参与人回复接受，或表示会议室预约成功
    TENTATIVE("tentative"), // 参与人回复待定
    DECLINE("decline"), // 参与人回复拒绝，或表示会议室预约失败
    REMOVED("removed"), // 参与人或会议室已经从日程中被移除
    ;
    private String value;

    AttendeeChatMemberRsvpStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}