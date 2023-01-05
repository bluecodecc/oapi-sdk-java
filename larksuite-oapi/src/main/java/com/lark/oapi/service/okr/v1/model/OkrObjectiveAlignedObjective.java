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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class OkrObjectiveAlignedObjective {
    /**
     * Objective的ID
     * <p> 示例值：1231231231213
     */
    @SerializedName("id")
    private String id;
    /**
     * OKR的ID
     * <p> 示例值：12323231231213
     */
    @SerializedName("okr_id")
    private String okrId;
    /**
     * 该Objective的Owner
     * <p> 示例值：
     */
    @SerializedName("owner")
    private OkrObjectiveAlignedObjectiveOwner owner;

    // builder 开始
    public OkrObjectiveAlignedObjective() {
    }

    public OkrObjectiveAlignedObjective(Builder builder) {
        /**
         * Objective的ID
         * <p> 示例值：1231231231213
         */
        this.id = builder.id;
        /**
         * OKR的ID
         * <p> 示例值：12323231231213
         */
        this.okrId = builder.okrId;
        /**
         * 该Objective的Owner
         * <p> 示例值：
         */
        this.owner = builder.owner;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOkrId() {
        return this.okrId;
    }

    public void setOkrId(String okrId) {
        this.okrId = okrId;
    }

    public OkrObjectiveAlignedObjectiveOwner getOwner() {
        return this.owner;
    }

    public void setOwner(OkrObjectiveAlignedObjectiveOwner owner) {
        this.owner = owner;
    }

    public static class Builder {
        /**
         * Objective的ID
         * <p> 示例值：1231231231213
         */
        private String id;
        /**
         * OKR的ID
         * <p> 示例值：12323231231213
         */
        private String okrId;
        /**
         * 该Objective的Owner
         * <p> 示例值：
         */
        private OkrObjectiveAlignedObjectiveOwner owner;

        /**
         * Objective的ID
         * <p> 示例值：1231231231213
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * OKR的ID
         * <p> 示例值：12323231231213
         *
         * @param okrId
         * @return
         */
        public Builder okrId(String okrId) {
            this.okrId = okrId;
            return this;
        }


        /**
         * 该Objective的Owner
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(OkrObjectiveAlignedObjectiveOwner owner) {
            this.owner = owner;
            return this;
        }


        public OkrObjectiveAlignedObjective build() {
            return new OkrObjectiveAlignedObjective(this);
        }
    }
}
