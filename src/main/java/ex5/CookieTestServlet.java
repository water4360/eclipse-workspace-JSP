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
//		��Ű�� �̹� ��Ĺ���� �����ϴ°� ���� 
		Cookie[] cookies = request.getCookies();
		
//		���� �ѹ��� �������� �ʾҴٸ� ��Ű�� �������� �ʾ� null���״� ������ �߰��ϴ� ��.
//		�ܺο��� ������ ���� �ݵ�� null üũ�� ����� ��
		for(int i=0; cookies!=null && i<cookies.length; i++) {
			cnt = Integer.parseInt(cookies[i].getValue()); //�� ��ü�� ��Ʈ���̶�.\
			break;
		}
		//�̹��� ������ Ƚ�� + ��������Ƚ�� �ؾ� �Ǳ⶧���� 1ȸ �÷���~
		cnt++;
		
		//count, cnt + �̺κ� ???
		Cookie c = new Cookie("count", cnt + "");
		response.addCookie(c);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>�湮 Ƚ�� : " + cnt + "</h1>");
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
