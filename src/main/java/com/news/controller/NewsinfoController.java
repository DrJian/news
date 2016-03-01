package com.news.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.news.model.Newsinfo;
import com.news.model.Page;
import com.news.service.NewsinfoService;
import com.news.utils.TimeConverter;

@Controller
public class NewsinfoController {
	@Autowired
	private NewsinfoService newsinfoService;
	
	private Page page;
	
	private HttpSession session;
	//每次都更新page的状态
	@ModelAttribute
	public void getPage(HttpSession session){
		page = (Page)session.getAttribute("page");
		page.setPerPageRows(10);
	}
	@ModelAttribute
	public void setSession(HttpServletRequest request){
		session = request.getSession();
	}
	//处理默认的更多新闻列表(第一次点击更多进入)
	@RequestMapping(value="/DefaultNewsList")
	public ModelAndView getDefaultNewsList(@RequestParam("topic_id")int topic_id){
		ModelAndView mav = new ModelAndView();
		//更新Page总新闻数
		page.setTotalRowCount(newsinfoService.getNewsTotalCount());
		//将page,pageList(分页数量的数组),NewsinfoList存入Session内
		mav.addObject("page", page);
		/*//方便在jsp页面中进行分页
		int[] pageList = new int[page.getTotalPageCount()];
		mv.addObject("pageList",pageList);*/
		mav.setViewName("SpecificNewsList");
		mav.addObject("topic_id",topic_id);
		mav.addObject("newsinfoList", newsinfoService.getNewsinfoListByPageNo(page.getCurPage(),page.getPerPageRows()));
		return mav;
	}
	//处理第二次分页时选择的页面
	@RequestMapping(value="/DefaultNewsList2")
	public ModelAndView getDefaultNewsList2(@RequestParam("pageNo")int pageNo){
		ModelAndView mav = new ModelAndView();
		//更新待显示页面，刷新总页数
		page.setCurPage(pageNo);
		page.setTotalRowCount(newsinfoService.getNewsTotalCount());
		//将page，newsinfoList存入Session内
		mav.setViewName("SpecificNewsList");
		mav.addObject("page", page);
		mav.addObject("newsinfoList", newsinfoService.getNewsinfoListByPageNo(page.getCurPage(), page.getPerPageRows()));
		return mav;
	}
	//处理点击分类新闻的请求
	@RequestMapping(value="/selectedTopic")
	public ModelAndView getSelectedTopic(@RequestParam("topic_id")int topic_id,@RequestParam("pageNo")int pageNo){
		ModelAndView mav = new ModelAndView();
		//更新page的总新闻数,页数
		page.setCurPage(pageNo);
		page.setTotalRowCount(newsinfoService.getNewsTotalCountByType(topic_id));
		////将page,pageList(分页数量的数组),NewsinfoList存入Session内
		mav.setViewName("SpecificNewsList2");
		mav.addObject("topic_id",topic_id);
		mav.addObject("page", page);
		mav.addObject("newsinfoList", newsinfoService.getNewsinfoListByTypeAndpageNo(pageNo, topic_id, page.getPerPageRows()));
		return mav;
	}
	@RequestMapping(value="/selectedNews")
	public ModelAndView getSelectedNews(@RequestParam("news_id")int news_id) throws ParseException{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("NewsDetail");
		mav.addObject("newsinfo",newsinfoService.getNewsinfoById(news_id));
		return mav;
	}
	@RequestMapping(value="/AddNews",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> AddNews(@RequestBody Newsinfo newsinfo) throws ParseException{
		//设置作者id以及新闻入库时间
		newsinfo.setAuthor_id((Integer)session.getAttribute("managerId"));
		newsinfo.setCreatedate(TimeConverter.getTimeNow());
		System.out.println(newsinfo);
		//将新的新闻插入数据库,通过判断返回值来确定插入是否成功,这里返回id值会赋值给newsinfo
		newsinfoService.addNewsinfo(newsinfo);
		int flag = newsinfo.getNews_id();
		Map<String,String> map = new HashMap<String, String>();
		if(flag!=0){
			map.put("result", "success");
			return map;
		}
		map.put("result", "failed");
		return map;
	}
}
