package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
<<<<<<< HEAD
import javax.swing.text.DefaultEditorKit.InsertContentAction;

import lombok.Data;

@Data
public class RepeticionesBodyTag extends BodyTagSupport {

	private int cantidad;
	private String texto;
	private int contador;

	@Override
	public int doStartTag() throws JspException {

		setContador(0);
		//System.out.println(getTexto().length());
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
=======

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
	
	
>>>>>>> branch 'web/MA' of https://github.com/jdiazbasgit/conciertoOnce.git

}
