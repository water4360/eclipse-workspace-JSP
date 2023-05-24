package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();

		PrintWriter out = response.getWriter();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (!cookie.getName().equals("count")) {
					String decodedValue = URLDecoder.decode(cookie.getValue(), "UTF-8");
					
					out.println("<h3>" + decodedValue + "</h3>");
//					out.println("num1 : "+cookie.getName() + " num2 :" + cookie.getValue()+"<br>");
				}
			}
		}
		
		
		out.println("<form method='post' action='CalculatorServlet'>");
		out.println("<input type='number' name='num1' placeholder='num1' required />");
		out.println("<select name='operator'>");
		out.println("<option value='+'>+</option>");
		out.println("<option value='-'>-</option>");
		out.println("<option value='*'>*</option>");
		out.println("<option value='/'>/</option>");
		out.println("</select>");
		out.println("<input type='number' name='num2' placeholder='num2' required />");
		out.println("<input type='submit' value='계산하기'/>"); // 제출용 버튼
		out.println("</form>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operator = request.getParameter("operator");

		double result = 0;
		
//		response.getWriter().printf("<h1>결과: %f</h1>", result);
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / (float)num2;
			break;
		}
		
//		if (result - (int)result == 0) {
//		    response.getWriter().printf("<h1>결과: %d</h1>", (int)result);
//		    System.out.println("처리전 : " + result);
//		    result = (int)result;
//		    System.out.println("처리후 : " + result);
//		    System.out.println("int 씌움 : " + (int)result);
//		    
//		} else {
//		    response.getWriter().printf("<h1>결과: %.3f</h1>", result);
//		}

		
		int cnt = 0;
		
		Cookie[] cookies = request.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			if (cookies[i].getName().equals("count")) {
				cnt = Integer.parseInt(cookies[i].getValue());
				break;
			}
		}
		
		//쿠키에 출력되는 값.
		String value = num1 + " " + operator + " " + num2 + " = " + result;
		System.out.println("if 거친 value : " + value);
		String encodedValue = URLEncoder.encode(value, "UTF-8");
		Cookie cookie = new Cookie(cnt++ + "", encodedValue);
		Cookie cntCookie = new Cookie("count", cnt + "");
		
		response.addCookie(cookie);
		response.addCookie(cntCookie);
		response.sendRedirect("CalculatorServlet");

	}
}
