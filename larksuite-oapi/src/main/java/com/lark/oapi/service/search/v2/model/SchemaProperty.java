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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class SchemaProperty {
    /**
     * 属性名
     * <p> 示例值：summary
     */
    @SerializedName("name")
    private String name;
    /**
     * 属性类型
     * <p> 示例值：text
     */
    @SerializedName("type")
    private String type;
    /**
     * 该属性是否可用作搜索，默认为 false
     * <p> 示例值：true
     */
    @SerializedName("is_searchable")
    private Boolean isSearchable;
    /**
     * 该属性是否可用作搜索结果排序，默认为 false。如果为 true，需要再配置 sortOptions
     * <p> 示例值：false
     */
    @SerializedName("is_sortable")
    private Boolean isSortable;
    /**
     * 该属性是否可用作返回字段，为 false 时，该字段不会被召回和展示。默认为 false
     * <p> 示例值：true
     */
    @SerializedName("is_returnable")
    private Boolean isReturnable;
    /**
     * 属性排序的可选配置，当 is_sortable 为 true 时，该字段为必填字段
     * <p> 示例值：
     */
    @SerializedName("sort_options")
    private SchemaSortOptions sortOptions;
    /**
     * 相关类型数据的定义和约束
     * <p> 示例值：
     */
    @SerializedName("type_definitions")
    private SchemaTypeDefinitions typeDefinitions;
    /**
     * 属性搜索的可选配置，当 is_searchable 为 true 时，该字段为必填参数
     * <p> 示例值：
     */
    @SerializedName("search_options")
    private SchemaSearchOptions searchOptions;

    // builder 开始
    public SchemaProperty() {
    }

    public SchemaProperty(Builder builder) {
        /**
         * 属性名
         * <p> 示例值：summary
         */
        this.name = builder.name;
        /**
         * 属性类型
         * <p> 示例值：text
         */
        this.type = builder.type;
        /**
         * 该属性是否可用作搜索，默认为 false
         * <p> 示例值：true
         */
        this.isSearchable = builder.isSearchable;
        /**
         * 该属性是否可用作搜索结果排序，默认为 false。如果为 true，需要再配置 sortOptions
         * <p> 示例值：false
         */
        this.isSortable = builder.isSortable;
        /**
         * 该属性是否可用作返回字段，为 false 时，该字段不会被召回和展示。默认为 false
         * <p> 示例值：true
         */
        this.isReturnable = builder.isReturnable;
        /**
         * 属性排序的可选配置，当 is_sortable 为 true 时，该字段为必填字段
         * <p> 示例值：
         */
        this.sortOptions = builder.sortOptions;
        /**
         * 相关类型数据的定义和约束
         * <p> 示例值：
         */
        this.typeDefinitions = builder.typeDefinitions;
        /**
         * 属性搜索的可选配置，当 is_searchable 为 true 时，该字段为必填参数
         * <p> 示例值：
         */
        this.searchOptions = builder.searchOptions;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    public Boolean getIsSortable() {
        return this.isSortable;
    }

    public void setIsSortable(Boolean isSortable) {
        this.isSortable = isSortable;
    }

    public Boolean getIsReturnable() {
        return this.isReturnable;
    }

    public void setIsReturnable(Boolean isReturnable) {
        this.isReturnable = isReturnable;
    }

    public SchemaSortOptions getSortOptions() {
        return this.sortOptions;
    }

    public void setSortOptions(SchemaSortOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    public SchemaTypeDefinitions getTypeDefinitions() {
        return this.typeDefinitions;
    }

    public void setTypeDefinitions(SchemaTypeDefinitions typeDefinitions) {
        this.typeDefinitions = typeDefinitions;
    }

    public SchemaSearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    public void setSearchOptions(SchemaSearchOptions searchOptions) {
        this.searchOptions = searchOptions;
    }

    public static class Builder {
        /**
         * 属性名
         * <p> 示例值：summary
         */
        private String name;
        /**
         * 属性类型
         * <p> 示例值：text
         */
        private String type;
        /**
         * 该属性是否可用作搜索，默认为 false
         * <p> 示例值：true
         */
        private Boolean isSearchable;
        /**
         * 该属性是否可用作搜索结果排序，默认为 false。如果为 true，需要再配置 sortOptions
         * <p> 示例值：false
         */
        private Boolean isSortable;
        /**
         * 该属性是否可用作返回字段，为 false 时，该字段不会被召回和展示。默认为 false
         * <p> 示例值：true
         */
        private Boolean isReturnable;
        /**
         * 属性排序的可选配置，当 is_sortable 为 true 时，该字段为必填字段
         * <p> 示例值：
         */
        private SchemaSortOptions sortOptions;
        /**
         * 相关类型数据的定义和约束
         * <p> 示例值：
         */
        private SchemaTypeDefinitions typeDefinitions;
        /**
         * 属性搜索的可选配置，当 is_searchable 为 true 时，该字段为必填参数
         * <p> 示例值：
         */
        private SchemaSearchOptions searchOptions;

        /**
         * 属性名
         * <p> 示例值：summary
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 属性类型
         * <p> 示例值：text
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 属性类型
         * <p> 示例值：text
         *
         * @param type {@link com.lark.oapi.service.search.v2.enums.SchemaPropertySchemaPropertyTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.search.v2.enums.SchemaPropertySchemaPropertyTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 该属性是否可用作搜索，默认为 false
         * <p> 示例值：true
         *
         * @param isSearchable
         * @return
         */
        public Builder isSearchable(Boolean isSearchable) {
            this.isSearchable = isSearchable;
            return this;
        }


        /**
         * 该属性是否可用作搜索结果排序，默认为 false。如果为 true，需要再配置 sortOptions
         * <p> 示例值：false
         *
         * @param isSortable
         * @return
         */
        public Builder isSortable(Boolean isSortable) {
            this.isSortable = isSortable;
            return this;
        }


        /**
         * 该属性是否可用作返回字段，为 false 时，该字段不会被召回和展示。默认为 false
         * <p> 示例值：true
         *
         * @param isReturnable
         * @return
         */
        public Builder isReturnable(Boolean isReturnable) {
            this.isReturnable = isReturnable;
            return this;
        }


        /**
         * 属性排序的可选配置，当 is_sortable 为 true 时，该字段为必填字段
         * <p> 示例值：
         *
         * @param sortOptions
         * @return
         */
        public Builder sortOptions(SchemaSortOptions sortOptions) {
            this.sortOptions = sortOptions;
            return this;
        }


        /**
         * 相关类型数据的定义和约束
         * <p> 示例值：
         *
         * @param typeDefinitions
         * @return
         */
        public Builder typeDefinitions(SchemaTypeDefinitions typeDefinitions) {
            this.typeDefinitions = typeDefinitions;
            return this;
        }


        /**
         * 属性搜索的可选配置，当 is_searchable 为 true 时，该字段为必填参数
         * <p> 示例值：
         *
         * @param searchOptions
         * @return
         */
        public Builder searchOptions(SchemaSearchOptions searchOptions) {
            this.searchOptions = searchOptions;
            return this;
        }


        public SchemaProperty build() {
            return new SchemaProperty(this);
        }
    }
}
