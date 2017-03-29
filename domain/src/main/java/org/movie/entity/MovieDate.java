package org.movie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2017/2/26.
 * movie_date 电影年代
 */
public class MovieDate {
    //电影年代id
    private String movieDateId;
    //电影年代名称
    private String movieDateName;
    //状态
    private int movieDateStatus;
    //关联电影（一对多、双向关联）
    private List<Movie> movies = new ArrayList<Movie>();


    public String getMovieDateId() {
        return movieDateId;
    }

    public void setMovieDateId(String movieDateId) {
        this.movieDateId = movieDateId;
    }

    public String getMovieDateName() {
        return movieDateName;
    }

    public void setMovieDateName(String movieDateName) {
        this.movieDateName = movieDateName;
    }

    public int getMovieDateStatus() {
        return movieDateStatus;
    }

    public void setMovieDateStatus(int movieDateStatus) {
        this.movieDateStatus = movieDateStatus;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
