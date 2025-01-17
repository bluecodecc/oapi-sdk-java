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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.security_and_compliance.v1.enums.*;
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

public class Document {
    /**
     * 文档唯一标识token
     * <p> 示例值：
     */
    @SerializedName("token")
    private String token;
    /**
     * 文档标题
     * <p> 示例值：
     */
    @SerializedName("title")
    private String title;
    /**
     * 文档更新时间戳
     * <p> 示例值：
     */
    @SerializedName("update_time")
    private Integer updateTime;
    /**
     * 文档状态
     * <p> 示例值：
     */
    @SerializedName("object_status")
    private Integer objectStatus;
    /**
     * 文档类型
     * <p> 示例值：
     */
    @SerializedName("object_type")
    private Integer objectType;
    /**
     * 文档所有者
     * <p> 示例值：
     */
    @SerializedName("owner")
    private SimpleUser owner;

    // builder 开始
    public Document() {
    }

    public Document(Builder builder) {
        /**
         * 文档唯一标识token
         * <p> 示例值：
         */
        this.token = builder.token;
        /**
         * 文档标题
         * <p> 示例值：
         */
        this.title = builder.title;
        /**
         * 文档更新时间戳
         * <p> 示例值：
         */
        this.updateTime = builder.updateTime;
        /**
         * 文档状态
         * <p> 示例值：
         */
        this.objectStatus = builder.objectStatus;
        /**
         * 文档类型
         * <p> 示例值：
         */
        this.objectType = builder.objectType;
        /**
         * 文档所有者
         * <p> 示例值：
         */
        this.owner = builder.owner;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getObjectStatus() {
        return this.objectStatus;
    }

    public void setObjectStatus(Integer objectStatus) {
        this.objectStatus = objectStatus;
    }

    public Integer getObjectType() {
        return this.objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public SimpleUser getOwner() {
        return this.owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public static class Builder {
        /**
         * 文档唯一标识token
         * <p> 示例值：
         */
        private String token;
        /**
         * 文档标题
         * <p> 示例值：
         */
        private String title;
        /**
         * 文档更新时间戳
         * <p> 示例值：
         */
        private Integer updateTime;
        /**
         * 文档状态
         * <p> 示例值：
         */
        private Integer objectStatus;
        /**
         * 文档类型
         * <p> 示例值：
         */
        private Integer objectType;
        /**
         * 文档所有者
         * <p> 示例值：
         */
        private SimpleUser owner;

        /**
         * 文档唯一标识token
         * <p> 示例值：
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 文档标题
         * <p> 示例值：
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 文档更新时间戳
         * <p> 示例值：
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 文档状态
         * <p> 示例值：
         *
         * @param objectStatus
         * @return
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            return this;
        }

        /**
         * 文档状态
         * <p> 示例值：
         *
         * @param objectStatus {@link com.lark.oapi.service.security_and_compliance.v1.enums.DocumentDocumentStatusEnum}
         * @return
         */
        public Builder objectStatus(com.lark.oapi.service.security_and_compliance.v1.enums.DocumentDocumentStatusEnum objectStatus) {
            this.objectStatus = objectStatus.getValue();
            return this;
        }


        /**
         * 文档类型
         * <p> 示例值：
         *
         * @param objectType
         * @return
         */
        public Builder objectType(Integer objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * 文档类型
         * <p> 示例值：
         *
         * @param objectType {@link com.lark.oapi.service.security_and_compliance.v1.enums.DocumentDocumentTypeEnum}
         * @return
         */
        public Builder objectType(com.lark.oapi.service.security_and_compliance.v1.enums.DocumentDocumentTypeEnum objectType) {
            this.objectType = objectType.getValue();
            return this;
        }


        /**
         * 文档所有者
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(SimpleUser owner) {
            this.owner = owner;
            return this;
        }


        public Document build() {
            return new Document(this);
        }
    }
}
