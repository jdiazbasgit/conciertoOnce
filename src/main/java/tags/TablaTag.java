package tags;

import java.util.stream.Stream;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import empresa.daos.EmpresaDAO;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TablaTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException {
		EmpresaDAO empresaDao= new EmpresaDAO();
		String[] columNames = empresaDao.getColumnasEmpresa();
		StringBuilder sb = new StringBuilder("<tr>");
		Stream.of(columNames).forEach(col->{ sb.append("<th>");
											 sb.append(col);
											 sb.append("</th>"); });	
		sb.append("</tr>");
		try {

			String[][] empresas = empresaDao.dameArrayEmpresas();
			
			for (int i = 0; i < empresas.length; i++) {
				sb.append("<tr>");
				for (int j = 0; j < columNames.length; j++) {
					sb.append("<td>");
					sb.append(empresas[i][j]);
					sb.append("</td>");
				}
				sb.append("</tr>");
			}
			pageContext.getOut().println(sb.toString());
			return EVAL_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
			return SKIP_PAGE;
		}
	}
	
}
