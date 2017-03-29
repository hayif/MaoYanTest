package org.movie.entity;

/**
 * Created by guowei on 2017/2/26.
 * cinema_address_info 电影院地址
 */
public class CinemaAddress {
    //电影院地址id
    private String cinemaAddressId;
    //电影院地址 市
    private String cinemaAddressCity;
    //电影院地址 区
    private String cinemaAddressArea;

    public String getCinemaAddressId() {
        return cinemaAddressId;
    }

    public void setCinemaAddressId(String cinemaAddressId) {
        this.cinemaAddressId = cinemaAddressId;
    }

    public String getCinemaAddressCity() {
        return cinemaAddressCity;
    }

    public void setCinemaAddressCity(String cinemaAddressCity) {
        this.cinemaAddressCity = cinemaAddressCity;
    }

    public String getCinemaAddressArea() {
        return cinemaAddressArea;
    }

    public void setCinemaAddressArea(String cinemaAddressArea) {
        this.cinemaAddressArea = cinemaAddressArea;
    }

}
