package org.movie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2017/2/26.
 * movie_area_info 电影地区
 */
public class MovieArea {
    //电影地区id
    private String movieAreaId;
    //电影地区名字
    private String movieAreaName;
    //状态
    private int movieAreaStatus;
    //关联电影（多对多、双向关联）
    private List<Movie> movies = new ArrayList<Movie>();

    public String getMovieAreaId() {
        return movieAreaId;
    }

    public void setMovieAreaId(String movieAreaId) {
        this.movieAreaId = movieAreaId;
    }

    public String getMovieAreaName() {
        return movieAreaName;
    }

    public void setMovieAreaName(String movieAreaName) {
        this.movieAreaName = movieAreaName;
    }

    public int getMovieAreaStatus() {
        return movieAreaStatus;
    }

    public void setMovieAreaStatus(int movieAreaStatus) {
        this.movieAreaStatus = movieAreaStatus;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
