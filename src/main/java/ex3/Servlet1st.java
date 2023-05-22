package ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1st
 */
@WebServlet("/Servlet1st")
public class Servlet1st extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1st() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1> I am 1st Servlet </h1>");
		
		//1번 direction은 페이지 이동!
		//병주한테 시켰더니 지현이가 들고옴
//		response.sendRedirect("Servlet2nd"); //뒤에 붙는건 클래스명!
		
		//2번 forwarding는 주소는 그대로, 내용만 자기것처럼.
		//병주한테 시켰더니 병주가 지현이한테 시켜서 자기가 교수님한테 갖다줌ㅋㅋㅋ 
//		RequestDispatcher rd = request.getRequestDispatcher("Servlet2nd");
//		rd.forward(request, response);
		
		//3번 including은 1 + 2
		//병주한테 시켰더니 병주가 지현이를 데리고 둘이 나란히 갖고옴.
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2nd");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
