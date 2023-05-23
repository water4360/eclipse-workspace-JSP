<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[5]로그아웃 완료!</title>
</head>
<body>
	<%
	// 세션 id속성 제거, login 페이지로 보내기
	session.removeAttribute("id");
	%>
	<h3>안녕히 가세요!</h3>
	<form method="post" action="login.jsp">
		<input type="submit" value="다시 로그인하기">
	</form>
</body>
</html>