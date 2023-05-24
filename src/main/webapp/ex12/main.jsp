<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL을 써보자</title>
</head>
<body>
<%
request.setAttribute("attr", "hello world!");
%>
예시1 <%=request.getAttribute("attr") %><br>

<!-- 이렇게 더 간단하게 가져오는 것도 가능! -->
예시2 ${requestScope["attr"] }<br>
예시3 ${requestScope.attr}<br>
<!-- 얘는 없으니까 안 찍히겠지 -->
예시4 ${requestScope.attr2}<br>


<!-- Map도 써보자 -->
<%
Map<String, String> map = new HashMap<>();
map.put("one", "hello");
map.put("two", "World");
pageContext.setAttribute("map", map);
%>
${map.get("one")},${map.get("two")}, ${map.get("one")} <br>

<!-- 어라 빨간줄인데도 실행이 되네 -->
<%-- ${(10*10) ne 100} <br> --%>

${pageContext.request.contextPath }<br>

</body>
</html>