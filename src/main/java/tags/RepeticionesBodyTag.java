package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import lombok.Data;
@Data

public class RepeticionesBodyTag extends BodyTagSupport {
	
	private int cantidad;
	private String texto;
	private int contador;
	
	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		if(getContador()<getCantidad()) {
			setContador((getContador()+1));
			try {
				pageContext.getOut().println(getTexto());
				return EVAL_BODY_AGAIN;
			} catch (IOException e) {
				e.printStackTrace();
				return SKIP_PAGE;
			}
			
		}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		try {
			getBodyContent().writeOut(getPreviousOut());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
	

}
