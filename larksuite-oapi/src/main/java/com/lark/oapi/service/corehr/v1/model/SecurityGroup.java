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

public class SecurityGroup {
    /**
     * 角色ID
     * <p> 示例值：7034393015968122400
     */
    @SerializedName("id")
    private String id;
    /**
     * 角色code，通常用于与其他系统进行交互
     * <p> 示例值：department_manager
     */
    @SerializedName("code")
    private String code;
    /**
     * 角色名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private Name name;
    /**
     * 状态，1 = Inactive / 停用，;2 = Active / 启用，3 = TobeActivated / 待启用
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;
    /**
     * 角色描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private Name description;
    /**
     * 更新时间
     * <p> 示例值：1
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public SecurityGroup() {
    }

    public SecurityGroup(Builder builder) {
        /**
         * 角色ID
         * <p> 示例值：7034393015968122400
         */
        this.id = builder.id;
        /**
         * 角色code，通常用于与其他系统进行交互
         * <p> 示例值：department_manager
         */
        this.code = builder.code;
        /**
         * 角色名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 状态，1 = Inactive / 停用，;2 = Active / 启用，3 = TobeActivated / 待启用
         * <p> 示例值：1
         */
        this.activeStatus = builder.activeStatus;
        /**
         * 角色描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 更新时间
         * <p> 示例值：1
         */
        this.updateTime = builder.updateTime;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Name getDescription() {
        return this.description;
    }

    public void setDescription(Name description) {
        this.description = description;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 角色ID
         * <p> 示例值：7034393015968122400
         */
        private String id;
        /**
         * 角色code，通常用于与其他系统进行交互
         * <p> 示例值：department_manager
         */
        private String code;
        /**
         * 角色名称
         * <p> 示例值：
         */
        private Name name;
        /**
         * 状态，1 = Inactive / 停用，;2 = Active / 启用，3 = TobeActivated / 待启用
         * <p> 示例值：1
         */
        private Integer activeStatus;
        /**
         * 角色描述
         * <p> 示例值：
         */
        private Name description;
        /**
         * 更新时间
         * <p> 示例值：1
         */
        private String updateTime;

        /**
         * 角色ID
         * <p> 示例值：7034393015968122400
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 角色code，通常用于与其他系统进行交互
         * <p> 示例值：department_manager
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 角色名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }


        /**
         * 状态，1 = Inactive / 停用，;2 = Active / 启用，3 = TobeActivated / 待启用
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
         * 角色描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(Name description) {
            this.description = description;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：1
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public SecurityGroup build() {
            return new SecurityGroup(this);
        }
    }
}
