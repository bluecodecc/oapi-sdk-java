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

public class User {
    /**
     * 用户的union_id，应用开发商发布的不同应用中同一用户的标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
     */
    @SerializedName("union_id")
    private String unionId;
    /**
     * 用户的user_id，租户内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：3e3cf96b
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户的open_id，应用内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("open_id")
    private String openId;
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
     * <p> 示例值：Alex Zhang
     */
    @SerializedName("nickname")
    private String nickname;
    /**
     * 邮箱;;注意：;1. 非中国大陆手机号成员必须同时添加邮箱;2. 邮箱不可重复
     * <p> 示例值：zhangsan@gmail.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 手机号，在本企业内不可重复；未认证企业仅支持添加中国大陆手机号，通过飞书认证的企业允许添加海外手机号，注意国际电话区号前缀中必须包含加号 +
     * <p> 示例值：13011111111 (其他例子，中国大陆手机号: 13011111111 或 +8613011111111, 非中国大陆手机号:  +41446681800)
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 手机号码可见性，true 为可见，false 为不可见，目前默认为 true。不可见时，组织员工将无法查看该员工的手机号码
     * <p> 示例值：false
     */
    @SerializedName("mobile_visible")
    private Boolean mobileVisible;
    /**
     * 性别
     * <p> 示例值：1
     */
    @SerializedName("gender")
    private Integer gender;
    /**
     * 头像的文件Key，可通过“消息与群组/消息/图片信息”中的“上传图片”接口上传并获取头像文件 Key;;“上传图片”功能参见[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
     * <p> 示例值：2500c7a9-5fff-4d9a-a2de-3d59614ae28g
     */
    @SerializedName("avatar_key")
    private String avatarKey;
    /**
     * 用户头像信息
     * <p> 示例值：
     */
    @SerializedName("avatar")
    private AvatarInfo avatar;
    /**
     * 用户状态，枚举类型，包括is_frozen、is_resigned、is_activated、is_exited 。;;用户状态转移参见：[用户状态图](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/field-overview#4302b5a1)
     * <p> 示例值：
     */
    @SerializedName("status")
    private UserStatus status;
    /**
     * 用户所属部门的ID列表，一个用户可属于多个部门。;;ID值的类型与查询参数中的department_id_type 对应。;;不同 ID 的说明与department_id的获取方式参见 [部门ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview#23857fe0)
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 用户的直接主管的用户ID，ID值与查询参数中的user_id_type 对应。;;不同 ID 的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction);;获取方式参见[如何获取user_id](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("leader_user_id")
    private String leaderUserId;
    /**
     * 工作城市
     * <p> 示例值：杭州
     */
    @SerializedName("city")
    private String city;
    /**
     * 国家或地区Code缩写，具体写入格式请参考 [国家/地区码表](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/country-code-description)
     * <p> 示例值：CN
     */
    @SerializedName("country")
    private String country;
    /**
     * 工位
     * <p> 示例值：北楼-H34
     */
    @SerializedName("work_station")
    private String workStation;
    /**
     * 入职时间，时间戳格式，表示从1970年1月1日开始所经过的秒数
     * <p> 示例值：2147483647
     */
    @SerializedName("join_time")
    private Integer joinTime;
    /**
     * 是否是租户超级管理员
     * <p> 示例值：false
     */
    @SerializedName("is_tenant_manager")
    private Boolean isTenantManager;
    /**
     * 工号
     * <p> 示例值：1
     */
    @SerializedName("employee_no")
    private String employeeNo;
    /**
     * 员工类型，可选值有：;- `1`：正式员工;- `2`：实习生;- `3`：外包;- `4`：劳务;- `5`：顾问   ;同时可读取到自定义员工类型的 int 值，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)
     * <p> 示例值：1
     */
    @SerializedName("employee_type")
    private Integer employeeType;
    /**
     * 用户排序信息。;;用于标记通讯录下组织架构的人员顺序，人员可能存在多个部门中，且有不同的排序。
     * <p> 示例值：
     */
    @SerializedName("orders")
    private UserOrder[] orders;
    /**
     * 自定义字段，请确保你的组织管理员已在管理后台/组织架构/成员字段管理/自定义字段管理/全局设置中开启了“允许开放平台 API 调用“，否则该字段不会生效/返回。;;更多详情参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
     * <p> 示例值：
     */
    @SerializedName("custom_attrs")
    private UserCustomAttr[] customAttrs;
    /**
     * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务;;创建用户时，企业邮箱的使用方式参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
     * <p> 示例值：demo@mail.com
     */
    @SerializedName("enterprise_email")
    private String enterpriseEmail;
    /**
     * 职务
     * <p> 示例值：xxxxx
     */
    @SerializedName("job_title")
    private String jobTitle;
    /**
     * 是否暂停用户
     * <p> 示例值：false
     */
    @SerializedName("is_frozen")
    private Boolean isFrozen;
    /**
     * 职级ID
     * <p> 示例值：mga5oa8ayjlp9rb
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 序列ID
     * <p> 示例值：mga5oa8ayjlp9rb
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 分配给用户的席位ID列表
     * <p> 示例值：
     */
    @SerializedName("subscription_ids")
    private String[] subscriptionIds;
    /**
     * 用户席位列表
     * <p> 示例值：
     */
    @SerializedName("assign_info")
    private UserAssignInfo[] assignInfo;

    // builder 开始
    public User() {
    }

    public User(Builder builder) {
        /**
         * 用户的union_id，应用开发商发布的不同应用中同一用户的标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         */
        this.unionId = builder.unionId;
        /**
         * 用户的user_id，租户内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：3e3cf96b
         */
        this.userId = builder.userId;
        /**
         * 用户的open_id，应用内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.openId = builder.openId;
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
         * <p> 示例值：Alex Zhang
         */
        this.nickname = builder.nickname;
        /**
         * 邮箱;;注意：;1. 非中国大陆手机号成员必须同时添加邮箱;2. 邮箱不可重复
         * <p> 示例值：zhangsan@gmail.com
         */
        this.email = builder.email;
        /**
         * 手机号，在本企业内不可重复；未认证企业仅支持添加中国大陆手机号，通过飞书认证的企业允许添加海外手机号，注意国际电话区号前缀中必须包含加号 +
         * <p> 示例值：13011111111 (其他例子，中国大陆手机号: 13011111111 或 +8613011111111, 非中国大陆手机号:  +41446681800)
         */
        this.mobile = builder.mobile;
        /**
         * 手机号码可见性，true 为可见，false 为不可见，目前默认为 true。不可见时，组织员工将无法查看该员工的手机号码
         * <p> 示例值：false
         */
        this.mobileVisible = builder.mobileVisible;
        /**
         * 性别
         * <p> 示例值：1
         */
        this.gender = builder.gender;
        /**
         * 头像的文件Key，可通过“消息与群组/消息/图片信息”中的“上传图片”接口上传并获取头像文件 Key;;“上传图片”功能参见[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
         * <p> 示例值：2500c7a9-5fff-4d9a-a2de-3d59614ae28g
         */
        this.avatarKey = builder.avatarKey;
        /**
         * 用户头像信息
         * <p> 示例值：
         */
        this.avatar = builder.avatar;
        /**
         * 用户状态，枚举类型，包括is_frozen、is_resigned、is_activated、is_exited 。;;用户状态转移参见：[用户状态图](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/field-overview#4302b5a1)
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         * 用户所属部门的ID列表，一个用户可属于多个部门。;;ID值的类型与查询参数中的department_id_type 对应。;;不同 ID 的说明与department_id的获取方式参见 [部门ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview#23857fe0)
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 用户的直接主管的用户ID，ID值与查询参数中的user_id_type 对应。;;不同 ID 的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction);;获取方式参见[如何获取user_id](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.leaderUserId = builder.leaderUserId;
        /**
         * 工作城市
         * <p> 示例值：杭州
         */
        this.city = builder.city;
        /**
         * 国家或地区Code缩写，具体写入格式请参考 [国家/地区码表](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/country-code-description)
         * <p> 示例值：CN
         */
        this.country = builder.country;
        /**
         * 工位
         * <p> 示例值：北楼-H34
         */
        this.workStation = builder.workStation;
        /**
         * 入职时间，时间戳格式，表示从1970年1月1日开始所经过的秒数
         * <p> 示例值：2147483647
         */
        this.joinTime = builder.joinTime;
        /**
         * 是否是租户超级管理员
         * <p> 示例值：false
         */
        this.isTenantManager = builder.isTenantManager;
        /**
         * 工号
         * <p> 示例值：1
         */
        this.employeeNo = builder.employeeNo;
        /**
         * 员工类型，可选值有：;- `1`：正式员工;- `2`：实习生;- `3`：外包;- `4`：劳务;- `5`：顾问   ;同时可读取到自定义员工类型的 int 值，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)
         * <p> 示例值：1
         */
        this.employeeType = builder.employeeType;
        /**
         * 用户排序信息。;;用于标记通讯录下组织架构的人员顺序，人员可能存在多个部门中，且有不同的排序。
         * <p> 示例值：
         */
        this.orders = builder.orders;
        /**
         * 自定义字段，请确保你的组织管理员已在管理后台/组织架构/成员字段管理/自定义字段管理/全局设置中开启了“允许开放平台 API 调用“，否则该字段不会生效/返回。;;更多详情参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
         * <p> 示例值：
         */
        this.customAttrs = builder.customAttrs;
        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务;;创建用户时，企业邮箱的使用方式参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
         * <p> 示例值：demo@mail.com
         */
        this.enterpriseEmail = builder.enterpriseEmail;
        /**
         * 职务
         * <p> 示例值：xxxxx
         */
        this.jobTitle = builder.jobTitle;
        /**
         * 是否暂停用户
         * <p> 示例值：false
         */
        this.isFrozen = builder.isFrozen;
        /**
         * 职级ID
         * <p> 示例值：mga5oa8ayjlp9rb
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 序列ID
         * <p> 示例值：mga5oa8ayjlp9rb
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 分配给用户的席位ID列表
         * <p> 示例值：
         */
        this.subscriptionIds = builder.subscriptionIds;
        /**
         * 用户席位列表
         * <p> 示例值：
         */
        this.assignInfo = builder.assignInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getMobileVisible() {
        return this.mobileVisible;
    }

    public void setMobileVisible(Boolean mobileVisible) {
        this.mobileVisible = mobileVisible;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public void setAvatarKey(String avatarKey) {
        this.avatarKey = avatarKey;
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

    public Boolean getIsTenantManager() {
        return this.isTenantManager;
    }

    public void setIsTenantManager(Boolean isTenantManager) {
        this.isTenantManager = isTenantManager;
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

    public Boolean getIsFrozen() {
        return this.isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String[] getSubscriptionIds() {
        return this.subscriptionIds;
    }

    public void setSubscriptionIds(String[] subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    public UserAssignInfo[] getAssignInfo() {
        return this.assignInfo;
    }

    public void setAssignInfo(UserAssignInfo[] assignInfo) {
        this.assignInfo = assignInfo;
    }

    public static class Builder {
        /**
         * 用户的union_id，应用开发商发布的不同应用中同一用户的标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         */
        private String unionId;
        /**
         * 用户的user_id，租户内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：3e3cf96b
         */
        private String userId;
        /**
         * 用户的open_id，应用内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String openId;
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
         * <p> 示例值：Alex Zhang
         */
        private String nickname;
        /**
         * 邮箱;;注意：;1. 非中国大陆手机号成员必须同时添加邮箱;2. 邮箱不可重复
         * <p> 示例值：zhangsan@gmail.com
         */
        private String email;
        /**
         * 手机号，在本企业内不可重复；未认证企业仅支持添加中国大陆手机号，通过飞书认证的企业允许添加海外手机号，注意国际电话区号前缀中必须包含加号 +
         * <p> 示例值：13011111111 (其他例子，中国大陆手机号: 13011111111 或 +8613011111111, 非中国大陆手机号:  +41446681800)
         */
        private String mobile;
        /**
         * 手机号码可见性，true 为可见，false 为不可见，目前默认为 true。不可见时，组织员工将无法查看该员工的手机号码
         * <p> 示例值：false
         */
        private Boolean mobileVisible;
        /**
         * 性别
         * <p> 示例值：1
         */
        private Integer gender;
        /**
         * 头像的文件Key，可通过“消息与群组/消息/图片信息”中的“上传图片”接口上传并获取头像文件 Key;;“上传图片”功能参见[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
         * <p> 示例值：2500c7a9-5fff-4d9a-a2de-3d59614ae28g
         */
        private String avatarKey;
        /**
         * 用户头像信息
         * <p> 示例值：
         */
        private AvatarInfo avatar;
        /**
         * 用户状态，枚举类型，包括is_frozen、is_resigned、is_activated、is_exited 。;;用户状态转移参见：[用户状态图](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/field-overview#4302b5a1)
         * <p> 示例值：
         */
        private UserStatus status;
        /**
         * 用户所属部门的ID列表，一个用户可属于多个部门。;;ID值的类型与查询参数中的department_id_type 对应。;;不同 ID 的说明与department_id的获取方式参见 [部门ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview#23857fe0)
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        private String[] departmentIds;
        /**
         * 用户的直接主管的用户ID，ID值与查询参数中的user_id_type 对应。;;不同 ID 的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction);;获取方式参见[如何获取user_id](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String leaderUserId;
        /**
         * 工作城市
         * <p> 示例值：杭州
         */
        private String city;
        /**
         * 国家或地区Code缩写，具体写入格式请参考 [国家/地区码表](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/country-code-description)
         * <p> 示例值：CN
         */
        private String country;
        /**
         * 工位
         * <p> 示例值：北楼-H34
         */
        private String workStation;
        /**
         * 入职时间，时间戳格式，表示从1970年1月1日开始所经过的秒数
         * <p> 示例值：2147483647
         */
        private Integer joinTime;
        /**
         * 是否是租户超级管理员
         * <p> 示例值：false
         */
        private Boolean isTenantManager;
        /**
         * 工号
         * <p> 示例值：1
         */
        private String employeeNo;
        /**
         * 员工类型，可选值有：;- `1`：正式员工;- `2`：实习生;- `3`：外包;- `4`：劳务;- `5`：顾问   ;同时可读取到自定义员工类型的 int 值，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)
         * <p> 示例值：1
         */
        private Integer employeeType;
        /**
         * 用户排序信息。;;用于标记通讯录下组织架构的人员顺序，人员可能存在多个部门中，且有不同的排序。
         * <p> 示例值：
         */
        private UserOrder[] orders;
        /**
         * 自定义字段，请确保你的组织管理员已在管理后台/组织架构/成员字段管理/自定义字段管理/全局设置中开启了“允许开放平台 API 调用“，否则该字段不会生效/返回。;;更多详情参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
         * <p> 示例值：
         */
        private UserCustomAttr[] customAttrs;
        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务;;创建用户时，企业邮箱的使用方式参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
         * <p> 示例值：demo@mail.com
         */
        private String enterpriseEmail;
        /**
         * 职务
         * <p> 示例值：xxxxx
         */
        private String jobTitle;
        /**
         * 是否暂停用户
         * <p> 示例值：false
         */
        private Boolean isFrozen;
        /**
         * 职级ID
         * <p> 示例值：mga5oa8ayjlp9rb
         */
        private String jobLevelId;
        /**
         * 序列ID
         * <p> 示例值：mga5oa8ayjlp9rb
         */
        private String jobFamilyId;
        /**
         * 分配给用户的席位ID列表
         * <p> 示例值：
         */
        private String[] subscriptionIds;
        /**
         * 用户席位列表
         * <p> 示例值：
         */
        private UserAssignInfo[] assignInfo;

        /**
         * 用户的union_id，应用开发商发布的不同应用中同一用户的标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         *
         * @param unionId
         * @return
         */
        public Builder unionId(String unionId) {
            this.unionId = unionId;
            return this;
        }


        /**
         * 用户的user_id，租户内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：3e3cf96b
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户的open_id，应用内用户的唯一标识，不同ID的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
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
         * <p> 示例值：Alex Zhang
         *
         * @param nickname
         * @return
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }


        /**
         * 邮箱;;注意：;1. 非中国大陆手机号成员必须同时添加邮箱;2. 邮箱不可重复
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
         * 手机号，在本企业内不可重复；未认证企业仅支持添加中国大陆手机号，通过飞书认证的企业允许添加海外手机号，注意国际电话区号前缀中必须包含加号 +
         * <p> 示例值：13011111111 (其他例子，中国大陆手机号: 13011111111 或 +8613011111111, 非中国大陆手机号:  +41446681800)
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 手机号码可见性，true 为可见，false 为不可见，目前默认为 true。不可见时，组织员工将无法查看该员工的手机号码
         * <p> 示例值：false
         *
         * @param mobileVisible
         * @return
         */
        public Builder mobileVisible(Boolean mobileVisible) {
            this.mobileVisible = mobileVisible;
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
         * @param gender {@link com.lark.oapi.service.contact.v3.enums.UserGenderTypeEnum}
         * @return
         */
        public Builder gender(com.lark.oapi.service.contact.v3.enums.UserGenderTypeEnum gender) {
            this.gender = gender.getValue();
            return this;
        }


        /**
         * 头像的文件Key，可通过“消息与群组/消息/图片信息”中的“上传图片”接口上传并获取头像文件 Key;;“上传图片”功能参见[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
         * <p> 示例值：2500c7a9-5fff-4d9a-a2de-3d59614ae28g
         *
         * @param avatarKey
         * @return
         */
        public Builder avatarKey(String avatarKey) {
            this.avatarKey = avatarKey;
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
         * 用户状态，枚举类型，包括is_frozen、is_resigned、is_activated、is_exited 。;;用户状态转移参见：[用户状态图](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/field-overview#4302b5a1)
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
         * 用户所属部门的ID列表，一个用户可属于多个部门。;;ID值的类型与查询参数中的department_id_type 对应。;;不同 ID 的说明与department_id的获取方式参见 [部门ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview#23857fe0)
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 用户的直接主管的用户ID，ID值与查询参数中的user_id_type 对应。;;不同 ID 的说明参见 [用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction);;获取方式参见[如何获取user_id](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param leaderUserId
         * @return
         */
        public Builder leaderUserId(String leaderUserId) {
            this.leaderUserId = leaderUserId;
            return this;
        }


        /**
         * 工作城市
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
         * 国家或地区Code缩写，具体写入格式请参考 [国家/地区码表](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/country-code-description)
         * <p> 示例值：CN
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
         * <p> 示例值：北楼-H34
         *
         * @param workStation
         * @return
         */
        public Builder workStation(String workStation) {
            this.workStation = workStation;
            return this;
        }


        /**
         * 入职时间，时间戳格式，表示从1970年1月1日开始所经过的秒数
         * <p> 示例值：2147483647
         *
         * @param joinTime
         * @return
         */
        public Builder joinTime(Integer joinTime) {
            this.joinTime = joinTime;
            return this;
        }


        /**
         * 是否是租户超级管理员
         * <p> 示例值：false
         *
         * @param isTenantManager
         * @return
         */
        public Builder isTenantManager(Boolean isTenantManager) {
            this.isTenantManager = isTenantManager;
            return this;
        }


        /**
         * 工号
         * <p> 示例值：1
         *
         * @param employeeNo
         * @return
         */
        public Builder employeeNo(String employeeNo) {
            this.employeeNo = employeeNo;
            return this;
        }


        /**
         * 员工类型，可选值有：;- `1`：正式员工;- `2`：实习生;- `3`：外包;- `4`：劳务;- `5`：顾问   ;同时可读取到自定义员工类型的 int 值，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)
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
         * 用户排序信息。;;用于标记通讯录下组织架构的人员顺序，人员可能存在多个部门中，且有不同的排序。
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
         * 自定义字段，请确保你的组织管理员已在管理后台/组织架构/成员字段管理/自定义字段管理/全局设置中开启了“允许开放平台 API 调用“，否则该字段不会生效/返回。;;更多详情参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
         * <p> 示例值：
         *
         * @param customAttrs
         * @return
         */
        public Builder customAttrs(UserCustomAttr[] customAttrs) {
            this.customAttrs = customAttrs;
            return this;
        }


        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务;;创建用户时，企业邮箱的使用方式参见[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
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
         * <p> 示例值：xxxxx
         *
         * @param jobTitle
         * @return
         */
        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }


        /**
         * 是否暂停用户
         * <p> 示例值：false
         *
         * @param isFrozen
         * @return
         */
        public Builder isFrozen(Boolean isFrozen) {
            this.isFrozen = isFrozen;
            return this;
        }


        /**
         * 职级ID
         * <p> 示例值：mga5oa8ayjlp9rb
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 序列ID
         * <p> 示例值：mga5oa8ayjlp9rb
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 分配给用户的席位ID列表
         * <p> 示例值：
         *
         * @param subscriptionIds
         * @return
         */
        public Builder subscriptionIds(String[] subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            return this;
        }


        /**
         * 用户席位列表
         * <p> 示例值：
         *
         * @param assignInfo
         * @return
         */
        public Builder assignInfo(UserAssignInfo[] assignInfo) {
            this.assignInfo = assignInfo;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}
