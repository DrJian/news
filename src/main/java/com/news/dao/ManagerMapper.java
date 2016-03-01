package com.news.dao;

import org.apache.ibatis.annotations.Param;

import com.news.model.Manager;

public interface ManagerMapper {
	//从数据库中查找给定用户名的对应密码和用户名，对密码的检查在Service层处理
	public Manager getPwdByAccount(@Param(value="account")String account);
}
