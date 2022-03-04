package proyecto.ventanaglobal;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import empresa.beans.EstadoCivil;
import empresa.paneles.EmpresasPanel;
import empresa.ventanas.Cargos;
import empresa.ventanas.DatosLaborales;
import empresa.ventanas.EstadosCiviles;
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
		pestanias.add("Empresas",new EmpresasPanel());
		pestanias.add("Empleados",ventanaEmpleados);
		pestanias.add("Datos Laborales",new DatosLaborales());
		//pestanias.add("Datos Personales",new DatosPersonales());
		pestanias.add("Cargos",new Cargos());
		pestanias.add("Estados Civiles",new EstadosCiviles());
		pestanias.add("Hijos",new EmpresasPanel());
		
		
		
		
	}
	
	
}
