package com.news.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.news.model.Topic;
@Repository
public interface TopicMapper {
	public int insertTopic(Topic topic);
	/**
	 * 获取所有的新闻种类的List
	 */
	public List<Topic> getTopicList();
}
