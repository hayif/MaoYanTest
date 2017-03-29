package org.movie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2017/2/26.
 *  movie_type_info 电影类别
 */
public class MovieType {
    //电影类型id
    private String movieTypeId;
    //电影类型名
    private String movieTypeName;
    //状态
    private int movieTypeStatus;
    //关联电影（多对多、双向关联）
    private List<Movie> movies = new ArrayList<Movie>();

    public String getMovieTypeId() {
        return movieTypeId;
    }

    public void setMovieTypeId(String movieTypeId) {
        this.movieTypeId = movieTypeId;
    }

    public String getMovieTypeName() {
        return movieTypeName;
    }

    public void setMovieTypeName(String movieTypeName) {
        this.movieTypeName = movieTypeName;
    }

    public int getMovieTypeStatus() {
        return movieTypeStatus;
    }

    public void setMovieTypeStatus(int movieTypeStatus) {
        this.movieTypeStatus = movieTypeStatus;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
