<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%@ page session="false"%>

<!-- 세가지 용도가 다르니까 주의해서 쓸 것 -->

<!-- 자바 속성 -->
<%!Date date;
	String name;
	String email;%>

<%!public int getLength() {
	int len = email.length();
	return len;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>230523 JSP 실습</title>
</head>
<body>
	<h1>스크립트 테스트</h1>
	<%
	date = new Date();
	%>
	현재 날짜 :
	<%=date.toLocaleString()%>
</body>
</html>