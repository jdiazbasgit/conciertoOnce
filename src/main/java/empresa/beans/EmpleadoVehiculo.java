package empresa.beans;

import java.io.Serializable;
import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter
@Getter
@AllArgsConstructor
@ToString
public class EmpleadoVehiculo implements Serializable {
	private int id;
	private String nombre;
	private String dni;
	private String telefono;
	private Collection<Vehiculo> vehiculos;

}
