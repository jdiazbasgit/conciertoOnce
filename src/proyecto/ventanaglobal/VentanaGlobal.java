package proyecto.ventanaglobal;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import lombok.Data;
import proyecto.empleados.VentanaEmpleados;
@Data
@SuppressWarnings("serial")
public class VentanaGlobal extends JFrame {

	VentanaEmpleados ventanaEmpleados;
	JTabbedPane pestanias;
	
	public VentanaGlobal() {
		setTitle("PROYECTO DE DB ");
		setSize(500, 600);
		setLocationRelativeTo(null);
	
	
		iniciarVentanas();
	}

private void iniciarVentanas() {
		
		
		
		pestanias = new JTabbedPane();
		ventanaEmpleados = new VentanaEmpleados();
		add(pestanias);
		pestanias.add("Empleados",ventanaEmpleados);
		
		
		
	}
	
	
}
