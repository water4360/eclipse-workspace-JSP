<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[�ǽ�2�ܰ�]Beans�� ���� �α�</title>
</head>
<body>
<jsp:useBean id="soobLogin" class="practice0524.LoginBean"/>
<jsp:setProperty name="soobLogin" property="id"/>
<jsp:setProperty name="soobLogin" property="pw"/>




<%-- <%
if(soobLogin.isValidUserInfo("id", "pw")) {
%>
<jsp:getProperty property="id" name="soobLogin"/> ���� �α����ϼ̽��ϴ�^^
<%
} else {
%>
<jsp:forward page="login.html"/>
<%
}
%> --%>
</body>
</html>