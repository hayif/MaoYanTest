package org.movie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by guowei on 2017/2/25.
 * 电影信息表 movie_info
 */
public class Movie {
    //电影id
    private String movieId;
    //电影名字
    private String movieName;
    //电影描述
    private String movieDescription;
    //电影简介
    private String movieIntro;
    //电影封面
    private String movieCover;
    //电影上映时间
    private Date movieReleaseDate;
    //电影落幕时间
    private Date movieEndDate;
    //电影时长
    private String movieTime;
    //电影评分
    private double movieScore;

    //关联用户成想看表（多对多、双向关联）
    private List<User> users = new ArrayList<User>();
    //关联图集（一对多、单向关联）
    private List<MoviePhotos> moviePhotoss = new ArrayList<MoviePhotos>();
    //关联电影区域（多对多、双向关联）
    private List<MovieArea> movieAreas = new ArrayList<MovieArea>();
    //关联电影类型（多对多、双向关联）
    private List<MovieType> movieTypes = new ArrayList<MovieType>();
    //关联电影年代（多对一、双向关联）
    private MovieDate movieDate;
    //关联电影版本（多对一、单向关联）/
    private MovieVersion movieVersion;
    //关联出演人员表（一对多、双向关联）
    private List<MovieActor> movieActors = new ArrayList<MovieActor>();
    //关联用户评论（一对多、单向关联）
    private List<CommentMovie> commentMovies = new ArrayList<CommentMovie>();
    //关联影院上映电影（一对多、双向关联）
    private List<CinemaShow> cinemaShows = new ArrayList<CinemaShow>();


    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieIntro() {
        return movieIntro;
    }

    public void setMovieIntro(String movieIntro) {
        this.movieIntro = movieIntro;
    }

    public String getMovieCover() {
        return movieCover;
    }

    public void setMovieCover(String movieCover) {
        this.movieCover = movieCover;
    }

    public Date getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(Date movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public Date getMovieEndDate() {
        return movieEndDate;
    }

    public void setMovieEndDate(Date movieEndDate) {
        this.movieEndDate = movieEndDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(double movieScore) {
        this.movieScore = movieScore;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<MoviePhotos> getMoviePhotoss() {
        return moviePhotoss;
    }

    public void setMoviePhotoss(List<MoviePhotos> moviePhotoss) {
        this.moviePhotoss = moviePhotoss;
    }

    public List<MovieArea> getMovieAreas() {
        return movieAreas;
    }

    public void setMovieAreas(List<MovieArea> movieAreas) {
        this.movieAreas = movieAreas;
    }

    public List<MovieType> getMovieTypes() {
        return movieTypes;
    }

    public void setMovieTypes(List<MovieType> movieTypes) {
        this.movieTypes = movieTypes;
    }

    public MovieDate getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(MovieDate movieDate) {
        this.movieDate = movieDate;
    }

    public MovieVersion getMovieVersion() {
        return movieVersion;
    }

    public void setMovieVersion(MovieVersion movieVersion) {
        this.movieVersion = movieVersion;
    }

    public List<MovieActor> getMovieActors() {
        return movieActors;
    }

    public void setMovieActors(List<MovieActor> movieActors) {
        this.movieActors = movieActors;
    }

    public List<CommentMovie> getCommentMovies() {
        return commentMovies;
    }

    public void setCommentMovies(List<CommentMovie> commentMovies) {
        this.commentMovies = commentMovies;
    }

    public List<CinemaShow> getCinemaShows() {
        return cinemaShows;
    }

    public void setCinemaShows(List<CinemaShow> cinemaShows) {
        this.cinemaShows = cinemaShows;
    }
}
