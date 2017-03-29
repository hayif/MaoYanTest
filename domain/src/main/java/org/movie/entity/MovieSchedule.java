package org.movie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by guowei on 2017/3/13.
 * 电影排片表
 */
public class MovieSchedule {
    //id
    private String movieScheduleId;
    //开场时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //票价
    private double ticketPrice;

    //关联订单项（一对多、单向关联）
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();
    //关联影厅（多对一、双向关联）
    private CinemaScreens screens;
    //关联上映表 （多对一、单向关联）
    private CinemaShow cinemaShow;

    public String getMovieScheduleId() {
        return movieScheduleId;
    }

    public void setMovieScheduleId(String movieScheduleId) {
        this.movieScheduleId = movieScheduleId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public CinemaScreens getScreens() {
        return screens;
    }

    public void setScreens(CinemaScreens screens) {
        this.screens = screens;
    }

    public CinemaShow getCinemaShow() {
        return cinemaShow;
    }

    public void setCinemaShow(CinemaShow cinemaShow) {
        this.cinemaShow = cinemaShow;
    }
}
