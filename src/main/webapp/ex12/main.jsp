<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL�� �Ẹ��</title>
</head>
<body>
<%
request.setAttribute("attr", "hello world!");
%>
����1 <%=request.getAttribute("attr") %><br>

<!-- �̷��� �� �����ϰ� �������� �͵� ����! -->
����2 ${requestScope["attr"] }<br>
����3 ${requestScope.attr}<br>
<!-- ��� �����ϱ� �� �������� -->
����4 ${requestScope.attr2}<br>


<!-- Map�� �Ẹ�� -->
<%
Map<String, String> map = new HashMap<>();
map.put("one", "hello");
map.put("two", "World");
pageContext.setAttribute("map", map);
%>
${map.get("one")},${map.get("two")}, ${map.get("one")} <br>

<!-- ��� �������ε��� ������ �ǳ� -->
<%-- ${(10*10) ne 100} <br> --%>

${pageContext.request.contextPath }<br>

</body>
</html>