<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- jstl이 있어야 아래 명령어를 실행가능    	 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 여기서의 c는 위에서 지정해놓은 prefix c!! out은 출력!! -->
<!-- c는 바꿀 수 있는데... 바꾸지마... 대부분 쓰는 공용어 같은 개념임^^ -->
<!-- coreTag에서 따온 c -->
<c:out value="hello world!!"/>
<!-- scope의 page는 톰캣의 사상...? 어쩔 수가 없다~~ -->
<c:set var="price" scope="page" value="1000"/>
${price}<br>

<c:if test = "${price > 500}">
<c:out value = "biggest!!"/>
</c:if>

<!-- 만약 price를 없애버리고 싶다? -->
<!-- 너무 많은 변수가 있을 때는 오버플로우가 발생하므로 쓰고 나서 지워주는게 필요 -->
<!-- 특히 쿠키,세션, 페이지컨텍스트는 괜찮은데, 어플리케이션 메모리는 계~~~속 남아있음  -->
<!-- 또, 세션의 경우에도 자동종료 걸어주는 이유는 혹 중간에 해커가 가로채면 그 세션정보를 악용할 수 있으므로. -->
<%-- <c:remove var="price"/> --%>

<c:choose>
	<c:when test="${price < 1000}">
		<c:out value="작다" />
	</c:when>
	<c:when test="${price > 1000}">
		<c:out value="크다" />
	</c:when>
	<c:otherwise>
		<c:out value="같다아" />
	</c:otherwise>
</c:choose>



</body>
</html>