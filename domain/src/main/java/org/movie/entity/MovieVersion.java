package org.movie.entity;

/**
 * Created by guowei on 2017/2/26.
 * movie_version_info 电影版本
 */
public class MovieVersion {
    //电影画面id
    private String movieVersionId;
    //电影画面名称
    private String movieVersionName;
    //状态
    private int movieVersionStatus;


    public String getMovieVersionId() {
        return movieVersionId;
    }

    public void setMovieVersionId(String movieVersionId) {
        this.movieVersionId = movieVersionId;
    }

    public String getMovieVersionName() {
        return movieVersionName;
    }

    public void setMovieVersionName(String movieVersionName) {
        this.movieVersionName = movieVersionName;
    }

    public int getMovieVersionStatus() {
        return movieVersionStatus;
    }

    public void setMovieVersionStatus(int movieVersionStatus) {
        this.movieVersionStatus = movieVersionStatus;
    }
}