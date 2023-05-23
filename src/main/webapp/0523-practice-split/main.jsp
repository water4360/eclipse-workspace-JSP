<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[2-2]회원전용 페이지</title>

</head>
<body>
<%
	// action 파라미터 값에 따라
    String action = request.getParameter("action");

	// action이 null이 아니면서 logout 이라면
    if (action != null && action.equals("logout")) {
    	//세션 접속을 끊고, loginpage로 보냄.
        session.invalidate(); 
        response.sendRedirect("login.jsp");
    } else {
    	// 세션에 저장되어있는 로그인 ID값을 가져옴
        String storedId = (String)session.getAttribute("id"); 
    	
    	// 로그인 된 사용자일 경우 사용자의 ID정보와 로그아웃 버튼을 출력
        if (storedId != null) {
%>			
			<h2>Welcome to main page</h2>
			<h3>안녕하세요, <%= session.getAttribute("id")%>님!</h3>
			<form method="post" action="main.jsp?action=logout">
				보안을 위해 <input type="submit" name="logout" value="로그아웃">해주세요.
			</form>
<%
        } else {
        	// 로그인 상태가 아니라면 loginpage.jsp로 이동
            response.sendRedirect("login.jsp"); 
        }
    }
%>
</body>
</html>