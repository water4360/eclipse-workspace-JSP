<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP�� �̵��� �α���</title>
</head>
<body>

<%
String id = request.getParameter("id");
// request�� ���� �ϴ°Ű�.
request.setAttribute("id", id);
// ���ǿ� ���� �ϴ°�.
session.setAttribute("id", id);
// ���ø����̼ǿ� ��
application.setAttribute("id", id);
%>
<h3><%= id %>�� �α��� �Ͽ����ϴ�. <br></h3>
<a href="./twopage.jsp">�ι�° ��������</a>

</body>
</html>