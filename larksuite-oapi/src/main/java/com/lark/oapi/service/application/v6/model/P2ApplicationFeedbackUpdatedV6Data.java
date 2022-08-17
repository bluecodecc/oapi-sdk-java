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

public class P2ApplicationFeedbackUpdatedV6Data {

  @SerializedName("feedback_ids")
  private String[] feedbackIds;
  @SerializedName("status")
  private Integer status;
  @SerializedName("app_id")
  private String appId;
  @SerializedName("update_time")
  private String updateTime;
  @SerializedName("operator_id")
  private UserId operatorId;

  public String[] getFeedbackIds() {
    return this.feedbackIds;
  }

  public void setFeedbackIds(String[] feedbackIds) {
    this.feedbackIds = feedbackIds;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public UserId getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(UserId operatorId) {
    this.operatorId = operatorId;
  }

}