package facturas.beans;

public class Vendedor  {

	private String nombre;
	private String dni;
	private String telefono;
	
	
	
	public Vendedor(String nombre, String dni, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}

	

	
	
	
}
