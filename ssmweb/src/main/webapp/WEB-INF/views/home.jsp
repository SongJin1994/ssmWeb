<%--
  Created by IntelliJ IDEA.
  User: sj124
  Date: 2016/8/31
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'MyJsp.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="resource/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="/resource/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="/resource/js/bootstrap.js"></script>
</head>

<body>
welcome to spitter!<br>
<a href="login/qparam?id=2&name=songjin">处理查询参数</a>
<span style="color: red"><c:out value="${id}"></c:out>
                            <c:out value="${name}"/>
</span><br>
<a href="login/123">处理路径参数</a>
<span style="color: darkblue"><c:out value="${pId}"></c:out></span>
<h1>表单提交测试</h1>
<form action="" method="post">
    id: <input type="text" name="id"><br/>
    name:<input type="text" name="name"><br/>
    age:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
    <h1>Servlet测试</h1>
    <a href="toIndex?id=1&name=song&age=22">servlet</a>
<h1>上传文件测试</h1>
<form action="upload" method="post" enctype="multipart/form-data">
    <label>请选择文件：</label>
    <input type="file" name="upfile" >
    <input type="submit">
</form>
<h1>文件下载</h1>
<a href="download">下载链接</a>
<h1>Mybatis测试</h1>
<a href="classmanager/toclasslist">整合Mybatis测试</a>

</body>
</html>
