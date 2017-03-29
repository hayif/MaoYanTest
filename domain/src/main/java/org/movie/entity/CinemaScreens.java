package org.movie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2017/3/13.
 * 影厅
 */
public class CinemaScreens {
    //id
    private String screensId;
    //影厅名称
    private String screensName;
    //座位数
    private int screensNum;
    //状态
    private int screensStatus;
    //关联座位 一对多 单向关联
    private List<CinemaSeats> cinemaSeatss = new ArrayList<CinemaSeats>();

    public String getScreensId() {
        return screensId;
    }

    public void setScreensId(String screensId) {
        this.screensId = screensId;
    }

    public String getScreensName() {
        return screensName;
    }

    public void setScreensName(String screensName) {
        this.screensName = screensName;
    }

    public int getScreensNum() {
        return screensNum;
    }

    public void setScreensNum(int screensNum) {
        this.screensNum = screensNum;
    }

    public int getScreensStatus() {
        return screensStatus;
    }

    public void setScreensStatus(int screensStatus) {
        this.screensStatus = screensStatus;
    }

    public List<CinemaSeats> getCinemaSeatss() {
        return cinemaSeatss;
    }

    public void setCinemaSeatss(List<CinemaSeats> cinemaSeatss) {
        this.cinemaSeatss = cinemaSeatss;
    }
}
