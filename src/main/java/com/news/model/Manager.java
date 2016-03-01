package com.news.model;

import java.util.Set;

public class Manager {
	private int manager_id;
	private String account;
	private String password;
	private Set<Newsinfo> newsinfos;
	public Set<Newsinfo> getNewsinfos() {
		return newsinfos;
	}
	public void setNewsinfos(Set<Newsinfo> newsinfos) {
		this.newsinfos = newsinfos;
	}
	public Manager(){}
	public Manager(String account, String password, String manager_name) {
		super();
		this.account = account;
		this.password = password;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", account=" + account + ", password=" + password
				+ ", manager_name=" +  "]";
	}
	
}
