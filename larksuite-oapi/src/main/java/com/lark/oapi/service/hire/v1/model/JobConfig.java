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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class JobConfig {
    /**
     * Offer 申请表，枚举通过接口「获取 Offer 申请表列表」获取
     * <p> 示例值：6960663240925956573
     */
    @SerializedName("offer_apply_schema_id")
    private String offerApplySchemaId;
    /**
     * Offer 审批流，枚举通过接口「获取 Offer 审批流列表」获取
     * <p> 示例值：6960663240925956572
     */
    @SerializedName("offer_process_conf")
    private String offerProcessConf;
    /**
     * 建议评估人 ID 列表
     * <p> 示例值：6966533137982392320
     */
    @SerializedName("recommended_evaluator_id_list")
    private String[] recommendedEvaluatorIdList;
    /**
     * 更新选项，传入要更新的配置项，1=更新面试评价表，2=更新 Offer 申请表，3=更新 Offer 审批流程，4=更新招聘需求，5=更新建议面试官，6=更新推荐评估人
     * <p> 示例值：1
     */
    @SerializedName("update_option_list")
    private Integer[] updateOptionList;
    /**
     * 面试评价表，枚举通过接口「获取面试评价表列表」获取
     * <p> 示例值：6960663240925956571
     */
    @SerializedName("assessment_template_biz_id")
    private String assessmentTemplateBizId;
    /**
     * 建议面试官列表
     * <p> 示例值：
     */
    @SerializedName("interview_round_conf_list")
    private JobConfigInterviewRoundConf[] interviewRoundConfList;
    /**
     * 关联招聘需求，支持关联多个，枚举通过接口「获取招聘需求」获取
     * <p> 示例值：6966533137982392320
     */
    @SerializedName("jr_id_list")
    private String[] jrIdList;
    /**
     * 面试轮次类型 ID 列表
     * <p> 示例值：
     */
    @SerializedName("interview_round_type_conf_list")
    private JobConfigRoundType[] interviewRoundTypeConfList;
    /**
     * 关联职位列表，如职位为实体职位则关联虚拟职位id，如职位为虚拟职位则关联实体职位id
     * <p> 示例值：6966533137982392320
     */
    @SerializedName("related_job_id_list")
    private String[] relatedJobIdList;
    /**
     * 自助约面配置
     * <p> 示例值：
     */
    @SerializedName("interview_appointment_config")
    private InterviewAppointmentConfig interviewAppointmentConfig;

    // builder 开始
    public JobConfig() {
    }

    public JobConfig(Builder builder) {
        /**
         * Offer 申请表，枚举通过接口「获取 Offer 申请表列表」获取
         * <p> 示例值：6960663240925956573
         */
        this.offerApplySchemaId = builder.offerApplySchemaId;
        /**
         * Offer 审批流，枚举通过接口「获取 Offer 审批流列表」获取
         * <p> 示例值：6960663240925956572
         */
        this.offerProcessConf = builder.offerProcessConf;
        /**
         * 建议评估人 ID 列表
         * <p> 示例值：6966533137982392320
         */
        this.recommendedEvaluatorIdList = builder.recommendedEvaluatorIdList;
        /**
         * 更新选项，传入要更新的配置项，1=更新面试评价表，2=更新 Offer 申请表，3=更新 Offer 审批流程，4=更新招聘需求，5=更新建议面试官，6=更新推荐评估人
         * <p> 示例值：1
         */
        this.updateOptionList = builder.updateOptionList;
        /**
         * 面试评价表，枚举通过接口「获取面试评价表列表」获取
         * <p> 示例值：6960663240925956571
         */
        this.assessmentTemplateBizId = builder.assessmentTemplateBizId;
        /**
         * 建议面试官列表
         * <p> 示例值：
         */
        this.interviewRoundConfList = builder.interviewRoundConfList;
        /**
         * 关联招聘需求，支持关联多个，枚举通过接口「获取招聘需求」获取
         * <p> 示例值：6966533137982392320
         */
        this.jrIdList = builder.jrIdList;
        /**
         * 面试轮次类型 ID 列表
         * <p> 示例值：
         */
        this.interviewRoundTypeConfList = builder.interviewRoundTypeConfList;
        /**
         * 关联职位列表，如职位为实体职位则关联虚拟职位id，如职位为虚拟职位则关联实体职位id
         * <p> 示例值：6966533137982392320
         */
        this.relatedJobIdList = builder.relatedJobIdList;
        /**
         * 自助约面配置
         * <p> 示例值：
         */
        this.interviewAppointmentConfig = builder.interviewAppointmentConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOfferApplySchemaId() {
        return this.offerApplySchemaId;
    }

    public void setOfferApplySchemaId(String offerApplySchemaId) {
        this.offerApplySchemaId = offerApplySchemaId;
    }

    public String getOfferProcessConf() {
        return this.offerProcessConf;
    }

    public void setOfferProcessConf(String offerProcessConf) {
        this.offerProcessConf = offerProcessConf;
    }

    public String[] getRecommendedEvaluatorIdList() {
        return this.recommendedEvaluatorIdList;
    }

    public void setRecommendedEvaluatorIdList(String[] recommendedEvaluatorIdList) {
        this.recommendedEvaluatorIdList = recommendedEvaluatorIdList;
    }

    public Integer[] getUpdateOptionList() {
        return this.updateOptionList;
    }

    public void setUpdateOptionList(Integer[] updateOptionList) {
        this.updateOptionList = updateOptionList;
    }

    public String getAssessmentTemplateBizId() {
        return this.assessmentTemplateBizId;
    }

    public void setAssessmentTemplateBizId(String assessmentTemplateBizId) {
        this.assessmentTemplateBizId = assessmentTemplateBizId;
    }

    public JobConfigInterviewRoundConf[] getInterviewRoundConfList() {
        return this.interviewRoundConfList;
    }

    public void setInterviewRoundConfList(JobConfigInterviewRoundConf[] interviewRoundConfList) {
        this.interviewRoundConfList = interviewRoundConfList;
    }

    public String[] getJrIdList() {
        return this.jrIdList;
    }

    public void setJrIdList(String[] jrIdList) {
        this.jrIdList = jrIdList;
    }

    public JobConfigRoundType[] getInterviewRoundTypeConfList() {
        return this.interviewRoundTypeConfList;
    }

    public void setInterviewRoundTypeConfList(JobConfigRoundType[] interviewRoundTypeConfList) {
        this.interviewRoundTypeConfList = interviewRoundTypeConfList;
    }

    public String[] getRelatedJobIdList() {
        return this.relatedJobIdList;
    }

    public void setRelatedJobIdList(String[] relatedJobIdList) {
        this.relatedJobIdList = relatedJobIdList;
    }

    public InterviewAppointmentConfig getInterviewAppointmentConfig() {
        return this.interviewAppointmentConfig;
    }

    public void setInterviewAppointmentConfig(InterviewAppointmentConfig interviewAppointmentConfig) {
        this.interviewAppointmentConfig = interviewAppointmentConfig;
    }

    public static class Builder {
        /**
         * Offer 申请表，枚举通过接口「获取 Offer 申请表列表」获取
         * <p> 示例值：6960663240925956573
         */
        private String offerApplySchemaId;
        /**
         * Offer 审批流，枚举通过接口「获取 Offer 审批流列表」获取
         * <p> 示例值：6960663240925956572
         */
        private String offerProcessConf;
        /**
         * 建议评估人 ID 列表
         * <p> 示例值：6966533137982392320
         */
        private String[] recommendedEvaluatorIdList;
        /**
         * 更新选项，传入要更新的配置项，1=更新面试评价表，2=更新 Offer 申请表，3=更新 Offer 审批流程，4=更新招聘需求，5=更新建议面试官，6=更新推荐评估人
         * <p> 示例值：1
         */
        private Integer[] updateOptionList;
        /**
         * 面试评价表，枚举通过接口「获取面试评价表列表」获取
         * <p> 示例值：6960663240925956571
         */
        private String assessmentTemplateBizId;
        /**
         * 建议面试官列表
         * <p> 示例值：
         */
        private JobConfigInterviewRoundConf[] interviewRoundConfList;
        /**
         * 关联招聘需求，支持关联多个，枚举通过接口「获取招聘需求」获取
         * <p> 示例值：6966533137982392320
         */
        private String[] jrIdList;
        /**
         * 面试轮次类型 ID 列表
         * <p> 示例值：
         */
        private JobConfigRoundType[] interviewRoundTypeConfList;
        /**
         * 关联职位列表，如职位为实体职位则关联虚拟职位id，如职位为虚拟职位则关联实体职位id
         * <p> 示例值：6966533137982392320
         */
        private String[] relatedJobIdList;
        /**
         * 自助约面配置
         * <p> 示例值：
         */
        private InterviewAppointmentConfig interviewAppointmentConfig;

        /**
         * Offer 申请表，枚举通过接口「获取 Offer 申请表列表」获取
         * <p> 示例值：6960663240925956573
         *
         * @param offerApplySchemaId
         * @return
         */
        public Builder offerApplySchemaId(String offerApplySchemaId) {
            this.offerApplySchemaId = offerApplySchemaId;
            return this;
        }


        /**
         * Offer 审批流，枚举通过接口「获取 Offer 审批流列表」获取
         * <p> 示例值：6960663240925956572
         *
         * @param offerProcessConf
         * @return
         */
        public Builder offerProcessConf(String offerProcessConf) {
            this.offerProcessConf = offerProcessConf;
            return this;
        }


        /**
         * 建议评估人 ID 列表
         * <p> 示例值：6966533137982392320
         *
         * @param recommendedEvaluatorIdList
         * @return
         */
        public Builder recommendedEvaluatorIdList(String[] recommendedEvaluatorIdList) {
            this.recommendedEvaluatorIdList = recommendedEvaluatorIdList;
            return this;
        }


        /**
         * 更新选项，传入要更新的配置项，1=更新面试评价表，2=更新 Offer 申请表，3=更新 Offer 审批流程，4=更新招聘需求，5=更新建议面试官，6=更新推荐评估人
         * <p> 示例值：1
         *
         * @param updateOptionList
         * @return
         */
        public Builder updateOptionList(Integer[] updateOptionList) {
            this.updateOptionList = updateOptionList;
            return this;
        }


        /**
         * 面试评价表，枚举通过接口「获取面试评价表列表」获取
         * <p> 示例值：6960663240925956571
         *
         * @param assessmentTemplateBizId
         * @return
         */
        public Builder assessmentTemplateBizId(String assessmentTemplateBizId) {
            this.assessmentTemplateBizId = assessmentTemplateBizId;
            return this;
        }


        /**
         * 建议面试官列表
         * <p> 示例值：
         *
         * @param interviewRoundConfList
         * @return
         */
        public Builder interviewRoundConfList(JobConfigInterviewRoundConf[] interviewRoundConfList) {
            this.interviewRoundConfList = interviewRoundConfList;
            return this;
        }


        /**
         * 关联招聘需求，支持关联多个，枚举通过接口「获取招聘需求」获取
         * <p> 示例值：6966533137982392320
         *
         * @param jrIdList
         * @return
         */
        public Builder jrIdList(String[] jrIdList) {
            this.jrIdList = jrIdList;
            return this;
        }


        /**
         * 面试轮次类型 ID 列表
         * <p> 示例值：
         *
         * @param interviewRoundTypeConfList
         * @return
         */
        public Builder interviewRoundTypeConfList(JobConfigRoundType[] interviewRoundTypeConfList) {
            this.interviewRoundTypeConfList = interviewRoundTypeConfList;
            return this;
        }


        /**
         * 关联职位列表，如职位为实体职位则关联虚拟职位id，如职位为虚拟职位则关联实体职位id
         * <p> 示例值：6966533137982392320
         *
         * @param relatedJobIdList
         * @return
         */
        public Builder relatedJobIdList(String[] relatedJobIdList) {
            this.relatedJobIdList = relatedJobIdList;
            return this;
        }


        /**
         * 自助约面配置
         * <p> 示例值：
         *
         * @param interviewAppointmentConfig
         * @return
         */
        public Builder interviewAppointmentConfig(InterviewAppointmentConfig interviewAppointmentConfig) {
            this.interviewAppointmentConfig = interviewAppointmentConfig;
            return this;
        }


        public JobConfig build() {
            return new JobConfig(this);
        }
    }
}
