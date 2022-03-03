package proyecto.empleados;

import javax.swing.JPanel;
import lombok.Data;
@Data
@SuppressWarnings("serial")
public class VentanaEmpleados extends JPanel {

	private JPanel panelEmpleados;

	public VentanaEmpleados() {
		TablaEmpleados tablaEmpleados = new TablaEmpleados();
		panelEmpleados = new JPanel();
	    panelEmpleados.setLayout(null);
		panelEmpleados.add(tablaEmpleados);

	}
	
	
}
