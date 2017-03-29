package org.movie.entity;

import java.util.Date;

/**
 * Created by guowei on 2017/2/26.
 * actor_info 演员信息表
 */
public class Actor {
    //演员id
    private String actorId;
    //演员名字
    private String actorName;
    //演员照片
    private String actorPhoto;
    //演员简介
    private String actorIntro;
    //演员出生日期
    private Date actorBirthday;
    //演员出生地
    private String actorBirthplace;
    //演员性别
    private String actorSex;
    //演员国籍
    private String actorNationality;
    //演员民族
    private String actorNation;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorPhoto() {
        return actorPhoto;
    }

    public void setActorPhoto(String actorPhoto) {
        this.actorPhoto = actorPhoto;
    }

    public String getActorIntro() {
        return actorIntro;
    }

    public void setActorIntro(String actorIntro) {
        this.actorIntro = actorIntro;
    }

    public Date getActorBirthday() {
        return actorBirthday;
    }

    public void setActorBirthday(Date actorBirthday) {
        this.actorBirthday = actorBirthday;
    }

    public String getActorBirthplace() {
        return actorBirthplace;
    }

    public void setActorBirthplace(String actorBirthplace) {
        this.actorBirthplace = actorBirthplace;
    }

    public String getActorSex() {
        return actorSex;
    }

    public void setActorSex(String actorSex) {
        this.actorSex = actorSex;
    }

    public String getActorNationality() {
        return actorNationality;
    }

    public void setActorNationality(String actorNationality) {
        this.actorNationality = actorNationality;
    }

    public String getActorNation() {
        return actorNation;
    }

    public void setActorNation(String actorNation) {
        this.actorNation = actorNation;
    }
}
