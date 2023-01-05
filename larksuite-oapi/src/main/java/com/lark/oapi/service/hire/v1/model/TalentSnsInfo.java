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

public class TalentSnsInfo {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    @SerializedName("id")
    private String id;
    /**
     * SNS名称
     * <p> 示例值：1
     */
    @SerializedName("sns_type")
    private Integer snsType;
    /**
     * URL/ID
     * <p> 示例值：www.test.com
     */
    @SerializedName("link")
    private String link;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data_list")
    private TalentCustomizedDataChild[] customizedDataList;

    // builder 开始
    public TalentSnsInfo() {
    }

    public TalentSnsInfo(Builder builder) {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        this.id = builder.id;
        /**
         * SNS名称
         * <p> 示例值：1
         */
        this.snsType = builder.snsType;
        /**
         * URL/ID
         * <p> 示例值：www.test.com
         */
        this.link = builder.link;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedDataList = builder.customizedDataList;
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

    public Integer getSnsType() {
        return this.snsType;
    }

    public void setSnsType(Integer snsType) {
        this.snsType = snsType;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public TalentCustomizedDataChild[] getCustomizedDataList() {
        return this.customizedDataList;
    }

    public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
        this.customizedDataList = customizedDataList;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        private String id;
        /**
         * SNS名称
         * <p> 示例值：1
         */
        private Integer snsType;
        /**
         * URL/ID
         * <p> 示例值：www.test.com
         */
        private String link;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private TalentCustomizedDataChild[] customizedDataList;

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
         * SNS名称
         * <p> 示例值：1
         *
         * @param snsType
         * @return
         */
        public Builder snsType(Integer snsType) {
            this.snsType = snsType;
            return this;
        }


        /**
         * URL/ID
         * <p> 示例值：www.test.com
         *
         * @param link
         * @return
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedDataList
         * @return
         */
        public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
            this.customizedDataList = customizedDataList;
            return this;
        }


        public TalentSnsInfo build() {
            return new TalentSnsInfo(this);
        }
    }
}
