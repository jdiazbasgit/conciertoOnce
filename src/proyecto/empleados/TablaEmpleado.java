package proyecto.empleados;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyecto.beans.EmpleadosBean;


@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class TablaEmpleado extends EmpleadosBean {
	
	private String [] nombreColumnas = {"Id","Nombre","Telefono","F.Nacimiento","F.Alta","F.Baja","D.Personales",
	"E.Id","D.Laborales"};
	private Object [][] datosFilas = {};
	private EmpleadosBean empleados;
	
		public TablaEmpleado() {
		JTable tablaEmpleados = new JTable(datosFilas,nombreColumnas);
		add(new JScrollPane(tablaEmpleados),BorderLayout.CENTER);
		
		
		  

		
		
		
		}
	
	
	
		

}
	
