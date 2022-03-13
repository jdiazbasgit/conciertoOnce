package tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TextoTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		//RepeticionesBodyTag papa= (RepeticionesBodyTag) getParent();
		RepeticionesBodyTag papa=null;
		try {
			papa = (RepeticionesBodyTag) findAncestorWithClass(this, Class.forName("tags.RepeticionesBodyTag"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			pageContext.getOut().println(papa.getTexto());
			return EVAL_PAGE;
		} catch (IOException e) {
			e.printStackTrace();
			return SKIP_PAGE;
		}		
	}
}