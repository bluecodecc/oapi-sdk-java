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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableFieldProperty {

  @SerializedName("options")
  private AppTableFieldPropertyOption[] options;
  @SerializedName("formatter")
  private String formatter;
  @SerializedName("date_formatter")
  private String dateFormatter;
  @SerializedName("auto_fill")
  private Boolean autoFill;
  @SerializedName("multiple")
  private Boolean multiple;
  @SerializedName("table_id")
  private String tableId;
  @SerializedName("table_name")
  private String tableName;
  @SerializedName("back_field_name")
  private String backFieldName;

  // builder 开始
  public AppTableFieldProperty() {
  }

  public AppTableFieldProperty(Builder builder) {
    this.options = builder.options;
    this.formatter = builder.formatter;
    this.dateFormatter = builder.dateFormatter;
    this.autoFill = builder.autoFill;
    this.multiple = builder.multiple;
    this.tableId = builder.tableId;
    this.tableName = builder.tableName;
    this.backFieldName = builder.backFieldName;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public AppTableFieldPropertyOption[] getOptions() {
    return this.options;
  }

  public void setOptions(AppTableFieldPropertyOption[] options) {
    this.options = options;
  }

  public String getFormatter() {
    return this.formatter;
  }

  public void setFormatter(String formatter) {
    this.formatter = formatter;
  }

  public String getDateFormatter() {
    return this.dateFormatter;
  }

  public void setDateFormatter(String dateFormatter) {
    this.dateFormatter = dateFormatter;
  }

  public Boolean getAutoFill() {
    return this.autoFill;
  }

  public void setAutoFill(Boolean autoFill) {
    this.autoFill = autoFill;
  }

  public Boolean getMultiple() {
    return this.multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public String getTableId() {
    return this.tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getBackFieldName() {
    return this.backFieldName;
  }

  public void setBackFieldName(String backFieldName) {
    this.backFieldName = backFieldName;
  }

  public static class Builder {

    private AppTableFieldPropertyOption[] options;
    private String formatter;
    private String dateFormatter;
    private Boolean autoFill;
    private Boolean multiple;
    private String tableId;
    private String tableName;
    private String backFieldName;

    public Builder options(AppTableFieldPropertyOption[] options) {
      this.options = options;
      return this;
    }

    public Builder formatter(String formatter) {
      this.formatter = formatter;
      return this;
    }

    public Builder dateFormatter(String dateFormatter) {
      this.dateFormatter = dateFormatter;
      return this;
    }

    public Builder autoFill(Boolean autoFill) {
      this.autoFill = autoFill;
      return this;
    }

    public Builder multiple(Boolean multiple) {
      this.multiple = multiple;
      return this;
    }

    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    public Builder backFieldName(String backFieldName) {
      this.backFieldName = backFieldName;
      return this;
    }


    public AppTableFieldProperty build() {
      return new AppTableFieldProperty(this);
    }
  }
}