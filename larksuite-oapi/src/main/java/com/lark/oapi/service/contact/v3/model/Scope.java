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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class Scope {
    /**
     * 部门对象
     * <p> 示例值：
     */
    @SerializedName("departments")
    private Department[] departments;
    /**
     * 用户对象
     * <p> 示例值：
     */
    @SerializedName("users")
    private User[] users;
    /**
     * 用户组对象
     * <p> 示例值：
     */
    @SerializedName("user_groups")
    private UserGroup[] userGroups;

    // builder 开始
    public Scope() {
    }

    public Scope(Builder builder) {
        /**
         * 部门对象
         * <p> 示例值：
         */
        this.departments = builder.departments;
        /**
         * 用户对象
         * <p> 示例值：
         */
        this.users = builder.users;
        /**
         * 用户组对象
         * <p> 示例值：
         */
        this.userGroups = builder.userGroups;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Department[] getDepartments() {
        return this.departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public User[] getUsers() {
        return this.users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public UserGroup[] getUserGroups() {
        return this.userGroups;
    }

    public void setUserGroups(UserGroup[] userGroups) {
        this.userGroups = userGroups;
    }

    public static class Builder {
        /**
         * 部门对象
         * <p> 示例值：
         */
        private Department[] departments;
        /**
         * 用户对象
         * <p> 示例值：
         */
        private User[] users;
        /**
         * 用户组对象
         * <p> 示例值：
         */
        private UserGroup[] userGroups;

        /**
         * 部门对象
         * <p> 示例值：
         *
         * @param departments
         * @return
         */
        public Builder departments(Department[] departments) {
            this.departments = departments;
            return this;
        }


        /**
         * 用户对象
         * <p> 示例值：
         *
         * @param users
         * @return
         */
        public Builder users(User[] users) {
            this.users = users;
            return this;
        }


        /**
         * 用户组对象
         * <p> 示例值：
         *
         * @param userGroups
         * @return
         */
        public Builder userGroups(UserGroup[] userGroups) {
            this.userGroups = userGroups;
            return this;
        }


        public Scope build() {
            return new Scope(this);
        }
    }
}
