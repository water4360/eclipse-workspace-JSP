<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- jstl�� �־�� �Ʒ� ��ɾ ���డ��    	 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ���⼭�� c�� ������ �����س��� prefix c!! out�� ���!! -->
<!-- c�� �ٲ� �� �ִµ�... �ٲ�����... ��κ� ���� ����� ���� ������^^ -->
<!-- coreTag���� ���� c -->
<c:out value="hello world!!"/>
<!-- scope�� page�� ��Ĺ�� ���...? ��¿ ���� ����~~ -->
<c:set var="price" scope="page" value="1000"/>
${price}<br>

<c:if test = "${price > 500}">
<c:out value = "biggest!!"/>
</c:if>

<!-- ���� price�� ���ֹ����� �ʹ�? -->
<!-- �ʹ� ���� ������ ���� ���� �����÷ο찡 �߻��ϹǷ� ���� ���� �����ִ°� �ʿ� -->
<!-- Ư�� ��Ű,����, ���������ؽ�Ʈ�� ��������, ���ø����̼� �޸𸮴� ��~~~�� ��������  -->
<!-- ��, ������ ��쿡�� �ڵ����� �ɾ��ִ� ������ Ȥ �߰��� ��Ŀ�� ����ä�� �� ���������� �ǿ��� �� �����Ƿ�. -->
<%-- <c:remove var="price"/> --%>

<c:choose>
	<c:when test="${price < 1000}">
		<c:out value="�۴�" />
	</c:when>
	<c:when test="${price > 1000}">
		<c:out value="ũ��" />
	</c:when>
	<c:otherwise>
		<c:out value="���پ�" />
	</c:otherwise>
</c:choose>



</body>
</html>