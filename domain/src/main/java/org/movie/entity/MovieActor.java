package org.movie.entity;

/**
 * Created by guowei on 2017/3/13.
 * 每个电影出演人员
 */
public class MovieActor {
    //id
    private String movieActorId;
    //电影角色名称
    private String movieActorName;

    //关联演员（多对一，单向关联）
    private Actor actor;
    //关联演员类型（多对一，单向关联）
    private ActorType actorType;
    //关联电影（多对一、双向关联）
    private Movie movie;

    public String getMovieActorId() {
        return movieActorId;
    }

    public void setMovieActorId(String movieActorId) {
        this.movieActorId = movieActorId;
    }

    public String getMovieActorName() {
        return movieActorName;
    }

    public void setMovieActorName(String movieActorName) {
        this.movieActorName = movieActorName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public ActorType getActorType() {
        return actorType;
    }

    public void setActorType(ActorType actorType) {
        this.actorType = actorType;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}

