package empresa.paneles;

import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import empresa.daos.EmpresaDAO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class EmpresasPanel extends JPanel {
	private static final long serialVersionUID = 3378138084853445969L;

	public EmpresasPanel() throws SQLException {
		EmpresaDAO dao = new EmpresaDAO();
		JScrollPane empleadosTabla = 
				new JScrollPane(new JTable(dao.dameArrayEmpresas(), dao.getColumnasEmpresa()));
		this.setLayout(new BorderLayout());
		this.add(empleadosTabla, BorderLayout.CENTER);
	}

}
