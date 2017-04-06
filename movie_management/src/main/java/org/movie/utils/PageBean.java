package org.movie.utils;

import java.util.List;

/**
 *	分页实体
 * @param <E>
 */
public class PageBean<E> {
	private int maxResult = 10;// 每页显示记录数
	private int pageNum;// 当前页数
    private int rowCount; //总记录数
	private int pageCount;// 总页数
	private List<E> list;// 封装结果集

	public int getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}

    public int getRowCount() {
        return rowCount;
    }

	//根据总记录数计算出总页数
    public void setRowCount(int rowCount){
		this.rowCount = rowCount;
		this.pageCount = (rowCount % maxResult == 0) ? rowCount / maxResult
				: rowCount / maxResult + 1;
	}

    public int getPageCount() {
		return pageCount;
	}

	//从第几条记录开始查询
	public int getFirstResult() {
		return (getPageNum() - 1) * this.maxResult+1;
	}

	public int getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = (pageNum == 0) ? 1 : pageNum;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

}
