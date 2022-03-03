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

		add(tablaEmpleados);

		JButton boton = new JButton("Alta");

		JPanel panelBoton = new JPanel();
		add(boton);
		add(panelBoton);
	}

}
