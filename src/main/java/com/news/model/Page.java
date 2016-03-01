package com.news.model;

public class Page {
	private int pageNo;//待显示页
	private int perPageRows;//每页显示的新闻数
	private int totalNewsCount;//新闻总数
	private int totalPageCount;//总页数
	public Page(){
		pageNo = 1;
		perPageRows = 5;
		totalNewsCount = 0;
		totalPageCount = 0;
	}
	public int getCurPage() {
		return pageNo;
	}
	public void setCurPage(int curPage) {
		this.pageNo = curPage;
	}
	public int getPerPageRows() {
		return perPageRows;
	}
	public void setPerPageRows(int perPageRows) {
		this.perPageRows = perPageRows;
	}
	public int getTotalRowCount() {
		return totalNewsCount;
	}
	public void setTotalRowCount(int totalRowCount) {
		this.totalNewsCount = totalRowCount;
	}
	public int getTotalPageCount() {
		return (totalNewsCount+perPageRows-1)/perPageRows;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
}
