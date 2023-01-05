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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class TalentCombinedLanguageInfo {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    @SerializedName("id")
    private String id;
    /**
     * 语言
     * <p> 示例值：1
     */
    @SerializedName("language")
    private Integer language;
    /**
     * 精通程度
     * <p> 示例值：1
     */
    @SerializedName("proficiency")
    private Integer proficiency;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data")
    private TalentCustomizedDataObjectValue[] customizedData;

    // builder 开始
    public TalentCombinedLanguageInfo() {
    }

    public TalentCombinedLanguageInfo(Builder builder) {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        this.id = builder.id;
        /**
         * 语言
         * <p> 示例值：1
         */
        this.language = builder.language;
        /**
         * 精通程度
         * <p> 示例值：1
         */
        this.proficiency = builder.proficiency;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedData = builder.customizedData;
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

    public Integer getLanguage() {
        return this.language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getProficiency() {
        return this.proficiency;
    }

    public void setProficiency(Integer proficiency) {
        this.proficiency = proficiency;
    }

    public TalentCustomizedDataObjectValue[] getCustomizedData() {
        return this.customizedData;
    }

    public void setCustomizedData(TalentCustomizedDataObjectValue[] customizedData) {
        this.customizedData = customizedData;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        private String id;
        /**
         * 语言
         * <p> 示例值：1
         */
        private Integer language;
        /**
         * 精通程度
         * <p> 示例值：1
         */
        private Integer proficiency;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private TalentCustomizedDataObjectValue[] customizedData;

        /**
         * ID
         * <p> 示例值：6891560630172518670
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 语言
         * <p> 示例值：1
         *
         * @param language
         * @return
         */
        public Builder language(Integer language) {
            this.language = language;
            return this;
        }


        /**
         * 精通程度
         * <p> 示例值：1
         *
         * @param proficiency
         * @return
         */
        public Builder proficiency(Integer proficiency) {
            this.proficiency = proficiency;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedData
         * @return
         */
        public Builder customizedData(TalentCustomizedDataObjectValue[] customizedData) {
            this.customizedData = customizedData;
            return this;
        }


        public TalentCombinedLanguageInfo build() {
            return new TalentCombinedLanguageInfo(this);
        }
    }
}
