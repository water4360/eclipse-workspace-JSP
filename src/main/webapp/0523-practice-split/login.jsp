<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[2-1]로그인 페이지</title>
<script>
	function validForm() {
		const id = document.getElementById("id").value;
		const pw = document.getElementById("pw").value;
		
		//id가 비어있으면
		if(id.trim() === '') {
			alert("ID를 입력해주세요");
			return false;
		} else if(pw.trim() === ''){
			alert("PW를 입력해주세요");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<%
	//기존 로그인 아이디정보 가져오기
	String currentId = (String) session.getAttribute("id");

	//로그인 정보가 있는 경우 메인으로
	if (currentId != null) {
		response.sendRedirect("main.jsp");
	} else {
		//정보가 있다면 
		String loginUrl = request.getContextPath() + "/LoginServlet";
	%>
	<form method="post" action='/example1/LoginServlet' onsubmit="return validForm()">
	<h3>안녕하세요! 회원이라면 로그인하시고 아니라면 나가주세요^^</h3>
	<label for="id">ID </label>
	<input type='text' name='id' placeholder='아이디를 입력하세요' required/> <br>
	<label for="pw">PW</label>
	<input type='password' name='pw' placeholder='비밀번호를 입력하세요' required/> <br><br>
	<input type='submit' value='로그인' />
	</form>

	<%
	}
	%>
</body>
</html>