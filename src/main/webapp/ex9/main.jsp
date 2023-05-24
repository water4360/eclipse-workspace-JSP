<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("name", "hokim");
%>
<jsp:include page="include.jsp" flush="true">
<!-- %꺼랑 비교용. 이제 jsp tag를 쓰면 %안쓰고 사용가능할듯!? -->
<jsp:param name="data" value="hello"/>
</jsp:include>

</body>
</html>