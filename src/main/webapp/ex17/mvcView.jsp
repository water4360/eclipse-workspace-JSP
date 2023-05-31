<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- servlet에서 beans에 저장해둔 것, beans는 session에 login으로 저장되어있는 것 -->
<!-- 그걸 modelBeans에서,,,,,-->
<jsp:useBean id="login" class="ex17.ModelBeans" scope="session"></jsp:useBean>
<center>
<jsp:getProperty property="id" name="login"/>님 환영합니다!
</center>
</body>
</html>