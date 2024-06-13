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

public class Item {
    /**
     * 薪资项ID
     * <p> 示例值：7196951947268589113
     */
    @SerializedName("id")
    private String id;
    /**
     * 薪资项名称
     * <p> 示例值：基本月薪
     */
    @SerializedName("name")
    private String name;
    /**
     * 薪资项描述
     * <p> 示例值：每月份的薪酬
     */
    @SerializedName("description")
    private String description;
    /**
     * 薪资项分类ID，详细信息可以通过[批量获取薪资项分类信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item_category/list)接口查询获得
     * <p> 示例值：7196951947268589223
     */
    @SerializedName("category_id")
    private String categoryId;
    /**
     * 薪资项数值类型
     * <p> 示例值：money
     */
    @SerializedName("value_type")
    private String valueType;
    /**
     * 发放频率
     * <p> 示例值：month
     */
    @SerializedName("pay_off_frequency_type")
    private String payOffFrequencyType;
    /**
     * 小数位数
     * <p> 示例值：2
     */
    @SerializedName("decimal_places")
    private Integer decimalPlaces;
    /**
     * 启用状态
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;
    /**
     * 多语言名称
     * <p> 示例值：
     */
    @SerializedName("i18n_names")
    private I18nContent[] i18nNames;
    /**
     * 多语言描述
     * <p> 示例值：
     */
    @SerializedName("i18n_descriptions")
    private I18nContent[] i18nDescriptions;

    // builder 开始
    public Item() {
    }

    public Item(Builder builder) {
        /**
         * 薪资项ID
         * <p> 示例值：7196951947268589113
         */
        this.id = builder.id;
        /**
         * 薪资项名称
         * <p> 示例值：基本月薪
         */
        this.name = builder.name;
        /**
         * 薪资项描述
         * <p> 示例值：每月份的薪酬
         */
        this.description = builder.description;
        /**
         * 薪资项分类ID，详细信息可以通过[批量获取薪资项分类信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item_category/list)接口查询获得
         * <p> 示例值：7196951947268589223
         */
        this.categoryId = builder.categoryId;
        /**
         * 薪资项数值类型
         * <p> 示例值：money
         */
        this.valueType = builder.valueType;
        /**
         * 发放频率
         * <p> 示例值：month
         */
        this.payOffFrequencyType = builder.payOffFrequencyType;
        /**
         * 小数位数
         * <p> 示例值：2
         */
        this.decimalPlaces = builder.decimalPlaces;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        this.activeStatus = builder.activeStatus;
        /**
         * 多语言名称
         * <p> 示例值：
         */
        this.i18nNames = builder.i18nNames;
        /**
         * 多语言描述
         * <p> 示例值：
         */
        this.i18nDescriptions = builder.i18nDescriptions;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getValueType() {
        return this.valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getPayOffFrequencyType() {
        return this.payOffFrequencyType;
    }

    public void setPayOffFrequencyType(String payOffFrequencyType) {
        this.payOffFrequencyType = payOffFrequencyType;
    }

    public Integer getDecimalPlaces() {
        return this.decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Integer getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public I18nContent[] getI18nNames() {
        return this.i18nNames;
    }

    public void setI18nNames(I18nContent[] i18nNames) {
        this.i18nNames = i18nNames;
    }

    public I18nContent[] getI18nDescriptions() {
        return this.i18nDescriptions;
    }

    public void setI18nDescriptions(I18nContent[] i18nDescriptions) {
        this.i18nDescriptions = i18nDescriptions;
    }

    public static class Builder {
        /**
         * 薪资项ID
         * <p> 示例值：7196951947268589113
         */
        private String id;
        /**
         * 薪资项名称
         * <p> 示例值：基本月薪
         */
        private String name;
        /**
         * 薪资项描述
         * <p> 示例值：每月份的薪酬
         */
        private String description;
        /**
         * 薪资项分类ID，详细信息可以通过[批量获取薪资项分类信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item_category/list)接口查询获得
         * <p> 示例值：7196951947268589223
         */
        private String categoryId;
        /**
         * 薪资项数值类型
         * <p> 示例值：money
         */
        private String valueType;
        /**
         * 发放频率
         * <p> 示例值：month
         */
        private String payOffFrequencyType;
        /**
         * 小数位数
         * <p> 示例值：2
         */
        private Integer decimalPlaces;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        private Integer activeStatus;
        /**
         * 多语言名称
         * <p> 示例值：
         */
        private I18nContent[] i18nNames;
        /**
         * 多语言描述
         * <p> 示例值：
         */
        private I18nContent[] i18nDescriptions;

        /**
         * 薪资项ID
         * <p> 示例值：7196951947268589113
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 薪资项名称
         * <p> 示例值：基本月薪
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 薪资项描述
         * <p> 示例值：每月份的薪酬
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 薪资项分类ID，详细信息可以通过[批量获取薪资项分类信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item_category/list)接口查询获得
         * <p> 示例值：7196951947268589223
         *
         * @param categoryId
         * @return
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }


        /**
         * 薪资项数值类型
         * <p> 示例值：money
         *
         * @param valueType
         * @return
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * 薪资项数值类型
         * <p> 示例值：money
         *
         * @param valueType {@link com.lark.oapi.service.compensation.v1.enums.ItemValueTypeEnum}
         * @return
         */
        public Builder valueType(com.lark.oapi.service.compensation.v1.enums.ItemValueTypeEnum valueType) {
            this.valueType = valueType.getValue();
            return this;
        }


        /**
         * 发放频率
         * <p> 示例值：month
         *
         * @param payOffFrequencyType
         * @return
         */
        public Builder payOffFrequencyType(String payOffFrequencyType) {
            this.payOffFrequencyType = payOffFrequencyType;
            return this;
        }

        /**
         * 发放频率
         * <p> 示例值：month
         *
         * @param payOffFrequencyType {@link com.lark.oapi.service.compensation.v1.enums.ItemPayOffFrequencyTypeEnum}
         * @return
         */
        public Builder payOffFrequencyType(com.lark.oapi.service.compensation.v1.enums.ItemPayOffFrequencyTypeEnum payOffFrequencyType) {
            this.payOffFrequencyType = payOffFrequencyType.getValue();
            return this;
        }


        /**
         * 小数位数
         * <p> 示例值：2
         *
         * @param decimalPlaces
         * @return
         */
        public Builder decimalPlaces(Integer decimalPlaces) {
            this.decimalPlaces = decimalPlaces;
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：1
         *
         * @param activeStatus
         * @return
         */
        public Builder activeStatus(Integer activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }

        /**
         * 启用状态
         * <p> 示例值：1
         *
         * @param activeStatus {@link com.lark.oapi.service.compensation.v1.enums.ItemActiveStatusEnum}
         * @return
         */
        public Builder activeStatus(com.lark.oapi.service.compensation.v1.enums.ItemActiveStatusEnum activeStatus) {
            this.activeStatus = activeStatus.getValue();
            return this;
        }


        /**
         * 多语言名称
         * <p> 示例值：
         *
         * @param i18nNames
         * @return
         */
        public Builder i18nNames(I18nContent[] i18nNames) {
            this.i18nNames = i18nNames;
            return this;
        }


        /**
         * 多语言描述
         * <p> 示例值：
         *
         * @param i18nDescriptions
         * @return
         */
        public Builder i18nDescriptions(I18nContent[] i18nDescriptions) {
            this.i18nDescriptions = i18nDescriptions;
            return this;
        }


        public Item build() {
            return new Item(this);
        }
    }
}
