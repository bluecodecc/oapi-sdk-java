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

public class Question {
    /**
     * 题目 ID
     * <p> 示例值：6950930570311829804
     */
    @SerializedName("question_id")
    private String questionId;
    /**
     * 题目中文名称
     * <p> 示例值：你的总体评价如何？
     */
    @SerializedName("question_name")
    private String questionName;
    /**
     * 题目英文名称
     * <p> 示例值：How would you describe your overall experience?
     */
    @SerializedName("question_en_name")
    private String questionEnName;
    /**
     * 题目中文描述
     * <p> 示例值：测试描述内容
     */
    @SerializedName("question_desc")
    private String questionDesc;
    /**
     * 题目英文描述
     * <p> 示例值：Test Text
     */
    @SerializedName("question_en_desc")
    private String questionEnDesc;
    /**
     * 题目类型
     * <p> 示例值：4
     */
    @SerializedName("question_type")
    private Integer questionType;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("is_required")
    private Boolean isRequired;
    /**
     * 选项题回答列表（单选题及多选题）
     * <p> 示例值：
     */
    @SerializedName("select_option_result_list")
    private SelectOptionResult[] selectOptionResultList;
    /**
     * 评分题回答
     * <p> 示例值：
     */
    @SerializedName("five_start_scoring_result")
    private FiveStartScoringResult fiveStartScoringResult;
    /**
     * 描述题回答
     * <p> 示例值：测试描述内容
     */
    @SerializedName("description_result")
    private String descriptionResult;

    // builder 开始
    public Question() {
    }

    public Question(Builder builder) {
        /**
         * 题目 ID
         * <p> 示例值：6950930570311829804
         */
        this.questionId = builder.questionId;
        /**
         * 题目中文名称
         * <p> 示例值：你的总体评价如何？
         */
        this.questionName = builder.questionName;
        /**
         * 题目英文名称
         * <p> 示例值：How would you describe your overall experience?
         */
        this.questionEnName = builder.questionEnName;
        /**
         * 题目中文描述
         * <p> 示例值：测试描述内容
         */
        this.questionDesc = builder.questionDesc;
        /**
         * 题目英文描述
         * <p> 示例值：Test Text
         */
        this.questionEnDesc = builder.questionEnDesc;
        /**
         * 题目类型
         * <p> 示例值：4
         */
        this.questionType = builder.questionType;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.isRequired = builder.isRequired;
        /**
         * 选项题回答列表（单选题及多选题）
         * <p> 示例值：
         */
        this.selectOptionResultList = builder.selectOptionResultList;
        /**
         * 评分题回答
         * <p> 示例值：
         */
        this.fiveStartScoringResult = builder.fiveStartScoringResult;
        /**
         * 描述题回答
         * <p> 示例值：测试描述内容
         */
        this.descriptionResult = builder.descriptionResult;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return this.questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionEnName() {
        return this.questionEnName;
    }

    public void setQuestionEnName(String questionEnName) {
        this.questionEnName = questionEnName;
    }

    public String getQuestionDesc() {
        return this.questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public String getQuestionEnDesc() {
        return this.questionEnDesc;
    }

    public void setQuestionEnDesc(String questionEnDesc) {
        this.questionEnDesc = questionEnDesc;
    }

    public Integer getQuestionType() {
        return this.questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public SelectOptionResult[] getSelectOptionResultList() {
        return this.selectOptionResultList;
    }

    public void setSelectOptionResultList(SelectOptionResult[] selectOptionResultList) {
        this.selectOptionResultList = selectOptionResultList;
    }

    public FiveStartScoringResult getFiveStartScoringResult() {
        return this.fiveStartScoringResult;
    }

    public void setFiveStartScoringResult(FiveStartScoringResult fiveStartScoringResult) {
        this.fiveStartScoringResult = fiveStartScoringResult;
    }

    public String getDescriptionResult() {
        return this.descriptionResult;
    }

    public void setDescriptionResult(String descriptionResult) {
        this.descriptionResult = descriptionResult;
    }

    public static class Builder {
        /**
         * 题目 ID
         * <p> 示例值：6950930570311829804
         */
        private String questionId;
        /**
         * 题目中文名称
         * <p> 示例值：你的总体评价如何？
         */
        private String questionName;
        /**
         * 题目英文名称
         * <p> 示例值：How would you describe your overall experience?
         */
        private String questionEnName;
        /**
         * 题目中文描述
         * <p> 示例值：测试描述内容
         */
        private String questionDesc;
        /**
         * 题目英文描述
         * <p> 示例值：Test Text
         */
        private String questionEnDesc;
        /**
         * 题目类型
         * <p> 示例值：4
         */
        private Integer questionType;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean isRequired;
        /**
         * 选项题回答列表（单选题及多选题）
         * <p> 示例值：
         */
        private SelectOptionResult[] selectOptionResultList;
        /**
         * 评分题回答
         * <p> 示例值：
         */
        private FiveStartScoringResult fiveStartScoringResult;
        /**
         * 描述题回答
         * <p> 示例值：测试描述内容
         */
        private String descriptionResult;

        /**
         * 题目 ID
         * <p> 示例值：6950930570311829804
         *
         * @param questionId
         * @return
         */
        public Builder questionId(String questionId) {
            this.questionId = questionId;
            return this;
        }


        /**
         * 题目中文名称
         * <p> 示例值：你的总体评价如何？
         *
         * @param questionName
         * @return
         */
        public Builder questionName(String questionName) {
            this.questionName = questionName;
            return this;
        }


        /**
         * 题目英文名称
         * <p> 示例值：How would you describe your overall experience?
         *
         * @param questionEnName
         * @return
         */
        public Builder questionEnName(String questionEnName) {
            this.questionEnName = questionEnName;
            return this;
        }


        /**
         * 题目中文描述
         * <p> 示例值：测试描述内容
         *
         * @param questionDesc
         * @return
         */
        public Builder questionDesc(String questionDesc) {
            this.questionDesc = questionDesc;
            return this;
        }


        /**
         * 题目英文描述
         * <p> 示例值：Test Text
         *
         * @param questionEnDesc
         * @return
         */
        public Builder questionEnDesc(String questionEnDesc) {
            this.questionEnDesc = questionEnDesc;
            return this;
        }


        /**
         * 题目类型
         * <p> 示例值：4
         *
         * @param questionType
         * @return
         */
        public Builder questionType(Integer questionType) {
            this.questionType = questionType;
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：true
         *
         * @param isRequired
         * @return
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }


        /**
         * 选项题回答列表（单选题及多选题）
         * <p> 示例值：
         *
         * @param selectOptionResultList
         * @return
         */
        public Builder selectOptionResultList(SelectOptionResult[] selectOptionResultList) {
            this.selectOptionResultList = selectOptionResultList;
            return this;
        }


        /**
         * 评分题回答
         * <p> 示例值：
         *
         * @param fiveStartScoringResult
         * @return
         */
        public Builder fiveStartScoringResult(FiveStartScoringResult fiveStartScoringResult) {
            this.fiveStartScoringResult = fiveStartScoringResult;
            return this;
        }


        /**
         * 描述题回答
         * <p> 示例值：测试描述内容
         *
         * @param descriptionResult
         * @return
         */
        public Builder descriptionResult(String descriptionResult) {
            this.descriptionResult = descriptionResult;
            return this;
        }


        public Question build() {
            return new Question(this);
        }
    }
}
