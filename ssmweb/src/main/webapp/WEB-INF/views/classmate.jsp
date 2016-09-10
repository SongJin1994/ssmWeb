<%--
  Created by IntelliJ IDEA.
  User: sj124
  Date: 2016/9/10
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>Mybatis整合测试</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="resource/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="/resource/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="/resource/js/bootstrap.js"></script>
    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
test
<%--<button id="showAll" onclick="showAll()">显示所有学生</button>--%>
<%--<input type="button" onclick="showAll()" value="显示所有学生">--%>
<a href="classmanager/showall">显示所有</a>
<%--<div id="classmatelist">
    <jsp:include page="classmatelist.jsp"/>
</div>--%>
</body>
<script type="text/javascript" language="JavaScript">
    showAll = function(){
        $.ajax({
                    url: "classmanager/showall",
                    type: 'post',
                    success :function(dates){
                        $('#classmatelist').html(dates);
                    }
                }
        )
    };
</script>
</html>
