package com.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.ManagerMapper;
import com.news.model.Manager;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public Manager getPwdByAccount(String account) {
		// TODO Auto-generated method stub
		Manager manager = managerMapper.getPwdByAccount(account);
		return manager;
	}

	public boolean Check(Manager m1, Manager m2) {
		if (m1.getAccount().equals(m2.getAccount()) && m1.getPassword().equals(m2.getPassword())) {
			return true;
		}
		return false;
	}
}
