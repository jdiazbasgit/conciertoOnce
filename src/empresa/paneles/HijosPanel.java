package empresa.paneles;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import empresa.beans.Hijo;
import empresa.daos.EmpresaDAO;
import empresa.daos.HijoDAO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HijosPanel extends JPanel {
///* https://www.arquitecturajava.com/creando-un-java-8-custom-stream/https://www.arquitecturajava.com/creando-un-java-8-custom-stream/ 
	private static final long serialVersionUID = 3378138084853445969L;
	private static final String[] NOMBRES_COLUMNAS_TB_EMPRESAS = { "ID", "CHICOS","CHICAS" };
	

	public HijosPanel() {
		HijoDAO hijoDAO= new HijoDAO();
		JScrollPane empleadosTabla;
		try {
			empleadosTabla = new JScrollPane(new JTable(hijoDAO.dameArrayStringHijos(), NOMBRES_COLUMNAS_TB_EMPRESAS));
			this.setLayout(new BorderLayout());
			this.add(empleadosTabla, BorderLayout.CENTER);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	private void addComboBox() {
		/*
		 *TableColumn sportColumn = table.getColumnModel().getColumn(2);  2 es el núm columna donde poner el combo(empieza por 0)
		 JComboBox comboBox = new JComboBox();
        comboBox.addItem("Snowboarding");
        comboBox.addItem("Rowing");
        comboBox.addItem("Knitting");
        comboBox.addItem("Speed reading");
        comboBox.addItem("Pool");
        comboBox.addItem("None of the above");
        sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
		 */
	}


}
