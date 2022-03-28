package proyecto.beans;

import java.util.Date;

import javax.swing.JPanel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class EmpleadosBean extends JPanel {
	
	private int id;
	private String nombre,dni,telefono,datosPersonalesId,empresasId,datosLaboralesId;
	private Date fechaNacimiento,fechaAlta,fechaBaja;
	

	public EmpleadosBean(int id, String nombre, String dni, String telefono, String datosPersonalesId,
			String empresasId, String datosLaboralesId, Date fechaNacimiento, Date fechaAlta, Date fechaBaja) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.datosPersonalesId = datosPersonalesId;
		this.empresasId = empresasId;
		this.datosLaboralesId = datosLaboralesId;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}

	public EmpleadosBean() {
		super();
	}
	
	
	
	
}
