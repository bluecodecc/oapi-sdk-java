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

public class AgentScheduleUpdateInfo {
    /**
     * 客服id;;[可以以普通用户身份在服务台发起工单，从工单详情里面获取用户guest.id](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)
     * <p> 示例值：agent-id
     */
    @SerializedName("agent_id")
    private String agentId;
    /**
     * 工作日程列表
     * <p> 示例值：
     */
    @SerializedName("schedule")
    private WeekdaySchedule[] schedule;
    /**
     * 客服技能 ids
     * <p> 示例值：[“test-skill-id”]
     */
    @SerializedName("agent_skill_ids")
    private String[] agentSkillIds;

    // builder 开始
    public AgentScheduleUpdateInfo() {
    }

    public AgentScheduleUpdateInfo(Builder builder) {
        /**
         * 客服id;;[可以以普通用户身份在服务台发起工单，从工单详情里面获取用户guest.id](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)
         * <p> 示例值：agent-id
         */
        this.agentId = builder.agentId;
        /**
         * 工作日程列表
         * <p> 示例值：
         */
        this.schedule = builder.schedule;
        /**
         * 客服技能 ids
         * <p> 示例值：[“test-skill-id”]
         */
        this.agentSkillIds = builder.agentSkillIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public WeekdaySchedule[] getSchedule() {
        return this.schedule;
    }

    public void setSchedule(WeekdaySchedule[] schedule) {
        this.schedule = schedule;
    }

    public String[] getAgentSkillIds() {
        return this.agentSkillIds;
    }

    public void setAgentSkillIds(String[] agentSkillIds) {
        this.agentSkillIds = agentSkillIds;
    }

    public static class Builder {
        /**
         * 客服id;;[可以以普通用户身份在服务台发起工单，从工单详情里面获取用户guest.id](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)
         * <p> 示例值：agent-id
         */
        private String agentId;
        /**
         * 工作日程列表
         * <p> 示例值：
         */
        private WeekdaySchedule[] schedule;
        /**
         * 客服技能 ids
         * <p> 示例值：[“test-skill-id”]
         */
        private String[] agentSkillIds;

        /**
         * 客服id;;[可以以普通用户身份在服务台发起工单，从工单详情里面获取用户guest.id](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)
         * <p> 示例值：agent-id
         *
         * @param agentId
         * @return
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }


        /**
         * 工作日程列表
         * <p> 示例值：
         *
         * @param schedule
         * @return
         */
        public Builder schedule(WeekdaySchedule[] schedule) {
            this.schedule = schedule;
            return this;
        }


        /**
         * 客服技能 ids
         * <p> 示例值：[“test-skill-id”]
         *
         * @param agentSkillIds
         * @return
         */
        public Builder agentSkillIds(String[] agentSkillIds) {
            this.agentSkillIds = agentSkillIds;
            return this;
        }


        public AgentScheduleUpdateInfo build() {
            return new AgentScheduleUpdateInfo(this);
        }
    }
}
