package streams.output;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private transient
	String telefono;
	private int edad;
	
	

	public Persona(String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	
	
}
