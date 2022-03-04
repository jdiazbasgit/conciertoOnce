package proyecto.ventanaglobal;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyecto.empleados.VentanaEmpleado;

@EqualsAndHashCode(callSuper=false)
@Data
@SuppressWarnings("serial")
public class VentanaGlobal extends JFrame {

	VentanaEmpleado ventanaEmpleados;
	JTabbedPane pestanias;
	
	public VentanaGlobal() {
		setTitle("PROYECTO DE BASE DE DATOS");
		setSize(650, 650);
		setLocationRelativeTo(null);
	
	
		iniciarVentanas();
	}

private void iniciarVentanas() {
		
		
		
		pestanias = new JTabbedPane();
		ventanaEmpleados = new VentanaEmpleado();
		add(pestanias);
		pestanias.add("Empleados",ventanaEmpleados);
		
		
		
	}
	
	
}
