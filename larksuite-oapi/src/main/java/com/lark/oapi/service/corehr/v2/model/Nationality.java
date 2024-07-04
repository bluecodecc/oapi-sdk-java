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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class Nationality {
    /**
     * 国籍 ID，对应[搜索员工信息](https://open.feishu.cn/document/server-docs/corehr-v1/employee/search)等接口返回的 `nationality_id_v2` 字段
     * <p> 示例值：7075702736045475372
     */
    @SerializedName("nationality_id")
    private String nationalityId;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 国家/地区两位字母编码（ISO 3166-1）
     * <p> 示例值：CN
     */
    @SerializedName("alpha_2_code")
    private String alpha2Code;
    /**
     * 国家/地区三位字母编码（ISO 3166-1）
     * <p> 示例值：CHN
     */
    @SerializedName("alpha_3_code")
    private String alpha3Code;
    /**
     * 数字代码
     * <p> 示例值：156
     */
    @SerializedName("numeric_code")
    private Integer numericCode;
    /**
     * 所属国家/地区 ID，详细信息可通过[查询国家/地区信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-country_region/search)接口查询获得
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("country_region_id")
    private String countryRegionId;
    /**
     * 状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;

    // builder 开始
    public Nationality() {
    }

    public Nationality(Builder builder) {
        /**
         * 国籍 ID，对应[搜索员工信息](https://open.feishu.cn/document/server-docs/corehr-v1/employee/search)等接口返回的 `nationality_id_v2` 字段
         * <p> 示例值：7075702736045475372
         */
        this.nationalityId = builder.nationalityId;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 国家/地区两位字母编码（ISO 3166-1）
         * <p> 示例值：CN
         */
        this.alpha2Code = builder.alpha2Code;
        /**
         * 国家/地区三位字母编码（ISO 3166-1）
         * <p> 示例值：CHN
         */
        this.alpha3Code = builder.alpha3Code;
        /**
         * 数字代码
         * <p> 示例值：156
         */
        this.numericCode = builder.numericCode;
        /**
         * 所属国家/地区 ID，详细信息可通过[查询国家/地区信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-country_region/search)接口查询获得
         * <p> 示例值：6862995757234914824
         */
        this.countryRegionId = builder.countryRegionId;
        /**
         * 状态
         * <p> 示例值：1
         */
        this.status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getNationalityId() {
        return this.nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return this.alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return this.alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public Integer getNumericCode() {
        return this.numericCode;
    }

    public void setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
    }

    public String getCountryRegionId() {
        return this.countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static class Builder {
        /**
         * 国籍 ID，对应[搜索员工信息](https://open.feishu.cn/document/server-docs/corehr-v1/employee/search)等接口返回的 `nationality_id_v2` 字段
         * <p> 示例值：7075702736045475372
         */
        private String nationalityId;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 国家/地区两位字母编码（ISO 3166-1）
         * <p> 示例值：CN
         */
        private String alpha2Code;
        /**
         * 国家/地区三位字母编码（ISO 3166-1）
         * <p> 示例值：CHN
         */
        private String alpha3Code;
        /**
         * 数字代码
         * <p> 示例值：156
         */
        private Integer numericCode;
        /**
         * 所属国家/地区 ID，详细信息可通过[查询国家/地区信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-country_region/search)接口查询获得
         * <p> 示例值：6862995757234914824
         */
        private String countryRegionId;
        /**
         * 状态
         * <p> 示例值：1
         */
        private Integer status;

        /**
         * 国籍 ID，对应[搜索员工信息](https://open.feishu.cn/document/server-docs/corehr-v1/employee/search)等接口返回的 `nationality_id_v2` 字段
         * <p> 示例值：7075702736045475372
         *
         * @param nationalityId
         * @return
         */
        public Builder nationalityId(String nationalityId) {
            this.nationalityId = nationalityId;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 国家/地区两位字母编码（ISO 3166-1）
         * <p> 示例值：CN
         *
         * @param alpha2Code
         * @return
         */
        public Builder alpha2Code(String alpha2Code) {
            this.alpha2Code = alpha2Code;
            return this;
        }


        /**
         * 国家/地区三位字母编码（ISO 3166-1）
         * <p> 示例值：CHN
         *
         * @param alpha3Code
         * @return
         */
        public Builder alpha3Code(String alpha3Code) {
            this.alpha3Code = alpha3Code;
            return this;
        }


        /**
         * 数字代码
         * <p> 示例值：156
         *
         * @param numericCode
         * @return
         */
        public Builder numericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }


        /**
         * 所属国家/地区 ID，详细信息可通过[查询国家/地区信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-country_region/search)接口查询获得
         * <p> 示例值：6862995757234914824
         *
         * @param countryRegionId
         * @return
         */
        public Builder countryRegionId(String countryRegionId) {
            this.countryRegionId = countryRegionId;
            return this;
        }


        /**
         * 状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.corehr.v2.enums.NationalityBasicDataObjStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.corehr.v2.enums.NationalityBasicDataObjStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        public Nationality build() {
            return new Nationality(this);
        }
    }
}
