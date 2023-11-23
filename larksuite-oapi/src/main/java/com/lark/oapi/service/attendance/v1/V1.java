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

package com.lark.oapi.service.attendance.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.attendance.v1.resource.*;

public class V1 {
    private final ApprovalInfo approvalInfo; // approval_info
    private final File file; // 文件
    private final Group group; // 考勤组管理
    private final LeaveAccrualRecord leaveAccrualRecord; // leave_accrual_record
    private final LeaveEmployExpireRecord leaveEmployExpireRecord; // leave_employ_expire_record
    private final Shift shift; // 考勤班次
    private final UserApproval userApproval; // 假勤审批
    private final UserDailyShift userDailyShift; // 考勤排班
    private final UserFlow userFlow; // user_flow
    private final UserSetting userSetting; // 用户设置
    private final UserStatsData userStatsData; // 考勤统计
    private final UserStatsField userStatsField; // user_stats_field
    private final UserStatsView userStatsView; // user_stats_view
    private final UserTask userTask; // 考勤记录
    private final UserTaskRemedy userTaskRemedy; // 考勤补卡

    public V1(Config config) {
        this.approvalInfo = new ApprovalInfo(config);
        this.file = new File(config);
        this.group = new Group(config);
        this.leaveAccrualRecord = new LeaveAccrualRecord(config);
        this.leaveEmployExpireRecord = new LeaveEmployExpireRecord(config);
        this.shift = new Shift(config);
        this.userApproval = new UserApproval(config);
        this.userDailyShift = new UserDailyShift(config);
        this.userFlow = new UserFlow(config);
        this.userSetting = new UserSetting(config);
        this.userStatsData = new UserStatsData(config);
        this.userStatsField = new UserStatsField(config);
        this.userStatsView = new UserStatsView(config);
        this.userTask = new UserTask(config);
        this.userTaskRemedy = new UserTaskRemedy(config);
    }

    public ApprovalInfo approvalInfo() {
        return approvalInfo;
    }

    public File file() {
        return file;
    }

    public Group group() {
        return group;
    }

    public LeaveAccrualRecord leaveAccrualRecord() {
        return leaveAccrualRecord;
    }

    public LeaveEmployExpireRecord leaveEmployExpireRecord() {
        return leaveEmployExpireRecord;
    }

    public Shift shift() {
        return shift;
    }

    public UserApproval userApproval() {
        return userApproval;
    }

    public UserDailyShift userDailyShift() {
        return userDailyShift;
    }

    public UserFlow userFlow() {
        return userFlow;
    }

    public UserSetting userSetting() {
        return userSetting;
    }

    public UserStatsData userStatsData() {
        return userStatsData;
    }

    public UserStatsField userStatsField() {
        return userStatsField;
    }

    public UserStatsView userStatsView() {
        return userStatsView;
    }

    public UserTask userTask() {
        return userTask;
    }

    public UserTaskRemedy userTaskRemedy() {
        return userTaskRemedy;
    }
}