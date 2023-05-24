<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var = "product" value="<b>Apple Iphone</b>"/>
<c:set var = "intArr" value="${1,2,3,4,5}" />
<!-- 얘네를 전부 찍어줄거야. 똑같이 for문을 쓸 것임. -->
<c:forEach var="num" varStatus="i" items="${intArr}" >


${i.index} : ${num} <br>

</c:forEach>


</body>
</html>