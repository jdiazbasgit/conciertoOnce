package tags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ConexionBodyTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	
	private String driver, cadena, usuario, clave;
	private Connection conexion;

	@Override
	public int doStartTag() throws JspException {
		try {
			Class.forName(getDriver());
			setConexion(DriverManager.getConnection(getCadena(), getUsuario(), getClave()));

		} catch (Exception e) {
			e.printStackTrace();
			return SKIP_PAGE;
		}

		return EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			
			getBodyContent().writeOut(getPreviousOut());
			return EVAL_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
			return SKIP_PAGE;
		}
		finally {
			try {
				getConexion().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}