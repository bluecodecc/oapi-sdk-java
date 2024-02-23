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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class DeleteCostCenterVersionReq {
    /**
     * 成本中心ID
     * <p> 示例值：6862995757234914824
     */
    @Path
    @SerializedName("cost_center_id")
    private String costCenterId;
    /**
     * 版本ID
     * <p> 示例值：6862995757234914824
     */
    @Path
    @SerializedName("version_id")
    private String versionId;
    @Body
    private DeleteCostCenterVersionReqBody body;

    // builder 开始
    public DeleteCostCenterVersionReq() {
    }

    public DeleteCostCenterVersionReq(Builder builder) {
        /**
         * 成本中心ID
         * <p> 示例值：6862995757234914824
         */
        this.costCenterId = builder.costCenterId;
        /**
         * 版本ID
         * <p> 示例值：6862995757234914824
         */
        this.versionId = builder.versionId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCostCenterId() {
        return this.costCenterId;
    }

    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public DeleteCostCenterVersionReqBody getDeleteCostCenterVersionReqBody() {
        return this.body;
    }

    public void setDeleteCostCenterVersionReqBody(DeleteCostCenterVersionReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String costCenterId; // 成本中心ID
        private String versionId; // 版本ID
        private DeleteCostCenterVersionReqBody body;

        /**
         * 成本中心ID
         * <p> 示例值：6862995757234914824
         *
         * @param costCenterId
         * @return
         */
        public Builder costCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * 版本ID
         * <p> 示例值：6862995757234914824
         *
         * @param versionId
         * @return
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public DeleteCostCenterVersionReqBody getDeleteCostCenterVersionReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder deleteCostCenterVersionReqBody(DeleteCostCenterVersionReqBody body) {
            this.body = body;
            return this;
        }

        public DeleteCostCenterVersionReq build() {
            return new DeleteCostCenterVersionReq(this);
        }
    }
}