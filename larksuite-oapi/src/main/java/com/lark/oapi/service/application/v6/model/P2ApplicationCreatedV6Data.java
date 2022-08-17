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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class P2ApplicationCreatedV6Data {

  @SerializedName("operator_id")
  private UserId operatorId;
  @SerializedName("app_id")
  private String appId;
  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("avatar")
  private String avatar;
  @SerializedName("app_scene_type")
  private Integer appSceneType;
  @SerializedName("primary_language")
  private String primaryLanguage;

  public UserId getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(UserId operatorId) {
    this.operatorId = operatorId;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
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

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Integer getAppSceneType() {
    return this.appSceneType;
  }

  public void setAppSceneType(Integer appSceneType) {
    this.appSceneType = appSceneType;
  }

  public String getPrimaryLanguage() {
    return this.primaryLanguage;
  }

  public void setPrimaryLanguage(String primaryLanguage) {
    this.primaryLanguage = primaryLanguage;
  }

}