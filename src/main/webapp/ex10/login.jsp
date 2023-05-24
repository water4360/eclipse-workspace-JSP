<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[2단계]Beans로 만든 로그인페이지</title>
</head>
<body>
<!-- 오브젝트 찾아서 쓰기, ppt8쪽 참고 -->
<!-- 클래스명은 걍 폴더명+로긴+빈. 대소문자 가리므로 주의 -->
<jsp:useBean id="login" class="ex10.LoginBean"/>
<jsp:setProperty name="login" property="id"/>
<jsp:setProperty name="login" property="pw"/>
<%
if(login.dbCheck()) {
%>
<jsp:getProperty property="id" name="login"/> 님이 로그인하셨습니다^^
<%
} else {
%>
<jsp:forward page="login.html"/>
<%
}
%>
</body>
</html>