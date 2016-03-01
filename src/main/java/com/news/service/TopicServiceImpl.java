package com.news.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.TopicMapper;
import com.news.model.Topic;

@Service("topicService")
public class TopicServiceImpl implements TopicService{
	@Autowired
	private TopicMapper topicMapper;
	@Override
	public void insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicMapper.insertTopic(topic);
	}
	@Override
	public List<Topic> getTopicList() {
		// TODO Auto-generated method stub
		return topicMapper.getTopicList();
	}
	
}
