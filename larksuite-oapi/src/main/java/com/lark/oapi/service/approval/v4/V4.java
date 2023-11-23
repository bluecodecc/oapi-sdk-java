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

package com.lark.oapi.service.approval.v4;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.approval.v4.resource.*;

public class V4 {
    private final Approval approval; // 事件
    private final ExternalApproval externalApproval; // 三方审批定义
    private final ExternalInstance externalInstance; // 三方审批实例
    private final ExternalTask externalTask; // 三方审批任务
    private final Instance instance; // 审批查询
    private final InstanceComment instanceComment; // 原生审批评论
    private final Task task; // 原生审批任务

    public V4(Config config) {
        this.approval = new Approval(config);
        this.externalApproval = new ExternalApproval(config);
        this.externalInstance = new ExternalInstance(config);
        this.externalTask = new ExternalTask(config);
        this.instance = new Instance(config);
        this.instanceComment = new InstanceComment(config);
        this.task = new Task(config);
    }

    public Approval approval() {
        return approval;
    }

    public ExternalApproval externalApproval() {
        return externalApproval;
    }

    public ExternalInstance externalInstance() {
        return externalInstance;
    }

    public ExternalTask externalTask() {
        return externalTask;
    }

    public Instance instance() {
        return instance;
    }

    public InstanceComment instanceComment() {
        return instanceComment;
    }

    public Task task() {
        return task;
    }
}