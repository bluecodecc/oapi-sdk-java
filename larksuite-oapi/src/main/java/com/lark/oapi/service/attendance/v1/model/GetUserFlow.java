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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetUserFlow {

    /**
     * 用户工号
     * <p> 示例值：abd754f7
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 记录创建者的工号
     * <p> 示例值：abd754f7
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 打卡位置名称信息
     * <p> 示例值：西溪八方城
     */
    @SerializedName("location_name")
    private String locationName;
    /**
     * 打卡时间，精确到秒的时间戳
     * <p> 示例值：1611476284
     */
    @SerializedName("check_time")
    private String checkTime;
    /**
     * 打卡备注
     * <p> 示例值：上班打卡
     */
    @SerializedName("comment")
    private String comment;
    /**
     * 打卡记录ID
     * <p> 示例值：6709359313699356941
     */
    @SerializedName("record_id")
    private String recordId;
    /**
     * 打卡wifi ssid
     * <p> 示例值：b0:b8:67:5c:1d:72
     */
    @SerializedName("ssid")
    private String ssid;
    /**
     * 打卡wifi MAC地址
     * <p> 示例值：b0:b8:67:5c:1d:72
     */
    @SerializedName("bssid")
    private String bssid;
    /**
     * 是否为外勤打卡
     * <p> 示例值：true
     */
    @SerializedName("is_field")
    private Boolean isField;
    /**
     * 是否为wifi打卡
     * <p> 示例值：true
     */
    @SerializedName("is_wifi")
    private Boolean isWifi;
    /**
     * 记录生成方式
     * <p> 示例值：0
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 打卡照片列表
     * <p> 示例值：
     */
    @SerializedName("photo_urls")
    private String[] photoUrls;
    /**
     * 打卡结果
     * <p> 示例值：Invalid
     */
    @SerializedName("check_result")
    private String checkResult;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCheckTime() {
        return this.checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }


    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return this.bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public Boolean getIsField() {
        return this.isField;
    }

    public void setIsField(Boolean isField) {
        this.isField = isField;
    }

    public Boolean getIsWifi() {
        return this.isWifi;
    }

    public void setIsWifi(Boolean isWifi) {
        this.isWifi = isWifi;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String[] getPhotoUrls() {
        return this.photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }


    public String getCheckResult() {
        return this.checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

}
