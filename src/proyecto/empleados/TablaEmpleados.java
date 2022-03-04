package proyecto.empleados;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.mysql.cj.xdevapi.Statement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import proyecto.beans.EmpleadosBeans;


@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class TablaEmpleados extends EmpleadosBeans {
	
	private String [] nombreColumnas = {"Id","Nombre","Telerfono","Fecha_Nacimiento","Fecha _Alta","Fecha_Baja","Datos_Personales",
	"Empesa_Id","Datos_Laborales"};
	private Object [][] datosFilas = {};
	private EmpleadosBeans empleados;
	
		public TablaEmpleados() {
		JTable tablaEmpleados = new JTable(datosFilas,nombreColumnas);
		add(new JScrollPane(tablaEmpleados),BorderLayout.CENTER);
		
		
		  

		
		
		
		}
	
	
	
		

}
	
