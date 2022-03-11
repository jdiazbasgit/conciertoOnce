package tags;


import java.sql.SQLException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ValorTag extends TagSupport {
	private static final long serialVersionUID = 1L;
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
