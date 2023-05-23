package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	// ID와 비밀번호가 저장된 텍스트 파일 경로
	private static final String FILE_PATH = "C:/Users/User/eclipse-workspace-JSP/example1/src/main/java/practice/memberlist.txt";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>LOGIN PAGE</h1>");

		out.println("<form method='get' action='/example1/login'>");
		out.println("<input type='text' name='id' placeholder='아이디를 입력하세요' required /> <br>");
		out.println("<input type='password' name='pw' placeholder='비밀번호를 입력하세요' required /> <br><br>");
		out.println("<input type='submit' value='로그인' />");

		// 사용자가 입력한 id, pw
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		//id, pw가 일치하면
		if (isCorrectIDPW(id, pw)) {
			System.out.println("id : "+id+" pw : "+pw);
			out.println("<h1>로그인 완료!</h1>");
		} else if (id==null && pw==null) {
			//id, pw가 빈칸이면 암것도 없이
			System.out.println("id : "+id+" pw : "+pw);
//			out.println("<h3>아이디와 비밀번호를 입력해주세요.</h3>");
		} else {
			System.out.println("id : "+id+" pw : "+pw);
			out.println("<h3>아이디 또는 비밀번호가 바르지 않습니다!</h3>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	private boolean isCorrectIDPW(String userId, String userPw) throws IOException {
		// br로 파일 읽어오기. FileReader로 파일 경로 지정
		BufferedReader br = new BufferedReader((new FileReader(FILE_PATH)));
		String info;

		while ((info = br.readLine()) != null) {
			System.out.println(info);
			String[] parts = info.split(",");
			String storedId = parts[0];
			String storedPw = parts[1];

			//입력받은 Id, Pw가 파일과 일치하면?
			if (storedId.equals(userId) && storedPw.equals(userPw)) {
				br.close();
				return true;
			}
		}
		br.close();
		return false;
	}
}
