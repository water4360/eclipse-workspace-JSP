package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest
 */
@WebServlet("/RequestTest")
public class RequestTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod(); //쓰고 있는 메소드 얻어오기
		String query = request.getQueryString(); //얘가 쿼리 다 받아오기.
		String uri = request.getRequestURI();
		String url = request.getRequestURL().toString(); //그냥getRequestURL은 스트링버퍼라서.
		
		PrintWriter out = response.getWriter(); //내가 서버임,.
		out.println("<h1>Request Test</h1>"); //기본적으로 html타입으로 생성되니까 <html> 이런거 안써줘도 됩니다
		out.println("method ="+ method + "<br/>");
		out.println("query ="+query+"<br/>");
		out.println("uri ="+uri+"<br/>");
		out.println("url ="+url+"<br/>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
