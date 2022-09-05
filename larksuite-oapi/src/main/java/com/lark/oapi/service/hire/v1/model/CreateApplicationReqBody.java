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

public class CreateApplicationReqBody {

  /**
   * 人才ID
   * <p> 示例值：12312312312
   */
  @SerializedName("talent_id")
  private String talentId;
  /**
   * 职位ID
   * <p> 示例值：12312312312
   */
  @SerializedName("job_id")
  private String jobId;
  /**
   * 简历来源 ID，可通过「获取简历来源」接口查询。若简历来源类型属于「员工转岗」或「实习生转正」，人才需处于已入职状态。
   * <p> 示例值：7115289562569591070
   */
  @SerializedName("resume_source_id")
  private String resumeSourceId;
  /**
   * 意向投递城市列表，可从「获取职位信息」返回的工作地点列表获取
   * <p> 示例值：["CT_1"]
   */
  @SerializedName("application_preferred_city_code_list")
  private String[] applicationPreferredCityCodeList;

  // builder 开始
  public CreateApplicationReqBody() {
  }

  public CreateApplicationReqBody(Builder builder) {
    /**
     * 人才ID
     * <p> 示例值：12312312312
     */
    this.talentId = builder.talentId;
    /**
     * 职位ID
     * <p> 示例值：12312312312
     */
    this.jobId = builder.jobId;
    /**
     * 简历来源 ID，可通过「获取简历来源」接口查询。若简历来源类型属于「员工转岗」或「实习生转正」，人才需处于已入职状态。
     * <p> 示例值：7115289562569591070
     */
    this.resumeSourceId = builder.resumeSourceId;
    /**
     * 意向投递城市列表，可从「获取职位信息」返回的工作地点列表获取
     * <p> 示例值：["CT_1"]
     */
    this.applicationPreferredCityCodeList = builder.applicationPreferredCityCodeList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTalentId() {
    return this.talentId;
  }

  public void setTalentId(String talentId) {
    this.talentId = talentId;
  }

  public String getJobId() {
    return this.jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public String getResumeSourceId() {
    return this.resumeSourceId;
  }

  public void setResumeSourceId(String resumeSourceId) {
    this.resumeSourceId = resumeSourceId;
  }

  public String[] getApplicationPreferredCityCodeList() {
    return this.applicationPreferredCityCodeList;
  }

  public void setApplicationPreferredCityCodeList(String[] applicationPreferredCityCodeList) {
    this.applicationPreferredCityCodeList = applicationPreferredCityCodeList;
  }

  public static class Builder {

    /**
     * 人才ID
     * <p> 示例值：12312312312
     */
    private String talentId;
    /**
     * 职位ID
     * <p> 示例值：12312312312
     */
    private String jobId;
    /**
     * 简历来源 ID，可通过「获取简历来源」接口查询。若简历来源类型属于「员工转岗」或「实习生转正」，人才需处于已入职状态。
     * <p> 示例值：7115289562569591070
     */
    private String resumeSourceId;
    /**
     * 意向投递城市列表，可从「获取职位信息」返回的工作地点列表获取
     * <p> 示例值：["CT_1"]
     */
    private String[] applicationPreferredCityCodeList;

    /**
     * 人才ID
     * <p> 示例值：12312312312
     *
     * @param talentId
     * @return
     */
    public Builder talentId(String talentId) {
      this.talentId = talentId;
      return this;
    }


    /**
     * 职位ID
     * <p> 示例值：12312312312
     *
     * @param jobId
     * @return
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }


    /**
     * 简历来源 ID，可通过「获取简历来源」接口查询。若简历来源类型属于「员工转岗」或「实习生转正」，人才需处于已入职状态。
     * <p> 示例值：7115289562569591070
     *
     * @param resumeSourceId
     * @return
     */
    public Builder resumeSourceId(String resumeSourceId) {
      this.resumeSourceId = resumeSourceId;
      return this;
    }


    /**
     * 意向投递城市列表，可从「获取职位信息」返回的工作地点列表获取
     * <p> 示例值：["CT_1"]
     *
     * @param applicationPreferredCityCodeList
     * @return
     */
    public Builder applicationPreferredCityCodeList(String[] applicationPreferredCityCodeList) {
      this.applicationPreferredCityCodeList = applicationPreferredCityCodeList;
      return this;
    }


    public CreateApplicationReqBody build() {
      return new CreateApplicationReqBody(this);
    }
  }
}