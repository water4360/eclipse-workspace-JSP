<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>
<% 
    String id = (String) session.getAttribute("id");
    

    if (id != null) {
        response.sendRedirect("mainPage.jsp");
        return; 
    }
    %>
    
	<form method="post" action="./loginProcess.jsp">
		<input type="text" name="id" placeholder="ID"> <input
			type="password" name="pw" placeholder="PASSWORD"> <input
			type="submit" value="濡�洹몄��">
	</form>
</body>
</html>
  