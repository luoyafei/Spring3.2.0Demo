<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>input</title>
</head>
<body>
	<form action="user" method="post">
		用户名:<input type="text" name="username" placeholder="username" />
		密码:<input type="password" name="password" placeholder="password" />
		重复密码:<input type="password" name="repassword" placeholder="repassword" />
		<button type="submit">提交</button>
	</form>
</body>
</html>