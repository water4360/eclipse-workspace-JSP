<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[2]�α���ȸ�� ���� ����������</title>
</head>
<body>
	<h2>Welcome to main page</h2>
	<h3>�ȳ��ϼ���, <%= session.getAttribute("id")%>��!</h3>
	<form method="post" action="logout.jsp">
		������ ���� <input type="submit" name="logout" value="�α׾ƿ�">���ּ���.
	</form>
</body>
</html>