<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[2]로그인회원 전용 메인페이지</title>
</head>
<body>
	<h2>Welcome to main page</h2>
	<h3>안녕하세요, <%= session.getAttribute("id")%>님!</h3>
	<form method="post" action="logout.jsp">
		보안을 위해 <input type="submit" name="logout" value="로그아웃">해주세요.
	</form>
</body>
</html>