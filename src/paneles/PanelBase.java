package paneles;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelBase extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private JButton boton;
    private DefaultTableModel tablaModel;
	public PanelBase(String[] nombresColumnas,Object[][] datosTabla, String txtBoton) {
		tablaModel = new DefaultTableModel(datosTabla,nombresColumnas);
		tabla = new JTable(tablaModel);
		JScrollPane empleadosTabla = new JScrollPane(new JTable(datosTabla, nombresColumnas));
		this.setLayout(new BorderLayout());
		this.add(empleadosTabla, BorderLayout.CENTER);
		boton=new JButton(txtBoton);
		this.add(boton, BorderLayout.SOUTH);
	}
	
	private void addRowTable() {			 
			  //DefaultTableModel model = new DefaultTableModel(datosTabla,nombresColumnas);
			  JTable tabla = new JTable(tablaModel);
			  //insertar en la 1ª fila
			  tablaModel.insertRow(0,new Object[]{"Ranjan","50"});
			  //Insertar en la 4ª fila
			  tablaModel.insertRow(3,new Object[]{"Amar","600"});
			  // Añadir al final
			  tablaModel.insertRow(tabla.getRowCount(),new Object[]{"Sushil","600"});
	
	}
}
