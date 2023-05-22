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
 * Servlet implementation class CookieTestServlet
 */
@WebServlet("/CookieTestServlet")
public class CookieTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnt = 0;
//		쿠키는 이미 톰캣에서 제공하는게 있음 
		Cookie[] cookies = request.getCookies();
		
//		만약 한번도 접속하지 않았다면 쿠키가 생성되지 않아 null일테니 조건을 추가하는 것.
//		외부에서 가져올 때는 반드시 null 체크를 해줘야 함
		for(int i=0; cookies!=null && i<cookies.length; i++) {
			cnt = Integer.parseInt(cookies[i].getValue()); //값 자체는 스트링이라서.\
			break;
		}
		//이번에 저장한 횟수 + 기존저장횟수 해야 되기때문에 1회 늘려줘~
		cnt++;
		
		//count, cnt + 이부분 ???
		Cookie c = new Cookie("count", cnt + "");
		response.addCookie(c);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>방문 횟수 : " + cnt + "</h1>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
