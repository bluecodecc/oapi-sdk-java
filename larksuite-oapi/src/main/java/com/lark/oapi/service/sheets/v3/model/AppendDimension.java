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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class AppendDimension {

  /**
   * 操作行还是列，取值：ROWS、COLUMNS
   * <p> 示例值：ROWS
   */
  @SerializedName("major_dimension")
  private String majorDimension;
  /**
   * 数量
   * <p> 示例值：10
   */
  @SerializedName("length")
  private Integer length;
  /**
   * 是否继承上一行/列的样式
   * <p> 示例值：false
   */
  @SerializedName("inherit_from_before")
  private Boolean inheritFromBefore;

  // builder 开始
  public AppendDimension() {
  }

  public AppendDimension(Builder builder) {
    /**
     * 操作行还是列，取值：ROWS、COLUMNS
     * <p> 示例值：ROWS
     */
    this.majorDimension = builder.majorDimension;
    /**
     * 数量
     * <p> 示例值：10
     */
    this.length = builder.length;
    /**
     * 是否继承上一行/列的样式
     * <p> 示例值：false
     */
    this.inheritFromBefore = builder.inheritFromBefore;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMajorDimension() {
    return this.majorDimension;
  }

  public void setMajorDimension(String majorDimension) {
    this.majorDimension = majorDimension;
  }

  public Integer getLength() {
    return this.length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Boolean getInheritFromBefore() {
    return this.inheritFromBefore;
  }

  public void setInheritFromBefore(Boolean inheritFromBefore) {
    this.inheritFromBefore = inheritFromBefore;
  }

  public static class Builder {

    /**
     * 操作行还是列，取值：ROWS、COLUMNS
     * <p> 示例值：ROWS
     */
    private String majorDimension;
    /**
     * 数量
     * <p> 示例值：10
     */
    private Integer length;
    /**
     * 是否继承上一行/列的样式
     * <p> 示例值：false
     */
    private Boolean inheritFromBefore;

    /**
     * 操作行还是列，取值：ROWS、COLUMNS
     * <p> 示例值：ROWS
     *
     * @param majorDimension
     * @return
     */
    public Builder majorDimension(String majorDimension) {
      this.majorDimension = majorDimension;
      return this;
    }

    /**
     * 操作行还是列，取值：ROWS、COLUMNS
     * <p> 示例值：ROWS
     *
     * @param majorDimension {@link com.lark.oapi.service.sheets.v3.enums.AppendDimensionMajorDimensionEnum}
     * @return
     */
    public Builder majorDimension(
        com.lark.oapi.service.sheets.v3.enums.AppendDimensionMajorDimensionEnum majorDimension) {
      this.majorDimension = majorDimension.getValue();
      return this;
    }


    /**
     * 数量
     * <p> 示例值：10
     *
     * @param length
     * @return
     */
    public Builder length(Integer length) {
      this.length = length;
      return this;
    }


    /**
     * 是否继承上一行/列的样式
     * <p> 示例值：false
     *
     * @param inheritFromBefore
     * @return
     */
    public Builder inheritFromBefore(Boolean inheritFromBefore) {
      this.inheritFromBefore = inheritFromBefore;
      return this;
    }


    public AppendDimension build() {
      return new AppendDimension(this);
    }
  }
}