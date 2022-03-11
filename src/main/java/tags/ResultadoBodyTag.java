package tags;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResultadoBodyTag extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
	private String sql;
	private ConexionBodyTag papa;
	private transient ResultSet resultSet;

	@Override
	public int doStartTag() throws JspException {
		setPapa((ConexionBodyTag) getParent());
		try {
			Statement statement = papa.getConexion().createStatement();
			setResultSet(statement.executeQuery(getSql()));
			if (getResultSet().next()) {
				return EVAL_BODY_BUFFERED;
			}
			return SKIP_BODY;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				getPapa().getConexion().close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return SKIP_PAGE;
		}
	}

	@Override
	public int doAfterBody() throws JspException {
		try {
			if (getResultSet().next())
				return EVAL_BODY_AGAIN;
			return SKIP_BODY;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				getPapa().getConexion().close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return SKIP_PAGE;
		}
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			getBodyContent().writeOut(getPreviousOut());
			return EVAL_PAGE;
		} catch (IOException e) {
			e.printStackTrace();
			try {
				getPapa().getConexion().close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return SKIP_PAGE;
		}
	}

}
