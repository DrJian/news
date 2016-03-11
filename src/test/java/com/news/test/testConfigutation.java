package com.news.test;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.news.dao.NewsinfoMapper;
import com.news.model.Newsinfo;
import com.news.service.NewsinfoService;
import com.news.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/springmvc.xml",
		"classpath:conf/spring-mybatis.xml"})
public class testConfigutation {
	@Autowired
	private TestService  testService;
	@Autowired()
	private NewsinfoMapper newsinfoMapper;
	@Autowired NewsinfoService  newsinfoService;
	//@Test
	public void testInsertTopic(){
		
	}

	@Test
	public void testGetNewsinfoListByPageNo() throws ParseException{
		System.out.println(newsinfoMapper==null);
		Newsinfo newsinfo = newsinfoService.getNewsinfoById(1);
		System.out.println(newsinfo);
	}
}
