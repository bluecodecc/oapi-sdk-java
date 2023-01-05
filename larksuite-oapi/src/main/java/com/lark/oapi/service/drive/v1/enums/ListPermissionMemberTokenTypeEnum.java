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

package com.lark.oapi.service.drive.v1.enums;

/**
 * 文件类型，需要与文件的 token 相匹配
 */
public enum ListPermissionMemberTokenTypeEnum {
    DOC("doc"), // 文档
    SHEET("sheet"), // 电子表格
    FILE("file"), // 云空间文件
    WIKI("wiki"), // 知识库节点
    BITABLE("bitable"), // 多维表格
    DOCX("docx"), // 新版文档
    MINDNOTE("mindnote"), // 思维笔记
    MINUTES("minutes"), // 妙记
    ;
    private String value;

    ListPermissionMemberTokenTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}