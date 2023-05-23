package practice0523;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// 사용자 입력값 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
//		boolean isValid = isValidUserInfo(id, pw);
		
		switch(isValidUserInfo(id, pw)) {
		case 1 :
			//아디, 비번이 일치하는 경우
			//세션 생성
			HttpSession session = request.getSession();
			
			//사용자 아이디 저장
			session.setAttribute("id", id);
			response.sendRedirect(request.getContextPath() + "/0523-practice-split/main.jsp");
			break;
		case 2 :
			//아디는 있는데 비번이 일치하지 않는 경우
			response.sendRedirect(request.getContextPath() + "/0523-practice-split/error1.jsp");
			break;
		case 0 :
			//일치하는 회원정보가 없는 경우
			response.sendRedirect(request.getContextPath() + "/0523-practice-split/error2.jsp");
			break;
		}
		
		//유효한 아이디라면.
//		if(isValid) {
//			//세션 생성
//			HttpSession session = request.getSession();
//			
//			//사용자 아이디 저장
//			session.setAttribute("id", id);
//			response.sendRedirect(request.getContextPath() + "/0523-practice-split/main.jsp");
//			
//		} else {
//			//유효하지 않은 아이디는 error로 안내.
//			
//			out.println("<script>alert('비밀번호가 일치하지 않습니다.')</script>");
////			response.sendRedirect(request.getContextPath() + "/0523-practice-split/fail.jsp");
//
//		}
		
	}
	
	private int isValidUserInfo(String userId, String userPw) throws IOException {
		//비교용 데이터 경로가져오기
		//경로 다시 잘 살펴보기
		String filePath = "C:\\Users\\User\\eclipse-workspace-JSP\\example1\\src\\main\\webapp\\0523-practice-split\\userlist.txt";
		
		//버퍼리더 클래스와 파일리더로 데이터&경로 가져옴
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String info;
		
		while ((info = br.readLine()) != null) {
			System.out.println(info);
			String[] parts = info.split(",");
			String storedId = parts[0];
			String storedPw = parts[1];

			//입력받은 Id, Pw가 파일과 일치하면?
			if (storedId.equals(userId) && storedPw.equals(userPw)) {
				br.close();
				return 1;
				
			// id는 맞는데 비밀번호가 일치하지 않으면?
			} else if(storedId.equals(userId) && (!storedPw.equals(userPw))) {
				br.close();
				return 2;
			}
		}
		
		br.close();
		return 0;
	}

}
