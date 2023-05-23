<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ID가 저장되는 방식 확인!</title>
</head>
<body>
	<%
	// request에서 겟을 하는거고.
	String requestID = (String)request.getAttribute("id");
	
	//세션 한방에 접속 끊기
	session.invalidate();
	//세션 최대 활성화시간 정하기(은행 자동로그아웃처럼)
	session.setMaxInactiveInterval(30000);
	
	// 세션에서 겟을 하는거.
	String sessionID = (String)session.getAttribute("id");
	// 어플리케이션에서 겟
	String appID = (String)application.getAttribute("id");
	%>
request : <%= requestID %><br>
session : <%= sessionID %><br>
application : <%= appID %><br>
</body>
</html>