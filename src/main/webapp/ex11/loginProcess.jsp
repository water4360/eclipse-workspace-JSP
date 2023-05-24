<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="login" class="ex10.LoginBean" />
	<jsp:setProperty name="login" property="id" />
	<jsp:setProperty name="login" property="pw" />

	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if (login.dbCheck()) {
		Cookie idCookie = new Cookie("id", id);
		Cookie passwordCookie = new Cookie("pw", pw);

		session.setAttribute("id", id);
		session.setAttribute("pw", pw);

		idCookie.setMaxAge(3600);
		passwordCookie.setMaxAge(3600);

		response.addCookie(idCookie);
		response.addCookie(passwordCookie);

		response.sendRedirect("mainPage.jsp");
	%>
	<jsp:getProperty property="id" name="login" />
	님이 로그인하셨습니다^^
	<%
	} else {
	%>
	<jsp:forward page="error.jsp" />
	<%
	}
	%>
</body>
</html>
