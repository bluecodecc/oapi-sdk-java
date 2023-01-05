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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class FaqImageFaqReq {
    /**
     * 知识库ID
     * <p> 示例值：12345
     */
    @Path
    @SerializedName("id")
    private String id;
    /**
     * 图像key
     * <p> 示例值：img_b07ffac0-19c1-48a3-afca-599f8ea825fj
     */
    @Path
    @SerializedName("image_key")
    private String imageKey;

    // builder 开始
    public FaqImageFaqReq() {
    }

    public FaqImageFaqReq(Builder builder) {
        /**
         * 知识库ID
         * <p> 示例值：12345
         */
        this.id = builder.id;
        /**
         * 图像key
         * <p> 示例值：img_b07ffac0-19c1-48a3-afca-599f8ea825fj
         */
        this.imageKey = builder.imageKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageKey() {
        return this.imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    public static class Builder {

        private String id; // 知识库ID
        private String imageKey; // 图像key

        /**
         * 知识库ID
         * <p> 示例值：12345
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 图像key
         * <p> 示例值：img_b07ffac0-19c1-48a3-afca-599f8ea825fj
         *
         * @param imageKey
         * @return
         */
        public Builder imageKey(String imageKey) {
            this.imageKey = imageKey;
            return this;
        }

        public FaqImageFaqReq build() {
            return new FaqImageFaqReq(this);
        }
    }
}
