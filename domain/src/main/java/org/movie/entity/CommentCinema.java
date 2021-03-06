package org.movie.entity;

import java.util.Date;

/**
 * Created by guowei on 2017/3/13.
 * 用户评论影院实体类 comment_cinema_info
 */
public class CommentCinema {
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
    //关联影院（多对一、双向关联）
    private Cinema cinema;

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

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
