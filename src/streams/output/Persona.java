package streams.output;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persona  implements Serializable{

	private String nombre;
	private  String telefono;
	private  int edad;

	public String getNombre() {
		return nombre;
	}

	public Persona(String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.setTelefono(telefono);
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "tu nombre es:" + getNombre() + ", tu telefono es:" + getTelefono() + " y tu edad es:" + getEdad();
	}

}
