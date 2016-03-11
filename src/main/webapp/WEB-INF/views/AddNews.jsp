<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<!-- <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.js"></script> -->
<script src="/news/resources/js/jquery-2.2.0.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<!--  <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css"></script>-->


<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js">
	
</script>
<script src="/news/resources/js/AddNewsAjax.js">
	
</script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted page-header">Welcome to CoolJ
				Website!我们致力于您身边的新闻</h3>
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
		<img src="/news/resources/img/bg_img4.jpg"
			style="height: 600px; width: 1000px">
		<!-- 添加新闻界面 -->
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-9">
				<form class="form-horizontal" id="AddNewsForm">
					<div class="form-group">
						<label for="news_title" class="col-md-2 control-label">新闻标题</label>
						<div class="col-md-6	">
							<input type="text" name="news_title" class="form-control"
								id="news_title" placeholder="新闻标题">
						</div>
						<div class="col-md-4"></div>
					</div>
					<div class="form-group">
						<label for="news_summary" class="col-md-2 control-label">内容汇总</label>
						<div class="col-md-6">
							<input type="test" name="news_summary" class="form-control"
								id="news_summary" placeholder="新闻总结">
						</div>
						<div class="col-md-4"></div>
					</div>
					<div class="form-group">
						<label for="news_content" class="col-md-2 control-label">内容概要</label>
						<div class="col-md-10">
							<textarea type="text" style="height: 100px; width: 400px"
								name="news_content" class="form-control" id="news_content"
								placeholder="内容概要">
					</textarea>
						</div>
					</div>
					<div class="form-group">
						<label for="createdate" class="col-md-2 control-label">发表时间</label>
						<div class="col-md-3">
							<input type="text" class="form-control" id="createDate"
								name="createDate" placeholder="时间由系统自动生成" disabled="disabled">
						</div>
						<div class="col-md-7"></div>
					</div>
					<div class="form-group">
						<label for="author_id" class="col-md-2 control-label">发表人id</label>
						<div class="col-md-2">
							<input type="text" class="form-control" id="author_id"
								name="author_id" placeholder="由系统在后台自行处理" disabled="disabled">
						</div>
						<div class="col-md-8"></div>
					</div>
			
					<div class="form-group">
						<label for="topic_name" class="col-md-2 control-label">新闻类型</label>
						<div class="col-md-2">
							<select class="form-control" id="topic_name" name="topic_name">
								<option>热点新闻</option>
								<option>社会新闻</option>
								<option>科技新闻</option>
								<option>军事新闻</option>
								<option>经济新闻</option>
								<option>娱乐新闻</option>
							</select>
						</div>
						<div class="col-md-8"></div>
					</div>

					<div class="form-group">
						<div class="col-md-offset-2 col-md-10 ">
							<button type="submit" class="btn btn-default" id="submit1">提交</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>