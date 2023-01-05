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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListMetricSourceTableRespBody {
    /**
     * 符合条件的记录总数
     * <p> 示例值：10
     */
    @SerializedName("total")
    private Integer total;
    /**
     * 是否有下一页
     * <p> 示例值：false
     */
    @SerializedName("has_more")
    private Boolean hasMore;
    /**
     * 下一页页码
     * <p> 示例值：10
     */
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 指标表列表
     * <p> 示例值：
     */
    @SerializedName("items")
    private MetricTable[] items;

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public MetricTable[] getItems() {
        return this.items;
    }

    public void setItems(MetricTable[] items) {
        this.items = items;
    }

}
