package com.news.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.NewsinfoMapper;
import com.news.model.Newsinfo;

@Service("newsinfoService")
public class NewsinfoServiceImpl implements NewsinfoService {
	@Autowired
	private NewsinfoMapper newsinfoMapper;

	@Override
	public Newsinfo getNewsinfoById(int news_id) throws ParseException {
		// TODO Auto-generated method stub
		//在这里改变一下日期格式，输出更适宜中国人阅读习惯
		Newsinfo newsinfo =newsinfoMapper.getNewsinfoById(news_id); 
		//TimeConverterFromMysql.ConvertTimeFormat(newsinfo.getCreatedate());
		//newsinfo.setCreatedate(TimeConverterFromMysql.ConvertTimeFormat(newsinfo.getCreatedate()));
		if(newsinfo.getCreateDate()==null)
		{
			System.out.println("this date is null");
		}
		return newsinfo;
	}

	@Override
	public int addNewsinfo(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		return newsinfoMapper.addNewsinfo(newsinfo);
	}

	@Override
	public int deleteNewsinfo(int news_id) {
		// TODO Auto-generated method stub
		return newsinfoMapper.deleteNewsinfo(news_id);
	}

	@Override
	public int updateNewsinfo(Newsinfo newsinfo) {
		// TODO Auto-generated method stub
		return newsinfoMapper.updateNewsinfo(newsinfo);
	}

	@Override
	public int getNewsTotalCount() {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsTotalCount();
	}

	@Override
	public List<Newsinfo> getNewsinfoListByPageNo(int pageNo, int perPageRows) {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsinfoListByPageNo((pageNo - 1) * perPageRows, perPageRows);
	}

	@Override
	public int getNewsTotalCountByType(int topic_id) {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsTotalCountByType(topic_id);
	}

	@Override
	public List<Newsinfo> getNewsinfoListByTypeAndpageNo(int pageNo, int topic_id, int perPageRows) {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsinfoListByTypeAndpageNo((pageNo - 1) * perPageRows, topic_id, perPageRows);
	}

	@Override
	public int getNewsTotalCountByVague(String newsTitle) {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsTotalCountByVague(newsTitle);
	}

	@Override
	public List<Newsinfo> getNewsinfoListByNewsTitle(String newsTitle, int pageNo, int perPageRows) {
		// TODO Auto-generated method stub
		return newsinfoMapper.getNewsinfoListByNewsTitle(newsTitle, (pageNo - 1) * perPageRows, perPageRows);
	}

}
