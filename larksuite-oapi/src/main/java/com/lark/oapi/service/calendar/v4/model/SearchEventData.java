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

package com.lark.oapi.service.calendar.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class SearchEventData {
    /**
     * 日程列表
     * <p> 示例值：
     */
    @SerializedName("events")
    private EventBriefInfoAi[] events;
    /**
     * 返回给prompt展示内容
     * <p> 示例值：帮我展示卡片消息
     */
    @SerializedName("msg")
    private String msg;

    // builder 开始
    public SearchEventData() {
    }

    public SearchEventData(Builder builder) {
        /**
         * 日程列表
         * <p> 示例值：
         */
        this.events = builder.events;
        /**
         * 返回给prompt展示内容
         * <p> 示例值：帮我展示卡片消息
         */
        this.msg = builder.msg;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public EventBriefInfoAi[] getEvents() {
        return this.events;
    }

    public void setEvents(EventBriefInfoAi[] events) {
        this.events = events;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class Builder {
        /**
         * 日程列表
         * <p> 示例值：
         */
        private EventBriefInfoAi[] events;
        /**
         * 返回给prompt展示内容
         * <p> 示例值：帮我展示卡片消息
         */
        private String msg;

        /**
         * 日程列表
         * <p> 示例值：
         *
         * @param events
         * @return
         */
        public Builder events(EventBriefInfoAi[] events) {
            this.events = events;
            return this;
        }


        /**
         * 返回给prompt展示内容
         * <p> 示例值：帮我展示卡片消息
         *
         * @param msg
         * @return
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }


        public SearchEventData build() {
            return new SearchEventData(this);
        }
    }
}
