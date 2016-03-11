package com.news.utils;

public class URLSplit {
	/**
	 * 得到删除前的页面的URL
	 * @param url
	 * @return (string) 删除前页面的URL
	 */
	public static String SplitDeleteNewsURL(String url){
		String[] s = url.split("/");
		String result = s[s.length-1];
		System.out.println("-----utils----");
		System.out.println(result);
		result=result.substring(0, (result.length()-5));
		System.out.println(result);
		return result;
	}
}
