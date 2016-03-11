<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%
	String requestURI = request.getRequestURI();
	String contextPath = request.getContextPath();
	String url = requestURI.substring(contextPath.length());
%>
<html>
<head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/news/resources/css/home_bg_img.css" rel="stylesheet">

<!-- 可选的Bootstrap主题文件（一般不使用） -->
<!--  <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css"></script>-->

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js">
	
</script>
<script src="/news/resources/js/transfer.js"></script>
<title>Welcome!</title>
</head>
<body>
	<div class="container">

		<!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
		<div class="masthead">
			<h3 class="text-muted page-header">
				<p>Welcome &nbsp Back &nbsp ${managerAccount }</p>
				Welcome to CoolJ Website!我们致力于您身边的新闻
			</h3>
			<nav>
			<ul class="nav nav-justified">
				<li class="active"><a href="#">首页</a></li>
				<li><a href="#">网站指南</a></li>
				<li><a href="#">网站源代码</a></li>
				<li><a href="#">关于我们</a></li>
			</ul>
			</nav>
		</div>

		<!-- background image -->
		<img src="/news/resources/img/bg_img2.jpg"
			style="height: 500px; width: 1100px">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-3">
				<h2>选择新闻类型</h2>
				<br />
				<address>
					<li><a href="selectedTopic?topic_id=1&pageNo=1">热点新闻</a></li> <br />
					<li><a href="selectedTopic?topic_id=2&pageNo=1">军事新闻</a></li> <br />
					<li><a href="selectedTopic?topic_id=3&pageNo=1">娱乐新闻</a></li> <br />
					<li><a href="selectedTopic?topic_id=4&pageNo=1">经济新闻</a></li> <br />
					<li><a href="selectedTopic?topic_id=5&pageNo=1">科技新闻</a></li> <br />
					<li><a href="selectedTopic?topic_id=6&pageNo=1">社会新闻</a></li> <br />
				</address>
			</div>
			<div class="col-md-6">
				<h2>每日新闻速递</h2>
				<br />
				<c:forEach items="${newsinfoList }" var="newsinfo">
					<div>
						<p>
							<a href="selectedNews?news_id=${newsinfo.news_id }"
								class="news_title_color">${newsinfo.news_title}</a>
						<p />
						<p class="text-muted">${newsinfo.news_summary }
							&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp <a
									href="DeleteNews?news_id=${newsinfo.news_id}"
									class="btn btn-primary btn-danger ">删除</a>
						</p>
					</div>
				</c:forEach>
				<br /> <a class="btn btn-primary" href="DefaultNewsList?topic_id=0"
					role="button">点击查看更多 &raquo;</a>
			</div>
			<div class="col-md-3">
				<h2>Operating</h2>
				<br /> <br /> <a class="btn btn-primary" role="button"
					href="ToAddNews" id="ToAddNews">添加一条新资讯 &raquo;</a>
				<!--  -->
				<!-- <br /> <br /> <a class="btn btn-primary" role="button"
					href="ToAddNews">添加一条新资讯 &raquo;</a></p> -->
			</div>
		</div>
		<footer class="bottom">
		<p>&copy;2016 CoolJ News Website</p>
		</footer>
	</div>

</body>
</html>
