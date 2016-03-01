package com.news.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.news.dao.TopicMapper;
import com.news.model.Newsinfo;
import com.news.model.Page;
import com.news.model.Topic;
import com.news.service.NewsinfoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private NewsinfoService newsinfoService;
	@Autowired
	private TopicMapper topicMapper;
	@RequestMapping(value="/")
	public String HomePage(HttpServletRequest request,HttpServletResponse response,HttpSession session){
	//List<Topic> topicList = topicMapper.getTopicList();
	//session.setAttribute("topicList", topicList);
	List<Newsinfo> newsinfoList = newsinfoService.getNewsinfoListByPageNo(1, 5);
	session.setAttribute("newsinfoList", newsinfoList);
	Page page = new Page();
	if(session.getAttribute("page")==null){
		session.setAttribute("page", page);
	}
	page.setCurPage(1);
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//System.out.println(newsinfoService.getNewsTotalCount());
		//System.out.println(newsinfoService.getNewsinfoListByPageNo(0, 3));
		//System.out.println(newsinfoService.getNewsinfoListByTypeAndpageNo(0, 1, 2));
		//System.out.println(newsinfoService.getNewsinfoListByNewsTitle("微软", 0, 3));
		//System.out.println(newsinfoService.getNewsTotalCountByType(1));
		//System.out.println(newsinfoService.getNewsTotalCountByVague("微软"));
		return "home";
	}
	*/
	
}
