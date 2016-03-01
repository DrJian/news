package com.news.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Jian
 * 对于时间的格式等处理
 */
public class TimeConverter {
	/**
	 * 获取当前时间，格式转化后返回
	 * @param null
	 * @return currentTime
	 * @throws ParseException
	 */
	public static String getTimeNow() throws ParseException{
		Date time = new Date(System.currentTimeMillis());
		//获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String current = sdf.format(time);
		return current;
	}
}
