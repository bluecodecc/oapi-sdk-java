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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetShift {

    /**
     * 班次Id
     * <p> 示例值：6919358778597097404
     */
    @SerializedName("shift_id")
    private String shiftId;
    /**
     * 班次名称
     * <p> 示例值：早班
     */
    @SerializedName("shift_name")
    private String shiftName;
    /**
     * 打卡次数
     * <p> 示例值：1
     */
    @SerializedName("punch_times")
    private Integer punchTimes;
    /**
     * 是否弹性打卡
     * <p> 示例值：false
     */
    @SerializedName("is_flexible")
    private Boolean isFlexible;
    /**
     * 弹性打卡时间，设置【上班最多可晚到】与【下班最多可早走】时间，如果不设置flexible_rule则生效
     * <p> 示例值：60
     */
    @SerializedName("flexible_minutes")
    private Integer flexibleMinutes;
    /**
     * 弹性打卡时间设置
     * <p> 示例值：
     */
    @SerializedName("flexible_rule")
    private FlexibleRule[] flexibleRule;
    /**
     * 不需要打下班卡
     * <p> 示例值：true
     */
    @SerializedName("no_need_off")
    private Boolean noNeedOff;
    /**
     * 打卡规则
     * <p> 示例值：
     */
    @SerializedName("punch_time_rule")
    private PunchTimeRule[] punchTimeRule;
    /**
     * 晚走晚到规则
     * <p> 示例值：
     */
    @SerializedName("late_off_late_on_rule")
    private LateOffLateOnRule[] lateOffLateOnRule;
    /**
     * 休息规则
     * <p> 示例值：
     */
    @SerializedName("rest_time_rule")
    private RestRule[] restTimeRule;

    public String getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getShiftName() {
        return this.shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public Integer getPunchTimes() {
        return this.punchTimes;
    }

    public void setPunchTimes(Integer punchTimes) {
        this.punchTimes = punchTimes;
    }

    public Boolean getIsFlexible() {
        return this.isFlexible;
    }

    public void setIsFlexible(Boolean isFlexible) {
        this.isFlexible = isFlexible;
    }

    public Integer getFlexibleMinutes() {
        return this.flexibleMinutes;
    }

    public void setFlexibleMinutes(Integer flexibleMinutes) {
        this.flexibleMinutes = flexibleMinutes;
    }

    public FlexibleRule[] getFlexibleRule() {
        return this.flexibleRule;
    }

    public void setFlexibleRule(FlexibleRule[] flexibleRule) {
        this.flexibleRule = flexibleRule;
    }

    public Boolean getNoNeedOff() {
        return this.noNeedOff;
    }

    public void setNoNeedOff(Boolean noNeedOff) {
        this.noNeedOff = noNeedOff;
    }

    public PunchTimeRule[] getPunchTimeRule() {
        return this.punchTimeRule;
    }

    public void setPunchTimeRule(PunchTimeRule[] punchTimeRule) {
        this.punchTimeRule = punchTimeRule;
    }

    public LateOffLateOnRule[] getLateOffLateOnRule() {
        return this.lateOffLateOnRule;
    }

    public void setLateOffLateOnRule(LateOffLateOnRule[] lateOffLateOnRule) {
        this.lateOffLateOnRule = lateOffLateOnRule;
    }

    public RestRule[] getRestTimeRule() {
        return this.restTimeRule;
    }

    public void setRestTimeRule(RestRule[] restTimeRule) {
        this.restTimeRule = restTimeRule;
    }

}
