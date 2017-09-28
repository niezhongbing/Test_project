<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head lang="en">  
    <meta charset="UTF-8" />
    <title>统一异常处理</title>
</head>  
<body>  
    <h1>Error Handler1</h1>
  	错误message：<div th:text="">${errorinfo.message}</div>
	错误data:<div th:text="">${errorinfo.data}</div>
	错误Code:<div th:text="">${errorinfo.code}</div>
	错误发生的路径：<div th:text="">${errorinfo.url}</div>
</body>  
</html>  