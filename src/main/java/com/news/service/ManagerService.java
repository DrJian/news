package com.news.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.news.model.Manager;
@Service("managerService")
public interface ManagerService {
	//根据用户所给的account在数据库中查询对应的密码以及用户名，并检查密码是否正确，
	public Manager getPwdByAccount(String account);
	public boolean Check(Manager m1,Manager m2);
}
