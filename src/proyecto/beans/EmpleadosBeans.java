package proyecto.beans;

import java.util.Date;

import javax.swing.JTable;

import lombok.Data;

@Data
public class EmpleadosBeans extends JTable {
	
	private int id;
	private String nombre,dni,telefono,datosPersonalesId,empresasId,datosLaboralesId;
	private Date fechaNacimiento,fechaAlta,fechaBaja;

	public EmpleadosBeans(int id, String nombre, String dni, String telefono, String datosPersonalesId,
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

	public EmpleadosBeans() {
		super();
	}
	
	
	
	
}
