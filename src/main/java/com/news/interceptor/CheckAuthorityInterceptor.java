package com.news.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.news.controller.LoginController;

public class CheckAuthorityInterceptor extends HandlerInterceptorAdapter {
	// 获取log对象
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		// 测试获取request地址
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestURI.substring(contextPath.length());
		System.out.println(requestURI);
		System.out.println(contextPath);
		System.out.println(url);
		HttpSession session = request.getSession();
		String account = (String) session.getAttribute("managerAccount");
		if (account == null || account.equals("")) {
			System.out.println("----");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
//			response.sendRedirect("/news/WEB-INF/views/Login.jsp");
		}
		System.out.println("---------2");
		// return true;
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
