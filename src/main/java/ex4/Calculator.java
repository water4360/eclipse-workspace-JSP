package ex4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>계산결과</h1>");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String symbol = request.getParameter("symbol");
		
		out.println("num1 : " + num1 + "<br>");
		out.println("num2 : " + num2 + "<br>");
		out.println("symbol : "+ symbol + "<br>");
		
		double result = 0; 
		
		switch(symbol) {
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
        	if(num1 != 0 && num2 != 0) {
        		result = (double) num1/num2;
        	} else {
        		out.println("0으로 나눌 수 없습니다");
        		break;
        	}
        	break;
        	default :
        		out.println("연산자를 선택해주세요");
		}
		if(result == (int)result) {
			out.println("결과 : " + (int)result + "<br>");
		} else {
			out.println("결과 : " + result + "<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
