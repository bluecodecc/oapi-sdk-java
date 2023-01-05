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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateAppTableRecord {

    /**
     * {;    "fields": {;        "人力评估": 2,;        "任务执行人": [;            {;                "id":
     * "ou_debc524b2d8cb187704df652b43d29de";            };        ],;        "任务描述": "多渠道收集用户反馈",;
     * "对应 OKR": [;            "recqwIwhc6",;            "recOuEJMvN";        ],;        "截止日期":
     * 1609516800000,;        "是否完成": true,;        "状态": "已结束",;        "相关部门": [;            "销售",;
     * "客服";        ];    };}
     * <p> 示例值：
     */
    @SerializedName("record")
    private AppTableRecord record;

    public AppTableRecord getRecord() {
        return this.record;
    }

    public void setRecord(AppTableRecord record) {
        this.record = record;
    }

}
