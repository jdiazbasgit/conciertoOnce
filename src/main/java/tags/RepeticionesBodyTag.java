package tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RepeticionesBodyTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private int cantidad;
	private String texto;
	private int contador;

	@Override
	public int doStartTag() throws JspException {
		setContador(0);
		if(getTexto()==null)
			setTexto("no has escrito nada");
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public int doAfterBody() throws JspException {
		if (getContador() < getCantidad()) {
			setContador(getContador() + 1);
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			getBodyContent().writeOut(getPreviousOut());
			return EVAL_PAGE;
		} catch (IOException e) {
			e.printStackTrace();
			return SKIP_PAGE;
		}
	}
}