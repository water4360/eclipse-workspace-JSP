<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
Incldue JSP FILE...
<br>
<!-- name과 data에서 넘어온 값을 찍어준 것-->
name : <%= request.getAttribute("name") %><br>
data : <%= request.getParameter("data") %><br>
</center>
</body>
</html>