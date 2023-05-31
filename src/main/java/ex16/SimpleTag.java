package ex16;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTag extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		//얘를 가져오는 이유는 뭔가 확인을 해야하기 때문. 가져와서 뿌려줘야 하기때문.
		PageContext pageContext = (PageContext)getJspContext();
		JspWriter out = pageContext.getOut();
		for(var i=0; i<5; i++) {
			out.println("<h1>Hello</h1>");
		}
	}
}
