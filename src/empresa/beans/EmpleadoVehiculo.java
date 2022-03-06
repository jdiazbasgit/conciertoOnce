package empresa.beans;

import java.io.Serializable;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class EmpleadoVehiculo implements Serializable {
	private static final long serialVersionUID = -3726101827470966284L;
	
	private int idEmpleado;
	private String nombre;
	private String dni;
	private String telefono;
	private Collection<Vehiculo> vehiculos;

}
