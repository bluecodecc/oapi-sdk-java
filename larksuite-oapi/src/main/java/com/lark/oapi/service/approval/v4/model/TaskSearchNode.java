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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class TaskSearchNode {

  @SerializedName("user_id")
  private String userId;
  @SerializedName("start_time")
  private String startTime;
  @SerializedName("end_time")
  private String endTime;
  @SerializedName("status")
  private String status;
  @SerializedName("title")
  private String title;
  @SerializedName("extra")
  private String extra;
  @SerializedName("link")
  private InstanceSearchLink link;

  // builder 开始
  public TaskSearchNode() {
  }

  public TaskSearchNode(Builder builder) {
    this.userId = builder.userId;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.status = builder.status;
    this.title = builder.title;
    this.extra = builder.extra;
    this.link = builder.link;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public InstanceSearchLink getLink() {
    return this.link;
  }

  public void setLink(InstanceSearchLink link) {
    this.link = link;
  }

  public static class Builder {

    private String userId;
    private String startTime;
    private String endTime;
    private String status;
    private String title;
    private String extra;
    private InstanceSearchLink link;

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.approval.v4.enums.StatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    public Builder link(InstanceSearchLink link) {
      this.link = link;
      return this;
    }


    public TaskSearchNode build() {
      return new TaskSearchNode(this);
    }
  }
}