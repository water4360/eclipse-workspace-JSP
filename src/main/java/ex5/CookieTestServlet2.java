package ex5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTestServlet2
 */
@WebServlet("/CookieTestServlet2")
public class CookieTestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	//기본생성자
	public CookieTestServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//입력, 출력, 인코딩, 디코딩 문자셋 설정하는 부분
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html;charset=EUC-KR");
		
		//출력으로 HTML 파일 하나 보내주기 위해서 out 인스턴스 생성.
		//response가 지금 응답을 받을 브라우저를 의미하는 것.
		PrintWriter out = response.getWriter();

		//요청들어온 브라우저로부터 쿠키 가져오기
		Cookie[] cookies = request.getCookies();

		// 이렇게 하면 왜 에러가 나지...??
//		for(int i = 0; cookies != null && i < cookies.length; i++) {
		
		//시작이 될때 쿠키가 있는지 확인하고, 있으면?
		if (cookies != null) {
			//출력을 하렴
			for (Cookie cookie : cookies) {
				out.println("cookie : " + cookie.getName() + " : " + cookie.getValue() + "<br/>");
			}
		}

		// 중요한 부분이야~~! 여기서 post로 하면 밑에 doPost에서 받겠지???? 아마도...???
		// 액션에는 해당되는 서블릿명을 넣어줘야함.
		// name과 value 입력받는 html form 생성.
		//form 제출시, 어떤 타입? post 타입으로 제출!
		//그래서 그 담엔 doGet이 다시 실행되는게 아니라 doPost가 실행되는 것.
		out.println("<form method='post' action='CookieTestServlet2'>");
		out.println("name<input type='text' name='name'/>");
		out.println("value<input type='text' name='value'/>");
		out.println("<input type='submit'/>"); // 제출용 버튼
		out.println("</form>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//form에서 Post로 요청이 오면
		//위에 doGet request에서 보낸 name과 value를 받아오는 겁니다
		String name = request.getParameter("name");
		String value = request.getParameter("value");

		//걔네를 다시 쿠키로 저장.
		Cookie c = new Cookie(name, value);
		response.addCookie(c);
		
		//저장된거 알려고 서블릿 doGet으로 리다이렉션 시켜보는 거~
		response.sendRedirect("CookieTestServlet2");
	}

}
