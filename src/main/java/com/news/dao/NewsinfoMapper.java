package com.news.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.news.model.Newsinfo;

public interface NewsinfoMapper {
	// 根据新闻id查询显示一条特定新闻的信息
	public Newsinfo getNewsinfoById(@Param(value="news_id")int news_id);

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
	 * 获取指定类型新闻的总数
	 */
	public int getNewsTotalCountByType(@Param(value = "topic_id") int topic_id);

	/**
	 * 获取默认指定部分的新闻列表，对于页数判断以及取多少条，在业务逻辑中进行处理，即service层
	 */
	public List<Newsinfo> getNewsinfoListByPageNo(@Param(value = "pageNo") int pageNo,
			@Param(value = "perPageRows") int perPageRows);

	/**
	 * 根据新闻的种类，获取指定部分的新闻列表，对于页数判断以及取多少条，在业务逻辑中进行处理，即service层
	 */
	public List<Newsinfo> getNewsinfoListByTypeAndpageNo(@Param(value = "pageNo") int pageNo,
			@Param(value = "topic_id") int topic_id, @Param(value = "perPageRows") int perPageRows);

	/**
	 * 获取模糊查询的结果新闻总数
	 */
	public int getNewsTotalCountByVague(@Param(value = "news_title") String newsTitle);

	/**
	 * 根据新闻标题在数据库中进行模糊查询，并返回所有有可能的新闻列表,默认先分页
	 */
	public List<Newsinfo> getNewsinfoListByNewsTitle(@Param(value = "news_title") String newsTitle,
			@Param(value = "pageNo") int pageNo, @Param(value = "perPageRows") int perPageRows);
}
