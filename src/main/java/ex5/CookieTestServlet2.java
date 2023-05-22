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
	//�⺻������
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
		//�Է�, ���, ���ڵ�, ���ڵ� ���ڼ� �����ϴ� �κ�
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html;charset=EUC-KR");
		
		//������� HTML ���� �ϳ� �����ֱ� ���ؼ� out �ν��Ͻ� ����.
		//response�� ���� ������ ���� �������� �ǹ��ϴ� ��.
		PrintWriter out = response.getWriter();

		//��û���� �������κ��� ��Ű ��������
		Cookie[] cookies = request.getCookies();

		// �̷��� �ϸ� �� ������ ����...??
//		for(int i = 0; cookies != null && i < cookies.length; i++) {
		
		//������ �ɶ� ��Ű�� �ִ��� Ȯ���ϰ�, ������?
		if (cookies != null) {
			//����� �Ϸ�
			for (Cookie cookie : cookies) {
				out.println("cookie : " + cookie.getName() + " : " + cookie.getValue() + "<br/>");
			}
		}

		// �߿��� �κ��̾�~~! ���⼭ post�� �ϸ� �ؿ� doPost���� �ް���???? �Ƹ���...???
		// �׼ǿ��� �ش�Ǵ� �������� �־������.
		// name�� value �Է¹޴� html form ����.
		//form �����, � Ÿ��? post Ÿ������ ����!
		//�׷��� �� �㿣 doGet�� �ٽ� ����Ǵ°� �ƴ϶� doPost�� ����Ǵ� ��.
		out.println("<form method='post' action='CookieTestServlet2'>");
		out.println("name<input type='text' name='name'/>");
		out.println("value<input type='text' name='value'/>");
		out.println("<input type='submit'/>"); // ����� ��ư
		out.println("</form>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//form���� Post�� ��û�� ����
		//���� doGet request���� ���� name�� value�� �޾ƿ��� �̴ϴ�
		String name = request.getParameter("name");
		String value = request.getParameter("value");

		//�³׸� �ٽ� ��Ű�� ����.
		Cookie c = new Cookie(name, value);
		response.addCookie(c);
		
		//����Ȱ� �˷��� ���� doGet���� �����̷��� ���Ѻ��� ��~
		response.sendRedirect("CookieTestServlet2");
	}

}
