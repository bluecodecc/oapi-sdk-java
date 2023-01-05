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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateTaskCommentReqBody {
    /**
     * 新的评论内容
     * <p> 示例值：飞流直下三千尺，疑是银河落九天
     */
    @SerializedName("content")
    private String content;
    /**
     * 新的富文本评论内容（优先使用）
     * <p> 示例值：飞流直下三千尺，疑是银河落九天<at id=7058204817822318612></at>
     */
    @SerializedName("rich_content")
    private String richContent;

    // builder 开始
    public UpdateTaskCommentReqBody() {
    }

    public UpdateTaskCommentReqBody(Builder builder) {
        /**
         * 新的评论内容
         * <p> 示例值：飞流直下三千尺，疑是银河落九天
         */
        this.content = builder.content;
        /**
         * 新的富文本评论内容（优先使用）
         * <p> 示例值：飞流直下三千尺，疑是银河落九天<at id=7058204817822318612></at>
         */
        this.richContent = builder.richContent;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRichContent() {
        return this.richContent;
    }

    public void setRichContent(String richContent) {
        this.richContent = richContent;
    }

    public static class Builder {
        /**
         * 新的评论内容
         * <p> 示例值：飞流直下三千尺，疑是银河落九天
         */
        private String content;
        /**
         * 新的富文本评论内容（优先使用）
         * <p> 示例值：飞流直下三千尺，疑是银河落九天<at id=7058204817822318612></at>
         */
        private String richContent;

        /**
         * 新的评论内容
         * <p> 示例值：飞流直下三千尺，疑是银河落九天
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 新的富文本评论内容（优先使用）
         * <p> 示例值：飞流直下三千尺，疑是银河落九天<at id=7058204817822318612></at>
         *
         * @param richContent
         * @return
         */
        public Builder richContent(String richContent) {
            this.richContent = richContent;
            return this;
        }


        public UpdateTaskCommentReqBody build() {
            return new UpdateTaskCommentReqBody(this);
        }
    }
}
