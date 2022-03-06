package empresa.paneles;

import java.awt.Component;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import empresa.beans.Vehiculo;
import empresa.daos.EmpleadoVehiculoDAO;

public class PanelEmpleadoVehiculo extends JPanel implements ListSelectionListener{
	private static final long serialVersionUID = -4754596809773946842L;

	private JTable tablaEmpleados;
	private JTable tablaVehiculos;
	public PanelEmpleadoVehiculo() throws SQLException{ 
		EmpleadoVehiculoDAO dao = new EmpleadoVehiculoDAO();
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,10)));
		JLabel labelTitulo = new JLabel("Selecciona Empleado:");
		labelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(labelTitulo);
		add(Box.createRigidArea(new Dimension(0,15)));
		tablaEmpleados = new JTable(new DefaultTableModel(dao.dameArrayEmpleados(),EmpleadoVehiculoDAO.COLUMNAS_EMPLEADO));
		tablaEmpleados.setDefaultEditor(String.class, null);
		tablaEmpleados.getSelectionModel().addListSelectionListener(this);
		add(new JScrollPane(tablaEmpleados));
		add(Box.createRigidArea(new Dimension(0,10)));
		tablaVehiculos = new JTable(new DefaultTableModel(new String[0][],EmpleadoVehiculoDAO.COLUMNAS_VEHICULO));
		tablaVehiculos.setEnabled(false);
		add(new JScrollPane(tablaVehiculos));
		if (tablaEmpleados.getModel().getRowCount()>0) 
			tablaEmpleados.setRowSelectionInterval(0, 0);			
		add(Box.createRigidArea(new Dimension(0,10)));
		Border empty = BorderFactory.createEmptyBorder(10,30,10,30);
		setBorder(empty);
	}

	@Override
    public void valueChanged (ListSelectionEvent event){
       	int fila = this.tablaEmpleados.getSelectedRow();
    	int idEmpleado = Integer.parseInt(this.tablaEmpleados.getModel().getValueAt(fila, 0).toString());
    	try {
			DefaultTableModel model = 
					new DefaultTableModel(new EmpleadoVehiculoDAO().dameArrayVehiculos(idEmpleado), 
										  EmpleadoVehiculoDAO.COLUMNAS_VEHICULO);
			tablaVehiculos.setModel(model);
			((AbstractTableModel) model).fireTableDataChanged();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
	
	public String[] mapToStringArray (Vehiculo vehiculo) {
		return new String[] {String.valueOf(vehiculo.getId()),vehiculo.getMarca(), vehiculo.getModelo()};
	}
}
