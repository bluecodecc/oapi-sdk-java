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

package com.lark.oapi.service.corehr.v2.enums;

/**
 * 此次调用中使用的部门 ID 类型
 */
public enum SearchProbationDepartmentIdTypeEnum {
    OPEN_DEPARTMENT_ID("open_department_id"), // 以 open_department_id 来标识部门
    DEPARTMENT_ID("department_id"), // 以 department_id 来标识部门
    PEOPLE_COREHR_DEPARTMENT_ID("people_corehr_department_id"), // 以 people_corehr_department_id 来标识部门
    ;
    private String value;

    SearchProbationDepartmentIdTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}