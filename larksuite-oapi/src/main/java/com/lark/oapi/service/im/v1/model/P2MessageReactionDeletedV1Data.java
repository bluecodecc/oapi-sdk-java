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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2MessageReactionDeletedV1Data {
    /**
     * 消息的 open_message_id
     * <p> 示例值：om_dc1326***************51dba21dcf
     */
    @SerializedName("message_id")
    private String messageId;
    /**
     * 表情回复的资源类型
     * <p> 示例值：
     */
    @SerializedName("reaction_type")
    private Emoji reactionType;
    /**
     * 操作人类型;;注意事项：;- 如果操作人类型是"user"，则会返回 ==user_id==;- 如果操作人类型是"app"，则会返回 ==app_id==
     * <p> 示例值：app/user
     */
    @SerializedName("operator_type")
    private String operatorType;
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 应用 ID
     * <p> 示例值：cli_9f53******712544
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 表情回复被添加时的时间戳（单位：ms）
     * <p> 示例值：1627641418803
     */
    @SerializedName("action_time")
    private String actionTime;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

}
