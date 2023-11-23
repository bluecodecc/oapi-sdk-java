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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class IdCard {
    /**
     * 识别的实体列表
     * <p> 示例值：
     */
    @SerializedName("entities")
    private IdEntity[] entities;
    /**
     * 正反面，1为身份证-姓名页，0为身份证-国徽页
     * <p> 示例值：0
     */
    @SerializedName("side")
    private Integer side;
    /**
     * 四角坐标[x0,y0,x1,y1,x2,y2,x3,y3]
     * <p> 示例值：
     */
    @SerializedName("conners")
    private Integer[] conners;

    // builder 开始
    public IdCard() {
    }

    public IdCard(Builder builder) {
        /**
         * 识别的实体列表
         * <p> 示例值：
         */
        this.entities = builder.entities;
        /**
         * 正反面，1为身份证-姓名页，0为身份证-国徽页
         * <p> 示例值：0
         */
        this.side = builder.side;
        /**
         * 四角坐标[x0,y0,x1,y1,x2,y2,x3,y3]
         * <p> 示例值：
         */
        this.conners = builder.conners;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public IdEntity[] getEntities() {
        return this.entities;
    }

    public void setEntities(IdEntity[] entities) {
        this.entities = entities;
    }

    public Integer getSide() {
        return this.side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Integer[] getConners() {
        return this.conners;
    }

    public void setConners(Integer[] conners) {
        this.conners = conners;
    }

    public static class Builder {
        /**
         * 识别的实体列表
         * <p> 示例值：
         */
        private IdEntity[] entities;
        /**
         * 正反面，1为身份证-姓名页，0为身份证-国徽页
         * <p> 示例值：0
         */
        private Integer side;
        /**
         * 四角坐标[x0,y0,x1,y1,x2,y2,x3,y3]
         * <p> 示例值：
         */
        private Integer[] conners;

        /**
         * 识别的实体列表
         * <p> 示例值：
         *
         * @param entities
         * @return
         */
        public Builder entities(IdEntity[] entities) {
            this.entities = entities;
            return this;
        }


        /**
         * 正反面，1为身份证-姓名页，0为身份证-国徽页
         * <p> 示例值：0
         *
         * @param side
         * @return
         */
        public Builder side(Integer side) {
            this.side = side;
            return this;
        }


        /**
         * 四角坐标[x0,y0,x1,y1,x2,y2,x3,y3]
         * <p> 示例值：
         *
         * @param conners
         * @return
         */
        public Builder conners(Integer[] conners) {
            this.conners = conners;
            return this;
        }


        public IdCard build() {
            return new IdCard(this);
        }
    }
}