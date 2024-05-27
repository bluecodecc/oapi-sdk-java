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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class CallbackActionValue {
    /**
     * strategy_info
     * <p> 示例值：""
     */
    @SerializedName("strategy_info")
    private String strategyInfo;
    /**
     * agent_id
     * <p> 示例值：""
     */
    @SerializedName("agent_id")
    private String agentId;
    /**
     * agent_type
     * <p> 示例值：1
     */
    @SerializedName("agent_type")
    private Integer agentType;
    /**
     * response_type
     * <p> 示例值：1
     */
    @SerializedName("response_type")
    private Integer responseType;

    // builder 开始
    public CallbackActionValue() {
    }

    public CallbackActionValue(Builder builder) {
        /**
         * strategy_info
         * <p> 示例值：""
         */
        this.strategyInfo = builder.strategyInfo;
        /**
         * agent_id
         * <p> 示例值：""
         */
        this.agentId = builder.agentId;
        /**
         * agent_type
         * <p> 示例值：1
         */
        this.agentType = builder.agentType;
        /**
         * response_type
         * <p> 示例值：1
         */
        this.responseType = builder.responseType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStrategyInfo() {
        return this.strategyInfo;
    }

    public void setStrategyInfo(String strategyInfo) {
        this.strategyInfo = strategyInfo;
    }

    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Integer getAgentType() {
        return this.agentType;
    }

    public void setAgentType(Integer agentType) {
        this.agentType = agentType;
    }

    public Integer getResponseType() {
        return this.responseType;
    }

    public void setResponseType(Integer responseType) {
        this.responseType = responseType;
    }

    public static class Builder {
        /**
         * strategy_info
         * <p> 示例值：""
         */
        private String strategyInfo;
        /**
         * agent_id
         * <p> 示例值：""
         */
        private String agentId;
        /**
         * agent_type
         * <p> 示例值：1
         */
        private Integer agentType;
        /**
         * response_type
         * <p> 示例值：1
         */
        private Integer responseType;

        /**
         * strategy_info
         * <p> 示例值：""
         *
         * @param strategyInfo
         * @return
         */
        public Builder strategyInfo(String strategyInfo) {
            this.strategyInfo = strategyInfo;
            return this;
        }


        /**
         * agent_id
         * <p> 示例值：""
         *
         * @param agentId
         * @return
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }


        /**
         * agent_type
         * <p> 示例值：1
         *
         * @param agentType
         * @return
         */
        public Builder agentType(Integer agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * agent_type
         * <p> 示例值：1
         *
         * @param agentType {@link com.lark.oapi.service.search.v2.enums.CallbackActionValueAgentTypeEnum}
         * @return
         */
        public Builder agentType(com.lark.oapi.service.search.v2.enums.CallbackActionValueAgentTypeEnum agentType) {
            this.agentType = agentType.getValue();
            return this;
        }


        /**
         * response_type
         * <p> 示例值：1
         *
         * @param responseType
         * @return
         */
        public Builder responseType(Integer responseType) {
            this.responseType = responseType;
            return this;
        }

        /**
         * response_type
         * <p> 示例值：1
         *
         * @param responseType {@link com.lark.oapi.service.search.v2.enums.CallbackActionValueResponseTypeEnum}
         * @return
         */
        public Builder responseType(com.lark.oapi.service.search.v2.enums.CallbackActionValueResponseTypeEnum responseType) {
            this.responseType = responseType.getValue();
            return this;
        }


        public CallbackActionValue build() {
            return new CallbackActionValue(this);
        }
    }
}
