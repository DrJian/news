package com.news.model;

import java.util.Set;

public class Topic {
	private int topic_id;
	private String topic_name;
	private Set<Newsinfo> newsinfos;
	public Topic(){}
	public Topic(String topic_name) {
		super();
		this.topic_name = topic_name;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}
	public Set<Newsinfo> getNewsinfos() {
		return newsinfos;
	}
	public void setNewsinfos(Set<Newsinfo> newsinfos) {
		this.newsinfos = newsinfos;
	}
	@Override
	public String toString() {
		return "Topic [topic_id=" + topic_id + ", topic_name=" + topic_name + ", newsinfos=" + newsinfos + "]";
	}
	
}	
