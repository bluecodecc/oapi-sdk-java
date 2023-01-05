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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class Subregion {
    /**
     * 城市/区域id
     * <p> 示例值：12
     */
    @SerializedName("id")
    private String id;
    /**
     * 城市/区域名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 所属省份/行政区id，详细信息可通过【查询省份/行政区信息】接口查询获得
     * <p> 示例值：12
     */
    @SerializedName("subdivision_id")
    private String subdivisionId;
    /**
     * 上级城市/区域区id
     * <p> 示例值：12
     */
    @SerializedName("superior_subregion_id")
    private String superiorSubregionId;

    // builder 开始
    public Subregion() {
    }

    public Subregion(Builder builder) {
        /**
         * 城市/区域id
         * <p> 示例值：12
         */
        this.id = builder.id;
        /**
         * 城市/区域名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 所属省份/行政区id，详细信息可通过【查询省份/行政区信息】接口查询获得
         * <p> 示例值：12
         */
        this.subdivisionId = builder.subdivisionId;
        /**
         * 上级城市/区域区id
         * <p> 示例值：12
         */
        this.superiorSubregionId = builder.superiorSubregionId;
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

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public String getSubdivisionId() {
        return this.subdivisionId;
    }

    public void setSubdivisionId(String subdivisionId) {
        this.subdivisionId = subdivisionId;
    }

    public String getSuperiorSubregionId() {
        return this.superiorSubregionId;
    }

    public void setSuperiorSubregionId(String superiorSubregionId) {
        this.superiorSubregionId = superiorSubregionId;
    }

    public static class Builder {
        /**
         * 城市/区域id
         * <p> 示例值：12
         */
        private String id;
        /**
         * 城市/区域名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 所属省份/行政区id，详细信息可通过【查询省份/行政区信息】接口查询获得
         * <p> 示例值：12
         */
        private String subdivisionId;
        /**
         * 上级城市/区域区id
         * <p> 示例值：12
         */
        private String superiorSubregionId;

        /**
         * 城市/区域id
         * <p> 示例值：12
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 城市/区域名称
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
         * 所属省份/行政区id，详细信息可通过【查询省份/行政区信息】接口查询获得
         * <p> 示例值：12
         *
         * @param subdivisionId
         * @return
         */
        public Builder subdivisionId(String subdivisionId) {
            this.subdivisionId = subdivisionId;
            return this;
        }


        /**
         * 上级城市/区域区id
         * <p> 示例值：12
         *
         * @param superiorSubregionId
         * @return
         */
        public Builder superiorSubregionId(String superiorSubregionId) {
            this.superiorSubregionId = superiorSubregionId;
            return this;
        }


        public Subregion build() {
            return new Subregion(this);
        }
    }
}
