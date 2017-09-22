<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<title>表格操作 - layui</title>

<link rel="stylesheet" href="/layerui_table/layer/css/layui.css">

<style>
body{padding: 20px;}
</style>
</head>
<body>

<table id="demo" class="layui-table" lay-data="{height:315, url:'/layerui_table/json/table/demo3.json?page=1&limit=10', page:true, id:'test'}" lay-filter="test">
  <thead>
    <tr>
      <th lay-data="{field:'id', width:80, sort: true}">ID</th>
      <th lay-data="{field:'username', width:80}">用户名</th>
      <th lay-data="{field:'sex', width:80, sort: true}">性别</th>
      <th lay-data="{field:'city', width:80}">城市</th>
      <th lay-data="{field:'sign', width:177}">签名</th>
      <th lay-data="{field:'experience', width:80, sort: true}">积分</th>
      <th lay-data="{field:'score', width:80, sort: true}">评分</th>
      <th lay-data="{field:'classify', width:80}">职业</th>
      <th lay-data="{field:'wealth', width:135, sort: true}">财富</th>
    </tr>
  </thead>
</table>
 
<script src="/layerui_table/layer/layui.js"></script>
<script>
layui.use('table', function(){
  var table = layui.table;
});
</script>
</body>
</html>