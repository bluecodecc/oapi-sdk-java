// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class FileComment {
    @SerializedName("comment_id")
    private String commentId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("create_time")
    private Integer createTime;
    @SerializedName("update_time")
    private Integer updateTime;
    @SerializedName("is_solved")
    private Boolean isSolved;
    @SerializedName("solved_time")
    private Integer solvedTime;
    @SerializedName("solver_user_id")
    private String solverUserId;
    @SerializedName("reply_list")
    private ReplyList replyList;

    public String getCommentId() {
        return this.commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsSolved() {
        return this.isSolved;
    }

    public void setIsSolved(Boolean isSolved) {
        this.isSolved = isSolved;
    }

    public Integer getSolvedTime() {
        return this.solvedTime;
    }

    public void setSolvedTime(Integer solvedTime) {
        this.solvedTime = solvedTime;
    }

    public String getSolverUserId() {
        return this.solverUserId;
    }

    public void setSolverUserId(String solverUserId) {
        this.solverUserId = solverUserId;
    }

    public ReplyList getReplyList() {
        return this.replyList;
    }

    public void setReplyList(ReplyList replyList) {
        this.replyList = replyList;
    }

}
