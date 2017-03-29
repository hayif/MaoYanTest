package org.movie.entity;

import java.util.Date;
/**
 * Created by guowei on 2017/2/26.
 * 用户评论电影实体类 comment_info
 */
public class CommentMovie {
    //评论id
    private String commentId;
    //评论内容
    private String commentContext;
    //评分
    private double commentScore;
    //评论时间
    private Date commentTime;

    //关联用户（多对一、双向关联）
    private User user;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    public double getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(double commentScore) {
        this.commentScore = commentScore;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
