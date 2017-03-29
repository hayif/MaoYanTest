package org.movie.entity;

/**
 * Created by guowei on 2017/3/14.
 * 影院上映电影
 */
public class CinemaShow {
    //id
    private String showId;
    //关联电影（多对一，双向）
    private Movie movie;
    //关联电影院（多对一，双向）
    private Cinema cinema;


    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
