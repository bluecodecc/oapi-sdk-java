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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
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

public class ItemCategory {
    /**
     * 薪资项分类ID
     * <p> 示例值：4532312334
     */
    @SerializedName("id")
    private String id;
    /**
     * 薪资项分类名称
     * <p> 示例值：基本薪资类
     */
    @SerializedName("name")
    private String name;
    /**
     * 薪资项多语言分类
     * <p> 示例值：
     */
    @SerializedName("i18n_names")
    private I18nContent[] i18nNames;

    // builder 开始
    public ItemCategory() {
    }

    public ItemCategory(Builder builder) {
        /**
         * 薪资项分类ID
         * <p> 示例值：4532312334
         */
        this.id = builder.id;
        /**
         * 薪资项分类名称
         * <p> 示例值：基本薪资类
         */
        this.name = builder.name;
        /**
         * 薪资项多语言分类
         * <p> 示例值：
         */
        this.i18nNames = builder.i18nNames;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public I18nContent[] getI18nNames() {
        return this.i18nNames;
    }

    public void setI18nNames(I18nContent[] i18nNames) {
        this.i18nNames = i18nNames;
    }

    public static class Builder {
        /**
         * 薪资项分类ID
         * <p> 示例值：4532312334
         */
        private String id;
        /**
         * 薪资项分类名称
         * <p> 示例值：基本薪资类
         */
        private String name;
        /**
         * 薪资项多语言分类
         * <p> 示例值：
         */
        private I18nContent[] i18nNames;

        /**
         * 薪资项分类ID
         * <p> 示例值：4532312334
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 薪资项分类名称
         * <p> 示例值：基本薪资类
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 薪资项多语言分类
         * <p> 示例值：
         *
         * @param i18nNames
         * @return
         */
        public Builder i18nNames(I18nContent[] i18nNames) {
            this.i18nNames = i18nNames;
            return this;
        }


        public ItemCategory build() {
            return new ItemCategory(this);
        }
    }
}
