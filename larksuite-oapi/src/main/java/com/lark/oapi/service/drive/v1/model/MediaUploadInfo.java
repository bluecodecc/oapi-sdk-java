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

public class MediaUploadInfo {
    /**
     * 文件名
     * <p> 示例值：demo.jpeg
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 上传点类型
     * <p> 示例值：doc_image
     */
    @SerializedName("parent_type")
    private String parentType;
    /**
     * 上传点的标识符
     * <p> 示例值：doccnFivLCfJfblZjGZtxgabcef
     */
    @SerializedName("parent_node")
    private String parentNode;
    /**
     * 文件大小
     * <p> 示例值：1024
     */
    @SerializedName("size")
    private Integer size;
    /**
     * 扩展信息(可选)
     * <p> 示例值：{\"test\":\"test\"}
     */
    @SerializedName("extra")
    private String extra;

    // builder 开始
    public MediaUploadInfo() {
    }

    public MediaUploadInfo(Builder builder) {
        /**
         * 文件名
         * <p> 示例值：demo.jpeg
         */
        this.fileName = builder.fileName;
        /**
         * 上传点类型
         * <p> 示例值：doc_image
         */
        this.parentType = builder.parentType;
        /**
         * 上传点的标识符
         * <p> 示例值：doccnFivLCfJfblZjGZtxgabcef
         */
        this.parentNode = builder.parentNode;
        /**
         * 文件大小
         * <p> 示例值：1024
         */
        this.size = builder.size;
        /**
         * 扩展信息(可选)
         * <p> 示例值：{\"test\":\"test\"}
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentNode() {
        return this.parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * 文件名
         * <p> 示例值：demo.jpeg
         */
        private String fileName;
        /**
         * 上传点类型
         * <p> 示例值：doc_image
         */
        private String parentType;
        /**
         * 上传点的标识符
         * <p> 示例值：doccnFivLCfJfblZjGZtxgabcef
         */
        private String parentNode;
        /**
         * 文件大小
         * <p> 示例值：1024
         */
        private Integer size;
        /**
         * 扩展信息(可选)
         * <p> 示例值：{\"test\":\"test\"}
         */
        private String extra;

        /**
         * 文件名
         * <p> 示例值：demo.jpeg
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 上传点类型
         * <p> 示例值：doc_image
         *
         * @param parentType
         * @return
         */
        public Builder parentType(String parentType) {
            this.parentType = parentType;
            return this;
        }

        /**
         * 上传点类型
         * <p> 示例值：doc_image
         *
         * @param parentType {@link com.lark.oapi.service.drive.v1.enums.MediaUploadInfoParentTypeEnum}
         * @return
         */
        public Builder parentType(com.lark.oapi.service.drive.v1.enums.MediaUploadInfoParentTypeEnum parentType) {
            this.parentType = parentType.getValue();
            return this;
        }


        /**
         * 上传点的标识符
         * <p> 示例值：doccnFivLCfJfblZjGZtxgabcef
         *
         * @param parentNode
         * @return
         */
        public Builder parentNode(String parentNode) {
            this.parentNode = parentNode;
            return this;
        }


        /**
         * 文件大小
         * <p> 示例值：1024
         *
         * @param size
         * @return
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }


        /**
         * 扩展信息(可选)
         * <p> 示例值：{\"test\":\"test\"}
         *
         * @param extra
         * @return
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }


        public MediaUploadInfo build() {
            return new MediaUploadInfo(this);
        }
    }
}
