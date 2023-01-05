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

public class Href {
    /**
     * 具体链接地址。;URL仅支持解析http、https。详细参见：[任务字段补充说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/Supplementary-directions-of-task-fields)
     * <p> 示例值：https://support.feishu.com/internal/foo-bar
     */
    @SerializedName("url")
    private String url;
    /**
     * 链接对应的标题
     * <p> 示例值：反馈一个问题，需要协助排查
     */
    @SerializedName("title")
    private String title;

    // builder 开始
    public Href() {
    }

    public Href(Builder builder) {
        /**
         * 具体链接地址。;URL仅支持解析http、https。详细参见：[任务字段补充说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/Supplementary-directions-of-task-fields)
         * <p> 示例值：https://support.feishu.com/internal/foo-bar
         */
        this.url = builder.url;
        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         */
        this.title = builder.title;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class Builder {
        /**
         * 具体链接地址。;URL仅支持解析http、https。详细参见：[任务字段补充说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/Supplementary-directions-of-task-fields)
         * <p> 示例值：https://support.feishu.com/internal/foo-bar
         */
        private String url;
        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         */
        private String title;

        /**
         * 具体链接地址。;URL仅支持解析http、https。详细参见：[任务字段补充说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/Supplementary-directions-of-task-fields)
         * <p> 示例值：https://support.feishu.com/internal/foo-bar
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        public Href build() {
            return new Href(this);
        }
    }
}
