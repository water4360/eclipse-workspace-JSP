<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[2�ܰ�]Beans�� ���� �α���������</title>
</head>
<body>
<!-- ������Ʈ ã�Ƽ� ����, ppt8�� ���� -->
<!-- Ŭ�������� �� ������+�α�+��. ��ҹ��� �����Ƿ� ���� -->
<jsp:useBean id="login" class="ex10.LoginBean"/>
<jsp:setProperty name="login" property="id"/>
<jsp:setProperty name="login" property="pw"/>
<%
if(login.dbCheck()) {
%>
<jsp:getProperty property="id" name="login"/> ���� �α����ϼ̽��ϴ�^^
<%
} else {
%>
<jsp:forward page="login.html"/>
<%
}
%>
</body>
</html>