package proyecto.ventanaglobal;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import empresa.daos.EmpresaDAO;
import empresa.daos.HijoDAO;
import empresa.paneles.PanelEmpleadoVehiculo;
import empresa.paneles.PanelTabla;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyecto.empleados.VentanaEmpleado;

@EqualsAndHashCode(callSuper = false)
@Data
@SuppressWarnings("serial")
public class VentanaGlobal extends JFrame {

	private VentanaEmpleado ventanaEmpleados;
	private JTabbedPane pestanias;

	public VentanaGlobal() {
		setTitle("PROYECTO DE BASE DE DATOS");
		setSize(650, 650);
		setLocationRelativeTo(null);
		try {
			iniciarVentanas();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pack();
	}

	private void iniciarVentanas()  throws SQLException{
		pestanias = new JTabbedPane();
		add(pestanias);
		EmpresaDAO dao = new EmpresaDAO();
		pestanias.add("Empresas", 
				       new PanelTabla(dao.dameArrayEmpresas(),dao.getColumnasEmpresa(),"Empresas", "Crear Empresa"));	
		pestanias.add("Emple-Vehic", new PanelEmpleadoVehiculo("Empleado =>  Vehículos"));
		HijoDAO hdao = new HijoDAO();
		pestanias.add("Hijos", 
				       new PanelTabla(hdao.dameArrayHijos(),hdao.getColumnasHijo(),"Hijos", "Crear Hijos"));	

	}

}
