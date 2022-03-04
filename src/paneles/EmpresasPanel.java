package paneles;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmpresasPanel extends JPanel {
///* https://www.arquitecturajava.com/creando-un-java-8-custom-stream/https://www.arquitecturajava.com/creando-un-java-8-custom-stream/ 
	private static final long serialVersionUID = 3378138084853445969L;
	private static final String[] NOMBRES_COLUMNAS_TB_EMPRESAS = { "ID", "Descripcion" };
	private static final String[][] DATOS_TB_EMPRESAS = { { "1", "ONCE" }, { "2", "Capgemini" }, { "3", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "16", "ONCE" }, { "17", "Capgemini" }, { "18", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "13", "ONCE" }, { "14", "Capgemini" }, { "15", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "1", "ONCE" }, { "2", "Capgemini" }, { "3", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" }};

	public EmpresasPanel() {
		JScrollPane empleadosTabla = new JScrollPane(new JTable(DATOS_TB_EMPRESAS, NOMBRES_COLUMNAS_TB_EMPRESAS));
		this.setLayout(new BorderLayout());
		this.add(empleadosTabla, BorderLayout.CENTER);
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
