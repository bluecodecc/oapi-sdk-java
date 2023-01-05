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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetFileStatisticsReq {
    /**
     * 文档类型
     * <p> 示例值：doc
     */
    @Query
    @SerializedName("file_type")
    private String fileType;
    /**
     * 文件 token
     * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
     */
    @Path
    @SerializedName("file_token")
    private String fileToken;

    // builder 开始
    public GetFileStatisticsReq() {
    }

    public GetFileStatisticsReq(Builder builder) {
        /**
         * 文档类型
         * <p> 示例值：doc
         */
        this.fileType = builder.fileType;
        /**
         * 文件 token
         * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
         */
        this.fileToken = builder.fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static class Builder {
        private String fileType; // 文档类型
        private String fileToken; // 文件 token

        /**
         * 文档类型
         * <p> 示例值：doc
         *
         * @param fileType
         * @return
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * 文档类型
         * <p> 示例值：doc
         *
         * @param fileType {@link com.lark.oapi.service.drive.v1.enums.GetFileStatisticsFileTypeEnum}
         * @return
         */
        public Builder fileType(com.lark.oapi.service.drive.v1.enums.GetFileStatisticsFileTypeEnum fileType) {
            this.fileType = fileType.getValue();
            return this;
        }

        /**
         * 文件 token
         * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public GetFileStatisticsReq build() {
            return new GetFileStatisticsReq(this);
        }
    }
}
