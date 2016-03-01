package com.news.model;

public class Newsinfo  {

	private int news_id;
	private String news_title;
	private String news_summary;
	private String news_content;
	private String createDate;
	private int author_id;
	private int topic_id;
	private Topic topic;
	private Manager manager;

	public Newsinfo() {
	}

	public Newsinfo(int news_id, String news_title, String news_summary, String news_content, String createdate,
			int author_id, int topic_id) {
		super();
		this.news_id = news_id;
		this.news_title = news_title;
		this.news_summary = news_summary;
		this.news_content = news_content;
		this.createDate = createdate;
		this.author_id = author_id;
		this.topic_id = topic_id;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public int getNews_id() {
		return news_id;
	}

	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}

	public String getNews_title() {
		return news_title;
	}

	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}

	public String getNews_summary() {
		return news_summary;
	}

	public void setNews_summary(String news_summary) {
		this.news_summary = news_summary;
	}

	public String getNews_content() {
		return news_content;
	}

	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}

	

	public String getCreatedate() {
		return createDate;
	}

	public void setCreatedate(String createdate) {
		this.createDate = createdate;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	@Override
	public String toString() {
		return "Newsinfo [news_id=" + news_id + ", news_title=" + news_title + ", news_summary=" + news_summary
				+ ", news_content=" + news_content + ", createdate=" + createDate + ", author_id=" + author_id
				+ ", topic_id=" + topic_id + ", topic=" + topic + ", manager=" + manager + "]";
	}

}
