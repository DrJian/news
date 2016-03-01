package com.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.NewsinfoMapper;
import com.news.dao.TopicMapper;
@Service("testService")
public class TestService {
	@Autowired
	NewsinfoMapper newsinfoMapper;
	@Autowired
	TopicMapper topicMapper;
}
