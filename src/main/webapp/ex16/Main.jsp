<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="my" uri="http://myTag.com" %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 얘가 작동하게 하려면 SimpleTag.java에 내용을 넣어줘야함. -->
<my:simple></my:simple>
<tf:Attr count="3">
world<br>
</tf:Attr>
</body>
</html>