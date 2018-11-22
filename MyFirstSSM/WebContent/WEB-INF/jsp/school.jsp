<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="school/saveSchool" method="post">
	学校名：<input type="text" name="schoolname"><br>
	学校地址：<input name="schooladdress"><br>
	建校时间：<input type="date" name="schoolcreatetime"><br>
	<input type="submit" value="提交">
	
	</form>
</body>
</html>