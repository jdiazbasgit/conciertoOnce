package paneles;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Collection;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class PanelEmpleadoVehiculo extends JPanel {
	private static final long serialVersionUID = -4754596809773946842L;

	private JTable tabla;
	public PanelEmpleadoVehiculo(String[][] empleados,Collection<String> vehiculos, String tituloPanel, String[] nombresColumnas) { 
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.add(Box.createRigidArea(new Dimension(0,10)));
		JLabel labelTitulo = new JLabel(tituloPanel);
		labelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(labelTitulo);
		this.add(Box.createRigidArea(new Dimension(0,15)));
		this.tabla = new JTable(new DefaultTableModel(empleados,nombresColumnas));
		this.tabla.setEnabled(false);
		this.add(new JScrollPane(tabla));
		this.add(Box.createRigidArea(new Dimension(0,10)));
		Border empty = BorderFactory.createEmptyBorder(10,30,10,30);
		this.setBorder(empty);
	}


}
