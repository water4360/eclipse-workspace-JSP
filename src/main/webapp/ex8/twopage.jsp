<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ID�� ����Ǵ� ��� Ȯ��!</title>
</head>
<body>
	<%
	// request���� ���� �ϴ°Ű�.
	String requestID = (String)request.getAttribute("id");
	
	//���� �ѹ濡 ���� ����
	session.invalidate();
	//���� �ִ� Ȱ��ȭ�ð� ���ϱ�(���� �ڵ��α׾ƿ�ó��)
	session.setMaxInactiveInterval(30000);
	
	// ���ǿ��� ���� �ϴ°�.
	String sessionID = (String)session.getAttribute("id");
	// ���ø����̼ǿ��� ��
	String appID = (String)application.getAttribute("id");
	%>
request : <%= requestID %><br>
session : <%= sessionID %><br>
application : <%= appID %><br>
</body>
</html>