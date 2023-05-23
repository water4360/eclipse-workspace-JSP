<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP로 이동한 로그인</title>
</head>
<body>

<%
String id = request.getParameter("id");
// request에 셋을 하는거고.
request.setAttribute("id", id);
// 세션에 셋을 하는거.
session.setAttribute("id", id);
// 어플리케이션에 셋
application.setAttribute("id", id);
%>
<h3><%= id %>로 로그인 하였습니다. <br></h3>
<a href="./twopage.jsp">두번째 페이지로</a>

</body>
</html>