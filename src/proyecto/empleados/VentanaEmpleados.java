package proyecto.empleados;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import lombok.Data;

@Data
@SuppressWarnings("serial")
public class VentanaEmpleados extends JPanel {

	public VentanaEmpleados() {

		TablaEmpleados tablaEmpleados = new TablaEmpleados();

		add(tablaEmpleados,BorderLayout.CENTER);

		JButton boton = new JButton("Alta Empleados");

		JPanel panelBoton = new JPanel();
		add(boton, BorderLayout.SOUTH);
		add(panelBoton);
	}

}
