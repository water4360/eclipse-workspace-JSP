<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[실습2단계]Beans로 만든 로긴</title>
</head>
<body>
<jsp:useBean id="soobLogin" class="practice0524.LoginBean"/>
<jsp:setProperty name="soobLogin" property="id"/>
<jsp:setProperty name="soobLogin" property="pw"/>




<%-- <%
if(soobLogin.isValidUserInfo("id", "pw")) {
%>
<jsp:getProperty property="id" name="soobLogin"/> 님이 로그인하셨습니다^^
<%
} else {
%>
<jsp:forward page="login.html"/>
<%
}
%> --%>
</body>
</html>