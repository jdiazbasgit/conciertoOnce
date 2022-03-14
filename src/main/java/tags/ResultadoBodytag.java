package tags;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import lombok.Data;

@Data
public class ResultadoBodytag extends BodyTagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SQL;
	private ConexionBodyTag papa;
	
	public  ResultadoBodytag() {
		setPapa((ConexionBodyTag) getParent());
	}

	@Override
	public int doStartTag() throws JspException {
		return 0;
	}

	public int doAfterBody() throws JspException {
		return 0;
	}



	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}


	
	

}
