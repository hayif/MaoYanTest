package org.movie.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/30.
 */
public class Pager<E> {
    //数据
    private List<E> datas;
    //分页的开始值
    private int pageOffset;
    //总共多少条记录数
    private int totalRecord;
    //放置具体数据的列表
    private int pageSize;

    public Pager() {
    }

    public Pager(List<E> datas, int pageOffset, int totalRecord, int pageSize) {
        this.datas = datas;
        this.pageOffset = pageOffset;
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
    }

    public List<E> getDatas() {
        return datas;
    }

    public void setDatas(List<E> datas) {
        this.datas = datas;
    }

    public int getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
