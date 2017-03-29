package org.movie.entity;

/**
 * Created by guowei on 2017/3/14.
 * 影厅座位
 */
public class CinemaSeats {
    //id
    private String id;
    //行号 排
    private int row;
    //列号 座
    private int col;
    //状态
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
