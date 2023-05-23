<%@page import="java.io.IOException"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FileReader"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 1. 넘겨받은 id, pw
String id = request.getParameter("id");
String pw = request.getParameter("pw");

//확인용
System.out.println("id : " + id);
System.out.println("pw : " + pw);

// 4. userlist.txt 파일에서 사용자 정보 확인
//     String userListPath = application.getRealPath("/WEB-INF/0523-practice/userlist.txt"); // userlist.txt 파일의 경로
//     System.out.println(userListPath);

// new FileReader("C:/Users/User/eclipse-workspace-JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/example1/WEB-INF/userlist.txt");

BufferedReader br = null;

String storedId = null;
String storedPw = null;

try {
	//         File userListFile = new File(userListPath);
	//         br = new BufferedReader(new FileReader(userListFile));
	//         br = new BufferedReader((new FileReader("/WEB-INF/0523-practice/userlist.txt")));
	//br = new BufferedReader(new FileReader(application.getRealPath("C:/Users/User/eclipse-workspace-JSP/example1/src/main/webapp/0523-practice")));
	
	//제대로 된 경로는 아님, 추후 다시 확인할 것.
	br = new BufferedReader(new FileReader(
// 			application.getRealPath("C:/Users/User/eclipse-workspace-JSP/example1/src/main/webapp/0523-practice/userlist.txt")));
	"C:/Users/User/eclipse-workspace-JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/example1/WEB-INF/userlist.txt"));
	
	String line;

	while ((line = br.readLine()) != null) {
		System.out.println("line : " + line);
		String[] userData = line.split(","); // 예시: 사용자 정보는 쉼표(,)로 구분되어 있다고 가정
		storedId = userData[0].trim();
		storedPw = userData[1].trim();
		System.out.println("storedId : " + storedId + " storedPw : " + storedPw);
		
		
		// 등록된 사용자면 메인 서비스 페이지로 이동
		if (id.equals(storedId) && pw.equals(storedPw)) {
		session.setAttribute("id", id);
		response.sendRedirect("main.jsp");
		} else {
		// 등록되지 않은 사용자면 error 페이지로 이동
		response.sendRedirect("fail.jsp");
		}
	}
} catch (IOException e) {
	// 파일 읽기 오류 처리
	e.printStackTrace();
	//         response.sendRedirect("error.jsp");
} finally {
	// 리소스 해제
	if (br != null) {
		try {
	br.close();
		} catch (IOException e) {
	e.printStackTrace();
		}
	}
}
%>
