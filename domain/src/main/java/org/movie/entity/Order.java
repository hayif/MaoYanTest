package org.movie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by guowei on 2017/2/27.
 * 订单实体类 order_info
 */
public class Order {
    //订单id
    private String orderId;
    //订单总计金额
    private double orderTotal;
    //下单时间
    private Date orderStartTime;
    //完成时间
    private Date orderEndTime;
    //订单状态
    private String orderStatus;

    //关联用户（多对一、双向关联）
    private User user;
    //关联订单项（一对多、双向关联）
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Date getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Date orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
