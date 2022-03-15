package tags;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import lombok.Data;

@Data
public class ValorTag extends TagSupport {

	private int campo;

	@Override
	public int doStartTag() throws JspException {
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		ResultadoBodyTag papa= (ResultadoBodyTag) getParent();
		try {
			pageContext.getOut().println(papa.getResultSet().getString(getCampo()));
			return EVAL_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				papa.getPapa().getConexion().close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return SKIP_PAGE;
		} 
	}

	
	
}
