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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class AilyMessageFile {
    /**
     * 文件 ID
     * <p> 示例值：file_4d9nu1ev3a2rq
     */
    @SerializedName("id")
    private String id;
    /**
     * 文件类型，参见 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Basics_of_HTTP/MIME_types
     * <p> 示例值：image/png
     */
    @SerializedName("mime_type")
    private String mimeType;
    /**
     * 文件名
     * <p> 示例值：发票.png
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 其他透传信息
     * <p> 示例值：{}
     */
    @SerializedName("metadata")
    private String metadata;
    /**
     * 文件的创建时间，毫秒时间戳
     * <p> 示例值：1711975665710
     */
    @SerializedName("created_at")
    private String createdAt;

    // builder 开始
    public AilyMessageFile() {
    }

    public AilyMessageFile(Builder builder) {
        /**
         * 文件 ID
         * <p> 示例值：file_4d9nu1ev3a2rq
         */
        this.id = builder.id;
        /**
         * 文件类型，参见 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Basics_of_HTTP/MIME_types
         * <p> 示例值：image/png
         */
        this.mimeType = builder.mimeType;
        /**
         * 文件名
         * <p> 示例值：发票.png
         */
        this.fileName = builder.fileName;
        /**
         * 其他透传信息
         * <p> 示例值：{}
         */
        this.metadata = builder.metadata;
        /**
         * 文件的创建时间，毫秒时间戳
         * <p> 示例值：1711975665710
         */
        this.createdAt = builder.createdAt;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {
        /**
         * 文件 ID
         * <p> 示例值：file_4d9nu1ev3a2rq
         */
        private String id;
        /**
         * 文件类型，参见 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Basics_of_HTTP/MIME_types
         * <p> 示例值：image/png
         */
        private String mimeType;
        /**
         * 文件名
         * <p> 示例值：发票.png
         */
        private String fileName;
        /**
         * 其他透传信息
         * <p> 示例值：{}
         */
        private String metadata;
        /**
         * 文件的创建时间，毫秒时间戳
         * <p> 示例值：1711975665710
         */
        private String createdAt;

        /**
         * 文件 ID
         * <p> 示例值：file_4d9nu1ev3a2rq
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 文件类型，参见 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Basics_of_HTTP/MIME_types
         * <p> 示例值：image/png
         *
         * @param mimeType
         * @return
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }


        /**
         * 文件名
         * <p> 示例值：发票.png
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 其他透传信息
         * <p> 示例值：{}
         *
         * @param metadata
         * @return
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }


        /**
         * 文件的创建时间，毫秒时间戳
         * <p> 示例值：1711975665710
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public AilyMessageFile build() {
            return new AilyMessageFile(this);
        }
    }
}