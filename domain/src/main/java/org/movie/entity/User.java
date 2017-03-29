package org.movie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2017/2/25.
 * 用户信息表 user_info
 */
public class User {
    //用户id
    private String userId;
    //用户名
    private String userName;
    //用户手机号
    private String userPhone;
    //用户密码
    private String userPassword;
    //用户头像
    private String userHeadPortrait;
    //用户版本号
    private int userVersion;
    //状态
    private int userStatus;
    //关联订单（一对多、双向关联）
    private List<Order> orders = new ArrayList<Order>();
    //关联电影成想看列表（多对多、双向关联）
    private List<Movie> movies = new ArrayList<Movie>();
    //关联电影评价（一对多、双向关联）
    private List<CommentMovie> commentMovies = new ArrayList<CommentMovie>();
    //关联电影院评价（一对多、双向关联）
    private List<CommentCinema> commentCinemas = new ArrayList<CommentCinema>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    public int getUserVersion() {
        return userVersion;
    }

    public void setUserVersion(int userVersion) {
        this.userVersion = userVersion;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<CommentMovie> getCommentMovies() {
        return commentMovies;
    }

    public void setCommentMovies(List<CommentMovie> commentMovies) {
        this.commentMovies = commentMovies;
    }

    public List<CommentCinema> getCommentCinemas() {
        return commentCinemas;
    }

    public void setCommentCinemas(List<CommentCinema> commentCinemas) {
        this.commentCinemas = commentCinemas;
    }
}
