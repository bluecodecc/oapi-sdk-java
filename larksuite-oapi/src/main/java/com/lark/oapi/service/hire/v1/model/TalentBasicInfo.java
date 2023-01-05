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

public class TalentBasicInfo {
    /**
     * 名字
     * <p> 示例值：测试
     */
    @SerializedName("name")
    private String name;
    /**
     * 手机
     * <p> 示例值：182900291190
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 手机国家区号
     * <p> 示例值：86
     */
    @SerializedName("mobile_code")
    private String mobileCode;
    /**
     * 手机国家代码
     * <p> 示例值：CN_1
     */
    @SerializedName("mobile_country_code")
    private String mobileCountryCode;
    /**
     * 邮箱
     * <p> 示例值：16xx1@126.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 工作年限
     * <p> 示例值：5
     */
    @SerializedName("experience_years")
    private Integer experienceYears;
    /**
     * 年龄
     * <p> 示例值：22
     */
    @SerializedName("age")
    private Integer age;
    /**
     * 国籍
     * <p> 示例值：
     */
    @SerializedName("nationality")
    private TalentNationality nationality;
    /**
     * 性别
     * <p> 示例值：1
     */
    @SerializedName("gender")
    private Integer gender;
    /**
     * 所在地点
     * <p> 示例值：
     */
    @SerializedName("current_city")
    private TalentCityInfo currentCity;
    /**
     * 家乡
     * <p> 示例值：
     */
    @SerializedName("hometown_city")
    private TalentCityInfo hometownCity;
    /**
     * 意向地点
     * <p> 示例值：
     */
    @SerializedName("preferred_city_list")
    private TalentCityInfo[] preferredCityList;
    /**
     * 证件类型
     * <p> 示例值：1
     */
    @SerializedName("identification_type")
    private Integer identificationType;
    /**
     * 证件号
     * <p> 示例值：511699199x1x111234
     */
    @SerializedName("identification_number")
    private String identificationNumber;
    /**
     * 证件信息
     * <p> 示例值：
     */
    @SerializedName("identification")
    private TalentIdentificationInfo identification;
    /**
     * 生日
     * <p> 示例值：293016767159
     */
    @SerializedName("birthday")
    private Integer birthday;
    /**
     * 创建人
     * <p> 示例值：ou-xxx
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 婚姻状况
     * <p> 示例值：1
     */
    @SerializedName("marital_status")
    private Integer maritalStatus;
    /**
     * 家庭住址
     * <p> 示例值：南京路1号
     */
    @SerializedName("current_home_address")
    private String currentHomeAddress;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data_list")
    private TalentCustomizedDataChild[] customizedDataList;
    /**
     * 修改时间
     * <p> 示例值：1634801678103
     */
    @SerializedName("modify_time")
    private String modifyTime;

    // builder 开始
    public TalentBasicInfo() {
    }

    public TalentBasicInfo(Builder builder) {
        /**
         * 名字
         * <p> 示例值：测试
         */
        this.name = builder.name;
        /**
         * 手机
         * <p> 示例值：182900291190
         */
        this.mobile = builder.mobile;
        /**
         * 手机国家区号
         * <p> 示例值：86
         */
        this.mobileCode = builder.mobileCode;
        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         */
        this.mobileCountryCode = builder.mobileCountryCode;
        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         */
        this.email = builder.email;
        /**
         * 工作年限
         * <p> 示例值：5
         */
        this.experienceYears = builder.experienceYears;
        /**
         * 年龄
         * <p> 示例值：22
         */
        this.age = builder.age;
        /**
         * 国籍
         * <p> 示例值：
         */
        this.nationality = builder.nationality;
        /**
         * 性别
         * <p> 示例值：1
         */
        this.gender = builder.gender;
        /**
         * 所在地点
         * <p> 示例值：
         */
        this.currentCity = builder.currentCity;
        /**
         * 家乡
         * <p> 示例值：
         */
        this.hometownCity = builder.hometownCity;
        /**
         * 意向地点
         * <p> 示例值：
         */
        this.preferredCityList = builder.preferredCityList;
        /**
         * 证件类型
         * <p> 示例值：1
         */
        this.identificationType = builder.identificationType;
        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         */
        this.identificationNumber = builder.identificationNumber;
        /**
         * 证件信息
         * <p> 示例值：
         */
        this.identification = builder.identification;
        /**
         * 生日
         * <p> 示例值：293016767159
         */
        this.birthday = builder.birthday;
        /**
         * 创建人
         * <p> 示例值：ou-xxx
         */
        this.creatorId = builder.creatorId;
        /**
         * 婚姻状况
         * <p> 示例值：1
         */
        this.maritalStatus = builder.maritalStatus;
        /**
         * 家庭住址
         * <p> 示例值：南京路1号
         */
        this.currentHomeAddress = builder.currentHomeAddress;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedDataList = builder.customizedDataList;
        /**
         * 修改时间
         * <p> 示例值：1634801678103
         */
        this.modifyTime = builder.modifyTime;
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

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCode() {
        return this.mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getExperienceYears() {
        return this.experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TalentNationality getNationality() {
        return this.nationality;
    }

    public void setNationality(TalentNationality nationality) {
        this.nationality = nationality;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public TalentCityInfo getCurrentCity() {
        return this.currentCity;
    }

    public void setCurrentCity(TalentCityInfo currentCity) {
        this.currentCity = currentCity;
    }

    public TalentCityInfo getHometownCity() {
        return this.hometownCity;
    }

    public void setHometownCity(TalentCityInfo hometownCity) {
        this.hometownCity = hometownCity;
    }

    public TalentCityInfo[] getPreferredCityList() {
        return this.preferredCityList;
    }

    public void setPreferredCityList(TalentCityInfo[] preferredCityList) {
        this.preferredCityList = preferredCityList;
    }

    public Integer getIdentificationType() {
        return this.identificationType;
    }

    public void setIdentificationType(Integer identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public TalentIdentificationInfo getIdentification() {
        return this.identification;
    }

    public void setIdentification(TalentIdentificationInfo identification) {
        this.identification = identification;
    }

    public Integer getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCurrentHomeAddress() {
        return this.currentHomeAddress;
    }

    public void setCurrentHomeAddress(String currentHomeAddress) {
        this.currentHomeAddress = currentHomeAddress;
    }

    public TalentCustomizedDataChild[] getCustomizedDataList() {
        return this.customizedDataList;
    }

    public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
        this.customizedDataList = customizedDataList;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public static class Builder {
        /**
         * 名字
         * <p> 示例值：测试
         */
        private String name;
        /**
         * 手机
         * <p> 示例值：182900291190
         */
        private String mobile;
        /**
         * 手机国家区号
         * <p> 示例值：86
         */
        private String mobileCode;
        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         */
        private String mobileCountryCode;
        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         */
        private String email;
        /**
         * 工作年限
         * <p> 示例值：5
         */
        private Integer experienceYears;
        /**
         * 年龄
         * <p> 示例值：22
         */
        private Integer age;
        /**
         * 国籍
         * <p> 示例值：
         */
        private TalentNationality nationality;
        /**
         * 性别
         * <p> 示例值：1
         */
        private Integer gender;
        /**
         * 所在地点
         * <p> 示例值：
         */
        private TalentCityInfo currentCity;
        /**
         * 家乡
         * <p> 示例值：
         */
        private TalentCityInfo hometownCity;
        /**
         * 意向地点
         * <p> 示例值：
         */
        private TalentCityInfo[] preferredCityList;
        /**
         * 证件类型
         * <p> 示例值：1
         */
        private Integer identificationType;
        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         */
        private String identificationNumber;
        /**
         * 证件信息
         * <p> 示例值：
         */
        private TalentIdentificationInfo identification;
        /**
         * 生日
         * <p> 示例值：293016767159
         */
        private Integer birthday;
        /**
         * 创建人
         * <p> 示例值：ou-xxx
         */
        private String creatorId;
        /**
         * 婚姻状况
         * <p> 示例值：1
         */
        private Integer maritalStatus;
        /**
         * 家庭住址
         * <p> 示例值：南京路1号
         */
        private String currentHomeAddress;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private TalentCustomizedDataChild[] customizedDataList;
        /**
         * 修改时间
         * <p> 示例值：1634801678103
         */
        private String modifyTime;

        /**
         * 名字
         * <p> 示例值：测试
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 手机
         * <p> 示例值：182900291190
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 手机国家区号
         * <p> 示例值：86
         *
         * @param mobileCode
         * @return
         */
        public Builder mobileCode(String mobileCode) {
            this.mobileCode = mobileCode;
            return this;
        }


        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         *
         * @param mobileCountryCode
         * @return
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 工作年限
         * <p> 示例值：5
         *
         * @param experienceYears
         * @return
         */
        public Builder experienceYears(Integer experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }


        /**
         * 年龄
         * <p> 示例值：22
         *
         * @param age
         * @return
         */
        public Builder age(Integer age) {
            this.age = age;
            return this;
        }


        /**
         * 国籍
         * <p> 示例值：
         *
         * @param nationality
         * @return
         */
        public Builder nationality(TalentNationality nationality) {
            this.nationality = nationality;
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
         * 所在地点
         * <p> 示例值：
         *
         * @param currentCity
         * @return
         */
        public Builder currentCity(TalentCityInfo currentCity) {
            this.currentCity = currentCity;
            return this;
        }


        /**
         * 家乡
         * <p> 示例值：
         *
         * @param hometownCity
         * @return
         */
        public Builder hometownCity(TalentCityInfo hometownCity) {
            this.hometownCity = hometownCity;
            return this;
        }


        /**
         * 意向地点
         * <p> 示例值：
         *
         * @param preferredCityList
         * @return
         */
        public Builder preferredCityList(TalentCityInfo[] preferredCityList) {
            this.preferredCityList = preferredCityList;
            return this;
        }


        /**
         * 证件类型
         * <p> 示例值：1
         *
         * @param identificationType
         * @return
         */
        public Builder identificationType(Integer identificationType) {
            this.identificationType = identificationType;
            return this;
        }


        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         *
         * @param identificationNumber
         * @return
         */
        public Builder identificationNumber(String identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }


        /**
         * 证件信息
         * <p> 示例值：
         *
         * @param identification
         * @return
         */
        public Builder identification(TalentIdentificationInfo identification) {
            this.identification = identification;
            return this;
        }


        /**
         * 生日
         * <p> 示例值：293016767159
         *
         * @param birthday
         * @return
         */
        public Builder birthday(Integer birthday) {
            this.birthday = birthday;
            return this;
        }


        /**
         * 创建人
         * <p> 示例值：ou-xxx
         *
         * @param creatorId
         * @return
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }


        /**
         * 婚姻状况
         * <p> 示例值：1
         *
         * @param maritalStatus
         * @return
         */
        public Builder maritalStatus(Integer maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }


        /**
         * 家庭住址
         * <p> 示例值：南京路1号
         *
         * @param currentHomeAddress
         * @return
         */
        public Builder currentHomeAddress(String currentHomeAddress) {
            this.currentHomeAddress = currentHomeAddress;
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


        /**
         * 修改时间
         * <p> 示例值：1634801678103
         *
         * @param modifyTime
         * @return
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }


        public TalentBasicInfo build() {
            return new TalentBasicInfo(this);
        }
    }
}
