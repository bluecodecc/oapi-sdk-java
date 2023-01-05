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

package com.lark.oapi.service.gray_test_open_sg.v1.model;

import com.google.gson.annotations.SerializedName;

public class Level {
    /**
     * string
     * <p> 示例值：
     */
    @SerializedName("level")
    private String level;
    /**
     * body
     * <p> 示例值：
     */
    @SerializedName("body")
    private String body;
    /**
     * type
     * <p> 示例值：
     */
    @SerializedName("type")
    private String type;

    // builder 开始
    public Level() {
    }

    public Level(Builder builder) {
        /**
         * string
         * <p> 示例值：
         */
        this.level = builder.level;
        /**
         * body
         * <p> 示例值：
         */
        this.body = builder.body;
        /**
         * type
         * <p> 示例值：
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * string
         * <p> 示例值：
         */
        private String level;
        /**
         * body
         * <p> 示例值：
         */
        private String body;
        /**
         * type
         * <p> 示例值：
         */
        private String type;

        /**
         * string
         * <p> 示例值：
         *
         * @param level
         * @return
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }


        /**
         * body
         * <p> 示例值：
         *
         * @param body
         * @return
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }


        /**
         * type
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        public Level build() {
            return new Level(this);
        }
    }
}
