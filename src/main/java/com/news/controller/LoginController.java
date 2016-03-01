package com.news.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.news.model.Manager;
import com.news.service.ManagerService;
import com.news.service.NewsinfoService;

@Controller
public class LoginController {
	@Autowired
	private ManagerService managerService;
	@Autowired
	private NewsinfoService newsinfoService;

	@RequestMapping(value = "/Login")
	public String Login() {
		return "Login";
	}

	@RequestMapping(value = "/DoLogin")
	public String DoLogin(HttpSession session, @RequestParam("account") String account,
			@RequestParam("password") String password) {
		Manager manager = new Manager();
		manager.setAccount(account);
		manager.setPassword(password);
		Manager manager2 = managerService.getPwdByAccount(account);
		boolean result = managerService.Check(manager, manager2);
		if (result) {
			session.setAttribute("managerAccount", manager2.getAccount());
			session.setAttribute("managerId", manager2.getManager_id());
		} else {
			session.setAttribute("managerAccount", "");
		}

		return "managerHome";
	}

	@RequestMapping(value = "/ToAddNews")
	public String ToAddNews() {
		return "AddNews";
	}
}
