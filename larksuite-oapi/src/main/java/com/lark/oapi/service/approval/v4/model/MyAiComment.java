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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class MyAiComment {
    /**
     * 用户姓名
     * <p> 示例值：张三
     */
    @SerializedName("user_name")
    private String userName;
    /**
     * 评论
     * <p> 示例值：同意
     */
    @SerializedName("comment")
    private String comment;

    // builder 开始
    public MyAiComment() {
    }

    public MyAiComment(Builder builder) {
        /**
         * 用户姓名
         * <p> 示例值：张三
         */
        this.userName = builder.userName;
        /**
         * 评论
         * <p> 示例值：同意
         */
        this.comment = builder.comment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static class Builder {
        /**
         * 用户姓名
         * <p> 示例值：张三
         */
        private String userName;
        /**
         * 评论
         * <p> 示例值：同意
         */
        private String comment;

        /**
         * 用户姓名
         * <p> 示例值：张三
         *
         * @param userName
         * @return
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }


        /**
         * 评论
         * <p> 示例值：同意
         *
         * @param comment
         * @return
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }


        public MyAiComment build() {
            return new MyAiComment(this);
        }
    }
}