package empresa.paneles;

import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import empresa.daos.HijoDAO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HijosPanel extends JPanel { 
	private static final long serialVersionUID = 3378138084853445969L;	

	public HijosPanel() throws SQLException{
		HijoDAO hijoDAO= new HijoDAO();
		JScrollPane empleadosTabla;
		empleadosTabla = new JScrollPane(new JTable(hijoDAO.dameArrayHijos(), hijoDAO.getColumnasHijo()));
		this.setLayout(new BorderLayout());
		this.add(empleadosTabla, BorderLayout.CENTER);
	}

}
