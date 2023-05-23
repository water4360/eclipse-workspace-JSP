<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[1]로그인 후 이용해주세요</title>
</head>
<body>
	<%
	//로그인상태 먼저 확인
	boolean isLoggedIn = (session.getAttribute("id") != null);

	if (isLoggedIn) {
		response.sendRedirect("main.jsp");
	}
	%>
	<h2>회원 로그인</h2>
	<form method="post" action="./loginProcess.jsp">
		<input type="text" name="id" placeholder="ID를 입력하세요" required><br>
		<input type="password" name="pw" placeholder="PW를 입력하세요" required><br>
		<br> <input type="submit" value="로그인">
	</form>

</body>
</html>