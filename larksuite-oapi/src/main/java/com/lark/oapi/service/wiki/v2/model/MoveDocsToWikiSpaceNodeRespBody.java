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

package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class MoveDocsToWikiSpaceNodeRespBody {
    /**
     * 移动后的知识库token
     * <p> 示例值：
     */
    @SerializedName("wiki_token")
    private String wikiToken;
    /**
     * 任务id
     * <p> 示例值：7037044037068177428-075c9481e6a0007c1df689dfbe5b55a08b6b06f7
     */
    @SerializedName("task_id")
    private String taskId;
    /**
     * 是否提交了文档迁入申请
     * <p> 示例值：
     */
    @SerializedName("applied")
    private Boolean applied;

    public String getWikiToken() {
        return this.wikiToken;
    }

    public void setWikiToken(String wikiToken) {
        this.wikiToken = wikiToken;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Boolean getApplied() {
        return this.applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

}
