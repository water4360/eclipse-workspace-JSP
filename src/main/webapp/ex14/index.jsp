<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var = "product" value="<b>Apple Iphone</b>"/>
<c:set var = "intArr" value="${1,2,3,4,5}" />
<!-- ��׸� ���� ����ٰž�. �Ȱ��� for���� �� ����. -->
<c:forEach var="num" varStatus="i" items="${intArr}" >


${i.index} : ${num} <br>

</c:forEach>


</body>
</html>