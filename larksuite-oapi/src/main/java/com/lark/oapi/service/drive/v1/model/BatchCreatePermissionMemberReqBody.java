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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class BatchCreatePermissionMemberReqBody {
    /**
     * 协作者列表
     * <p> 示例值：
     */
    @SerializedName("members")
    private BaseMember[] members;

    // builder 开始
    public BatchCreatePermissionMemberReqBody() {
    }

    public BatchCreatePermissionMemberReqBody(Builder builder) {
        /**
         * 协作者列表
         * <p> 示例值：
         */
        this.members = builder.members;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BaseMember[] getMembers() {
        return this.members;
    }

    public void setMembers(BaseMember[] members) {
        this.members = members;
    }

    public static class Builder {
        /**
         * 协作者列表
         * <p> 示例值：
         */
        private BaseMember[] members;

        /**
         * 协作者列表
         * <p> 示例值：
         *
         * @param members
         * @return
         */
        public Builder members(BaseMember[] members) {
            this.members = members;
            return this;
        }


        public BatchCreatePermissionMemberReqBody build() {
            return new BatchCreatePermissionMemberReqBody(this);
        }
    }
}
