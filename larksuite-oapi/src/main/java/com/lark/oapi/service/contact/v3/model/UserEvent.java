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

public class UserEvent {
    /**
     * 用户的open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 用户的union_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：on_576833b917gda3d939b9a3c2d53e72c8
     */
    @SerializedName("union_id")
    private String unionId;
    /**
     * 租户内用户的唯一标识 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：e33ggbyz
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户名
     * <p> 示例值：张三
     */
    @SerializedName("name")
    private String name;
    /**
     * 英文名
     * <p> 示例值：San Zhang
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 别名
     * <p> 示例值：Sunny Zhang
     */
    @SerializedName("nickname")
    private String nickname;
    /**
     * 邮箱
     * <p> 示例值：zhangsan@gmail.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 企业邮箱
     * <p> 示例值：demo@mail.com
     */
    @SerializedName("enterprise_email")
    private String enterpriseEmail;
    /**
     * 职务
     * <p> 示例值：软件工程师
     */
    @SerializedName("job_title")
    private String jobTitle;
    /**
     * 手机号
     * <p> 示例值：12345678910
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 性别
     * <p> 示例值：1
     */
    @SerializedName("gender")
    private Integer gender;
    /**
     * 用户头像信息
     * <p> 示例值：
     */
    @SerializedName("avatar")
    private AvatarInfo avatar;
    /**
     * 用户状态
     * <p> 示例值：
     */
    @SerializedName("status")
    private UserStatus status;
    /**
     * 用户所属部门的ID列表
     * <p> 示例值：
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 用户的直接主管的用户open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_3ghm8a2u0eftg0ff377125s5dd275z09
     */
    @SerializedName("leader_user_id")
    private String leaderUserId;
    /**
     * 城市
     * <p> 示例值：杭州
     */
    @SerializedName("city")
    private String city;
    /**
     * 国家
     * <p> 示例值：中国
     */
    @SerializedName("country")
    private String country;
    /**
     * 工位
     * <p> 示例值：杭州
     */
    @SerializedName("work_station")
    private String workStation;
    /**
     * 入职时间
     * <p> 示例值：1615381702
     */
    @SerializedName("join_time")
    private Integer joinTime;
    /**
     * 工号
     * <p> 示例值：e33ggbyz
     */
    @SerializedName("employee_no")
    private String employeeNo;
    /**
     * 员工类型
     * <p> 示例值：1
     */
    @SerializedName("employee_type")
    private Integer employeeType;
    /**
     * 用户排序信息
     * <p> 示例值：
     */
    @SerializedName("orders")
    private UserOrder[] orders;
    /**
     * 自定义属性
     * <p> 示例值：
     */
    @SerializedName("custom_attrs")
    private UserCustomAttr[] customAttrs;

    // builder 开始
    public UserEvent() {
    }

    public UserEvent(Builder builder) {
        /**
         * 用户的open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.openId = builder.openId;
        /**
         * 用户的union_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_576833b917gda3d939b9a3c2d53e72c8
         */
        this.unionId = builder.unionId;
        /**
         * 租户内用户的唯一标识 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：e33ggbyz
         */
        this.userId = builder.userId;
        /**
         * 用户名
         * <p> 示例值：张三
         */
        this.name = builder.name;
        /**
         * 英文名
         * <p> 示例值：San Zhang
         */
        this.enName = builder.enName;
        /**
         * 别名
         * <p> 示例值：Sunny Zhang
         */
        this.nickname = builder.nickname;
        /**
         * 邮箱
         * <p> 示例值：zhangsan@gmail.com
         */
        this.email = builder.email;
        /**
         * 企业邮箱
         * <p> 示例值：demo@mail.com
         */
        this.enterpriseEmail = builder.enterpriseEmail;
        /**
         * 职务
         * <p> 示例值：软件工程师
         */
        this.jobTitle = builder.jobTitle;
        /**
         * 手机号
         * <p> 示例值：12345678910
         */
        this.mobile = builder.mobile;
        /**
         * 性别
         * <p> 示例值：1
         */
        this.gender = builder.gender;
        /**
         * 用户头像信息
         * <p> 示例值：
         */
        this.avatar = builder.avatar;
        /**
         * 用户状态
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         * 用户所属部门的ID列表
         * <p> 示例值：
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 用户的直接主管的用户open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_3ghm8a2u0eftg0ff377125s5dd275z09
         */
        this.leaderUserId = builder.leaderUserId;
        /**
         * 城市
         * <p> 示例值：杭州
         */
        this.city = builder.city;
        /**
         * 国家
         * <p> 示例值：中国
         */
        this.country = builder.country;
        /**
         * 工位
         * <p> 示例值：杭州
         */
        this.workStation = builder.workStation;
        /**
         * 入职时间
         * <p> 示例值：1615381702
         */
        this.joinTime = builder.joinTime;
        /**
         * 工号
         * <p> 示例值：e33ggbyz
         */
        this.employeeNo = builder.employeeNo;
        /**
         * 员工类型
         * <p> 示例值：1
         */
        this.employeeType = builder.employeeType;
        /**
         * 用户排序信息
         * <p> 示例值：
         */
        this.orders = builder.orders;
        /**
         * 自定义属性
         * <p> 示例值：
         */
        this.customAttrs = builder.customAttrs;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterpriseEmail() {
        return this.enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public AvatarInfo getAvatar() {
        return this.avatar;
    }

    public void setAvatar(AvatarInfo avatar) {
        this.avatar = avatar;
    }

    public UserStatus getStatus() {
        return this.status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getLeaderUserId() {
        return this.leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWorkStation() {
        return this.workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public Integer getJoinTime() {
        return this.joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }

    public UserOrder[] getOrders() {
        return this.orders;
    }

    public void setOrders(UserOrder[] orders) {
        this.orders = orders;
    }

    public UserCustomAttr[] getCustomAttrs() {
        return this.customAttrs;
    }

    public void setCustomAttrs(UserCustomAttr[] customAttrs) {
        this.customAttrs = customAttrs;
    }

    public static class Builder {
        /**
         * 用户的open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String openId;
        /**
         * 用户的union_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_576833b917gda3d939b9a3c2d53e72c8
         */
        private String unionId;
        /**
         * 租户内用户的唯一标识 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：e33ggbyz
         */
        private String userId;
        /**
         * 用户名
         * <p> 示例值：张三
         */
        private String name;
        /**
         * 英文名
         * <p> 示例值：San Zhang
         */
        private String enName;
        /**
         * 别名
         * <p> 示例值：Sunny Zhang
         */
        private String nickname;
        /**
         * 邮箱
         * <p> 示例值：zhangsan@gmail.com
         */
        private String email;
        /**
         * 企业邮箱
         * <p> 示例值：demo@mail.com
         */
        private String enterpriseEmail;
        /**
         * 职务
         * <p> 示例值：软件工程师
         */
        private String jobTitle;
        /**
         * 手机号
         * <p> 示例值：12345678910
         */
        private String mobile;
        /**
         * 性别
         * <p> 示例值：1
         */
        private Integer gender;
        /**
         * 用户头像信息
         * <p> 示例值：
         */
        private AvatarInfo avatar;
        /**
         * 用户状态
         * <p> 示例值：
         */
        private UserStatus status;
        /**
         * 用户所属部门的ID列表
         * <p> 示例值：
         */
        private String[] departmentIds;
        /**
         * 用户的直接主管的用户open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_3ghm8a2u0eftg0ff377125s5dd275z09
         */
        private String leaderUserId;
        /**
         * 城市
         * <p> 示例值：杭州
         */
        private String city;
        /**
         * 国家
         * <p> 示例值：中国
         */
        private String country;
        /**
         * 工位
         * <p> 示例值：杭州
         */
        private String workStation;
        /**
         * 入职时间
         * <p> 示例值：1615381702
         */
        private Integer joinTime;
        /**
         * 工号
         * <p> 示例值：e33ggbyz
         */
        private String employeeNo;
        /**
         * 员工类型
         * <p> 示例值：1
         */
        private Integer employeeType;
        /**
         * 用户排序信息
         * <p> 示例值：
         */
        private UserOrder[] orders;
        /**
         * 自定义属性
         * <p> 示例值：
         */
        private UserCustomAttr[] customAttrs;

        /**
         * 用户的open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param openId
         * @return
         */
        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }


        /**
         * 用户的union_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_576833b917gda3d939b9a3c2d53e72c8
         *
         * @param unionId
         * @return
         */
        public Builder unionId(String unionId) {
            this.unionId = unionId;
            return this;
        }


        /**
         * 租户内用户的唯一标识 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：e33ggbyz
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户名
         * <p> 示例值：张三
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 英文名
         * <p> 示例值：San Zhang
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 别名
         * <p> 示例值：Sunny Zhang
         *
         * @param nickname
         * @return
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：zhangsan@gmail.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 企业邮箱
         * <p> 示例值：demo@mail.com
         *
         * @param enterpriseEmail
         * @return
         */
        public Builder enterpriseEmail(String enterpriseEmail) {
            this.enterpriseEmail = enterpriseEmail;
            return this;
        }


        /**
         * 职务
         * <p> 示例值：软件工程师
         *
         * @param jobTitle
         * @return
         */
        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }


        /**
         * 手机号
         * <p> 示例值：12345678910
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 性别
         * <p> 示例值：1
         *
         * @param gender
         * @return
         */
        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        /**
         * 性别
         * <p> 示例值：1
         *
         * @param gender {@link com.lark.oapi.service.contact.v3.enums.UserEventGenderEnum}
         * @return
         */
        public Builder gender(com.lark.oapi.service.contact.v3.enums.UserEventGenderEnum gender) {
            this.gender = gender.getValue();
            return this;
        }


        /**
         * 用户头像信息
         * <p> 示例值：
         *
         * @param avatar
         * @return
         */
        public Builder avatar(AvatarInfo avatar) {
            this.avatar = avatar;
            return this;
        }


        /**
         * 用户状态
         * <p> 示例值：
         *
         * @param status
         * @return
         */
        public Builder status(UserStatus status) {
            this.status = status;
            return this;
        }


        /**
         * 用户所属部门的ID列表
         * <p> 示例值：
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 用户的直接主管的用户open_id [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_3ghm8a2u0eftg0ff377125s5dd275z09
         *
         * @param leaderUserId
         * @return
         */
        public Builder leaderUserId(String leaderUserId) {
            this.leaderUserId = leaderUserId;
            return this;
        }


        /**
         * 城市
         * <p> 示例值：杭州
         *
         * @param city
         * @return
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }


        /**
         * 国家
         * <p> 示例值：中国
         *
         * @param country
         * @return
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }


        /**
         * 工位
         * <p> 示例值：杭州
         *
         * @param workStation
         * @return
         */
        public Builder workStation(String workStation) {
            this.workStation = workStation;
            return this;
        }


        /**
         * 入职时间
         * <p> 示例值：1615381702
         *
         * @param joinTime
         * @return
         */
        public Builder joinTime(Integer joinTime) {
            this.joinTime = joinTime;
            return this;
        }


        /**
         * 工号
         * <p> 示例值：e33ggbyz
         *
         * @param employeeNo
         * @return
         */
        public Builder employeeNo(String employeeNo) {
            this.employeeNo = employeeNo;
            return this;
        }


        /**
         * 员工类型
         * <p> 示例值：1
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(Integer employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        /**
         * 员工类型
         * <p> 示例值：1
         *
         * @param employeeType {@link com.lark.oapi.service.contact.v3.enums.UserEventEmployeeTypeEnum}
         * @return
         */
        public Builder employeeType(com.lark.oapi.service.contact.v3.enums.UserEventEmployeeTypeEnum employeeType) {
            this.employeeType = employeeType.getValue();
            return this;
        }


        /**
         * 用户排序信息
         * <p> 示例值：
         *
         * @param orders
         * @return
         */
        public Builder orders(UserOrder[] orders) {
            this.orders = orders;
            return this;
        }


        /**
         * 自定义属性
         * <p> 示例值：
         *
         * @param customAttrs
         * @return
         */
        public Builder customAttrs(UserCustomAttr[] customAttrs) {
            this.customAttrs = customAttrs;
            return this;
        }


        public UserEvent build() {
            return new UserEvent(this);
        }
    }
}
