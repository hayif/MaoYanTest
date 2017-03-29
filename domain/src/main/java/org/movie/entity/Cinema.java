package org.movie.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by guowei on 2017/2/26.
 * 电影院实体类cinema_info
 */
public class Cinema {
    //电影院id
    private String cinemaId;
    //电影院名字
    private String cinemaName;
    //电影院封面
    private String cinemaCover;
    //电影院评分
    private double cinemaScore;
    //电影院简介
    private String cinemaIntro;
    //电影院电话
    private String cinemaTel;
    //电影院地址 详情
    private String cinemaAddressParticular;
    //影院状态
    private String cinemaStatus;

    //关联影院地址（多对一、单向关联）
    private CinemaAddress cinemaAddress;
    //关联影厅（一对多、单向关联）
    private List<CinemaScreens> cinemaScreenss = new ArrayList<CinemaScreens>();
    //关联评价影院（一对多）
    private List<CommentCinema> commentCinemas = new ArrayList<CommentCinema>();
    //关联影院上映电影（一对多、双向关联）
    private List<CinemaShow> cinemaShows = new ArrayList<CinemaShow>();

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaCover() {
        return cinemaCover;
    }

    public void setCinemaCover(String cinemaCover) {
        this.cinemaCover = cinemaCover;
    }

    public double getCinemaScore() {
        return cinemaScore;
    }

    public void setCinemaScore(double cinemaScore) {
        this.cinemaScore = cinemaScore;
    }

    public String getCinemaIntro() {
        return cinemaIntro;
    }

    public void setCinemaIntro(String cinemaIntro) {
        this.cinemaIntro = cinemaIntro;
    }

    public String getCinemaTel() {
        return cinemaTel;
    }

    public void setCinemaTel(String cinemaTel) {
        this.cinemaTel = cinemaTel;
    }

    public String getCinemaStatus() {
        return cinemaStatus;
    }

    public void setCinemaStatus(String cinemaStatus) {
        this.cinemaStatus = cinemaStatus;
    }

    public String getCinemaAddressParticular() {
        return cinemaAddressParticular;
    }

    public void setCinemaAddressParticular(String cinemaAddressParticular) {
        this.cinemaAddressParticular = cinemaAddressParticular;
    }

    public CinemaAddress getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(CinemaAddress cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public List<CinemaScreens> getCinemaScreenss() {
        return cinemaScreenss;
    }

    public void setCinemaScreenss(List<CinemaScreens> cinemaScreenss) {
        this.cinemaScreenss = cinemaScreenss;
    }

    public List<CommentCinema> getCommentCinemas() {
        return commentCinemas;
    }

    public void setCommentCinemas(List<CommentCinema> commentCinemas) {
        this.commentCinemas = commentCinemas;
    }

    public List<CinemaShow> getCinemaShows() {
        return cinemaShows;
    }

    public void setCinemaShows(List<CinemaShow> cinemaShows) {
        this.cinemaShows = cinemaShows;
    }
}
