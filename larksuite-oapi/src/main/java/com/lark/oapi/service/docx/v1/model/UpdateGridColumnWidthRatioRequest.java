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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateGridColumnWidthRatioRequest {
    /**
     * 更新列宽比例时，需要传入所有列宽占比
     * <p> 示例值：50
     */
    @SerializedName("width_ratios")
    private Integer[] widthRatios;

    // builder 开始
    public UpdateGridColumnWidthRatioRequest() {
    }

    public UpdateGridColumnWidthRatioRequest(Builder builder) {
        /**
         * 更新列宽比例时，需要传入所有列宽占比
         * <p> 示例值：50
         */
        this.widthRatios = builder.widthRatios;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer[] getWidthRatios() {
        return this.widthRatios;
    }

    public void setWidthRatios(Integer[] widthRatios) {
        this.widthRatios = widthRatios;
    }

    public static class Builder {
        /**
         * 更新列宽比例时，需要传入所有列宽占比
         * <p> 示例值：50
         */
        private Integer[] widthRatios;

        /**
         * 更新列宽比例时，需要传入所有列宽占比
         * <p> 示例值：50
         *
         * @param widthRatios
         * @return
         */
        public Builder widthRatios(Integer[] widthRatios) {
            this.widthRatios = widthRatios;
            return this;
        }


        public UpdateGridColumnWidthRatioRequest build() {
            return new UpdateGridColumnWidthRatioRequest(this);
        }
    }
}
