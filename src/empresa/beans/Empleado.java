package empresa.beans;

import java.util.Collection;
import java.util.Date;

import javax.swing.JPanel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class Empleado extends JPanel {
	
	private int id;
	private String nombre;
	private String dni;
	private String telefono;
	private String datosPersonalesId;
	private String empresasId;
	private String datosLaboralesId;
	private Date fechaNacimiento;
	private Date fechaAlta;
	private Date fechaBaja;
	private Collection<Vehiculo> vehiculos;
	

	public Empleado(int id, String nombre, String dni, String telefono, String datosPersonalesId,
			String empresasId, String datosLaboralesId, Date fechaNacimiento, Date fechaAlta, Date fechaBaja) {
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

	public Empleado() {
		super();
	}
	
	
	
	
}
