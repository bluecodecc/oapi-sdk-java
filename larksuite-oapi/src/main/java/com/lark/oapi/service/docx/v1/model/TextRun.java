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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class TextRun {
    /**
     * 文本内容
     * <p> 示例值：文本
     */
    @SerializedName("content")
    private String content;
    /**
     * 文本局部样式
     * <p> 示例值：
     */
    @SerializedName("text_element_style")
    private TextElementStyle textElementStyle;

    // builder 开始
    public TextRun() {
    }

    public TextRun(Builder builder) {
        /**
         * 文本内容
         * <p> 示例值：文本
         */
        this.content = builder.content;
        /**
         * 文本局部样式
         * <p> 示例值：
         */
        this.textElementStyle = builder.textElementStyle;
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

    public TextElementStyle getTextElementStyle() {
        return this.textElementStyle;
    }

    public void setTextElementStyle(TextElementStyle textElementStyle) {
        this.textElementStyle = textElementStyle;
    }

    public static class Builder {
        /**
         * 文本内容
         * <p> 示例值：文本
         */
        private String content;
        /**
         * 文本局部样式
         * <p> 示例值：
         */
        private TextElementStyle textElementStyle;

        /**
         * 文本内容
         * <p> 示例值：文本
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 文本局部样式
         * <p> 示例值：
         *
         * @param textElementStyle
         * @return
         */
        public Builder textElementStyle(TextElementStyle textElementStyle) {
            this.textElementStyle = textElementStyle;
            return this;
        }


        public TextRun build() {
            return new TextRun(this);
        }
    }
}
