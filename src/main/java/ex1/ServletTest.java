package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR"); //�ѱ������Ǵ� EUC-KRŸ������ �ؽ�Ʈ ���ڵ� ����~
		response.setContentType("text/html;charset=EUC-KR"); //text�� �� htmlŸ���� ������.
		PrintWriter out = response.getWriter(); //PrintWriter��� ��ü�� response���� �����ðǵ�.
		out.println("<html>"); //html�����Ŵϱ� ���ְ�
		out.println("<head>");
		out.println("<title>Servlet Test</title>");
		out.println("<body>");
		out.println("<h1>body : Servlet Hello</h1");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
