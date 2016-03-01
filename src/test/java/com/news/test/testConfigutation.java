package com.news.test;

import java.io.Reader;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.news.dao.NewsinfoMapper;
import com.news.model.Topic;
import com.news.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/servlet-context.xml",
		"classpath:conf/spring-mybatis.xml"})
public class testConfigutation {
	@Autowired
	private TestService  testService;
	@Autowired()
	private NewsinfoMapper newsinfoMapper;
	//@Test
	public void testInsertTopic(){
		
	}

	@Test
	public void testGetNewsinfoListByPageNo(){
		//System.out.println(newsinfoMapper.getNewsinfoListByPageNo(1, 5));
		System.out.println(newsinfoMapper==null);
		//System.out.println("success");
	}
}
