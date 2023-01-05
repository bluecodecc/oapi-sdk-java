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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetAppTableRecordReq {
    /**
     * 控制多行文本字段数据的返回格式, true 表示以数组形式返回
     * <p> 示例值：true
     */
    @Query
    @SerializedName("text_field_as_array")
    private Boolean textFieldAsArray;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 控制公式、查找引用是否显示完整的原样返回结果
     * <p> 示例值：true
     */
    @Query
    @SerializedName("display_formula_ref")
    private Boolean displayFormulaRef;
    /**
     * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
     * <p> 示例值：true
     */
    @Query
    @SerializedName("automatic_fields")
    private Boolean automaticFields;
    /**
     * bitable app token
     * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * table id
     * <p> 示例值：tblxI2tWaxP5dG7p
     */
    @Path
    @SerializedName("table_id")
    private String tableId;
    /**
     * 单条记录的 id
     * <p> 示例值：recn0hoyXL
     */
    @Path
    @SerializedName("record_id")
    private String recordId;

    // builder 开始
    public GetAppTableRecordReq() {
    }

    public GetAppTableRecordReq(Builder builder) {
        /**
         * 控制多行文本字段数据的返回格式, true 表示以数组形式返回
         * <p> 示例值：true
         */
        this.textFieldAsArray = builder.textFieldAsArray;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 控制公式、查找引用是否显示完整的原样返回结果
         * <p> 示例值：true
         */
        this.displayFormulaRef = builder.displayFormulaRef;
        /**
         * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
         * <p> 示例值：true
         */
        this.automaticFields = builder.automaticFields;
        /**
         * bitable app token
         * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
         */
        this.appToken = builder.appToken;
        /**
         * table id
         * <p> 示例值：tblxI2tWaxP5dG7p
         */
        this.tableId = builder.tableId;
        /**
         * 单条记录的 id
         * <p> 示例值：recn0hoyXL
         */
        this.recordId = builder.recordId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getTextFieldAsArray() {
        return this.textFieldAsArray;
    }

    public void setTextFieldAsArray(Boolean textFieldAsArray) {
        this.textFieldAsArray = textFieldAsArray;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Boolean getDisplayFormulaRef() {
        return this.displayFormulaRef;
    }

    public void setDisplayFormulaRef(Boolean displayFormulaRef) {
        this.displayFormulaRef = displayFormulaRef;
    }

    public Boolean getAutomaticFields() {
        return this.automaticFields;
    }

    public void setAutomaticFields(Boolean automaticFields) {
        this.automaticFields = automaticFields;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public static class Builder {
        private Boolean textFieldAsArray; // 控制多行文本字段数据的返回格式, true 表示以数组形式返回
        private String userIdType; // 此次调用中使用的用户ID的类型
        private Boolean displayFormulaRef; // 控制公式、查找引用是否显示完整的原样返回结果
        private Boolean automaticFields; // 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
        private String appToken; // bitable app token
        private String tableId; // table id
        private String recordId; // 单条记录的 id

        /**
         * 控制多行文本字段数据的返回格式, true 表示以数组形式返回
         * <p> 示例值：true
         *
         * @param textFieldAsArray
         * @return
         */
        public Builder textFieldAsArray(Boolean textFieldAsArray) {
            this.textFieldAsArray = textFieldAsArray;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.bitable.v1.enums.GetAppTableRecordUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.GetAppTableRecordUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 控制公式、查找引用是否显示完整的原样返回结果
         * <p> 示例值：true
         *
         * @param displayFormulaRef
         * @return
         */
        public Builder displayFormulaRef(Boolean displayFormulaRef) {
            this.displayFormulaRef = displayFormulaRef;
            return this;
        }

        /**
         * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
         * <p> 示例值：true
         *
         * @param automaticFields
         * @return
         */
        public Builder automaticFields(Boolean automaticFields) {
            this.automaticFields = automaticFields;
            return this;
        }

        /**
         * bitable app token
         * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }


        /**
         * table id
         * <p> 示例值：tblxI2tWaxP5dG7p
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }


        /**
         * 单条记录的 id
         * <p> 示例值：recn0hoyXL
         *
         * @param recordId
         * @return
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        public GetAppTableRecordReq build() {
            return new GetAppTableRecordReq(this);
        }
    }
}
