<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 만약 include가 없으면 아래에서 에러를 발생시켰을 것 -->
	<%@ include file="head.jsp"%>
	<br>
	<%
		name = request.getParameter("name");
		email = request.getParameter("email");
	%>
	
name : <%= name %><br>
email : <%= email %><br>
<%=date.getDate() %>일 입니다.<br>
이 배열의 길이는 <%=getLength() %>입니다.

</body>
</html>