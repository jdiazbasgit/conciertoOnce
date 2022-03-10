package tags;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import lombok.Data;
@Data
public class ConexionBodyTag extends BodyTagSupport {
	
	private String driver,cadena,usuario,clave;
	private Connection conexion;
	
	
	@Override
	public int doStartTag() throws JspException {
		
		try {
			Class.forName(getDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

	
	

}
