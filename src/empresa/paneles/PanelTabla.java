package empresa.paneles;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private JButton boton;
	private JLabel tituloLabel;

	public PanelTabla( String[][] datosTabla, String[] nombresColumnas, String tituloPanel, String txtBoton) {		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.tituloLabel = new JLabel(tituloPanel);
		this.tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(this.tituloLabel);
		this.add(Box.createRigidArea(new Dimension(0,15)));
		this.tabla = new JTable(new DefaultTableModel(datosTabla,nombresColumnas));
		this.tabla.setEnabled(false);
		this.add(new JScrollPane(tabla));
		this.add(Box.createRigidArea(new Dimension(0,20)));
		this.boton=new JButton(txtBoton);
		boton.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(boton);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		Border empty = BorderFactory.createEmptyBorder(10,30,10,30);
		this.setBorder(empty);
	}
	
	public void cargarDatosTabla(String[][] datosTabla, String[] nombresColumnas) {		
		DefaultTableModel tablaModel = (DefaultTableModel)this.getTabla().getModel();
		tablaModel.setDataVector(datosTabla,nombresColumnas);
		((AbstractTableModel) tablaModel).fireTableDataChanged();
	}
	
	public void addBotonListener(ActionListener listenerBoton) {
		this.getBoton().addActionListener(listenerBoton);
	}
	
}
