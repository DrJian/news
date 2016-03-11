package com.news.service;

import java.text.ParseException;
import java.util.List;

import com.news.model.Newsinfo;
import com.news.model.Topic;

public interface NewsinfoService {
	//根据新闻id查询显示一条特定新闻的信息
	public Newsinfo getNewsinfoById(int news_id) throws ParseException;
	// 加入一条新的新闻
	public int addNewsinfo(Newsinfo newsinfo);

	// 删除一条新闻
	public int deleteNewsinfo(int news_id);

	// 更新一条新闻
	public int updateNewsinfo(Newsinfo newsinfo);
	
	/**
	 * 获取默认新闻总数显示在默认首页中
	 */
	public int getNewsTotalCount();

	/**
	 * 获取默认指定部分的新闻列表
	 */
	public List<Newsinfo> getNewsinfoListByPageNo(int pageNo, int perPageRows);

	/**
	 * 获取指定类型新闻的总数
	 */
	public int getNewsTotalCountByType(int topic_id);

	/**
	 * 根据新闻的种类，获取指定部分的新闻列表，对于页数判断以及取多少条，在业务逻辑中进行处理，即service层
	 */
	public List<Newsinfo> getNewsinfoListByTypeAndpageNo(int pageNo, int topic_id, int perPageRows);

	/**
	 * 获取模糊查询的结果新闻总数
	 */
	public int getNewsTotalCountByVague(String newsTitle);

	/**
	 * 根据新闻标题在数据库中进行模糊查询，并返回所有有可能的新闻列表,默认先分页
	 */
	public List<Newsinfo> getNewsinfoListByNewsTitle(String newsTitle, int pageNo, int perPageRows);
}
