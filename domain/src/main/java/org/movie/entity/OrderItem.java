package org.movie.entity;

/**
 * Created by guowei on 2017/2/27.
 * 购票订单项实体类 order_item_info
 */
public class OrderItem {
    //订单项id
    private String itemId;
    //数量
    private int itemNum;

    //关联订单（多对一、双向关联）
    private Order order;
    //关联电影排片（多对一、双向关联）
    private MovieSchedule movieSchedule;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public MovieSchedule getMovieSchedule() {
        return movieSchedule;
    }

    public void setMovieSchedule(MovieSchedule movieSchedule) {
        this.movieSchedule = movieSchedule;
    }
}
