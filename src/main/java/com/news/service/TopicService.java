package com.news.service;

import java.util.List;

import com.news.model.Topic;

public interface TopicService {
	/*
	 * 添加 topic
	 */
	public void insertTopic(Topic topic);
	/**
	 * 获取新闻分类列表
	 */
	public List<Topic> getTopicList();
}
