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

package com.lark.oapi.service.search.v2.enums;

/**
 * 属性类型
 */
public enum SchemaPropertySchemaPropertyTypeEnum {
    TEXT("text"), // 长文本类型
    INT("int"), // 64位整数类型
    TAG("tag"), // 标签类型
    TIMESTAMP("timestamp"), // Unix 时间戳类型（单位为秒）
    DOUBLE("double"), // 浮点数类型（小数）
    TINYTEXT("tinytext"), // 短文本类型，（utf8 编码）长度小于 140 的文本
    ;
    private String value;

    SchemaPropertySchemaPropertyTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}