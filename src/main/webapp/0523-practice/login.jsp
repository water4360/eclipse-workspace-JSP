<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[1]�α��� �� �̿����ּ���</title>
</head>
<body>
	<%
	//�α��λ��� ���� Ȯ��
	boolean isLoggedIn = (session.getAttribute("id") != null);

	if (isLoggedIn) {
		response.sendRedirect("main.jsp");
	}
	%>
	<h2>ȸ�� �α���</h2>
	<form method="post" action="./loginProcess.jsp">
		<input type="text" name="id" placeholder="ID�� �Է��ϼ���" required><br>
		<input type="password" name="pw" placeholder="PW�� �Է��ϼ���" required><br>
		<br> <input type="submit" value="�α���">
	</form>

</body>
</html>