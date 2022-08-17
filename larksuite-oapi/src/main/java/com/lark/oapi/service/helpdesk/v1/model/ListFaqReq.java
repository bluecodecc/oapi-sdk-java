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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListFaqReq {

  @Query
  @SerializedName("category_id")
  private String categoryId;
  @Query
  @SerializedName("status")
  private String status;
  @Query
  @SerializedName("search")
  private String search;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListFaqReq() {
  }

  public ListFaqReq(Builder builder) {
    this.categoryId = builder.categoryId;
    this.status = builder.status;
    this.search = builder.search;
    this.pageToken = builder.pageToken;
    this.pageSize = builder.pageSize;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSearch() {
    return this.search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public static class Builder {

    private String categoryId;
    private String status;
    private String search;
    private String pageToken;
    private Integer pageSize;

    public Builder categoryId(String categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder search(String search) {
      this.search = search;
      return this;
    }

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public ListFaqReq build() {
      return new ListFaqReq(this);
    }
  }
}