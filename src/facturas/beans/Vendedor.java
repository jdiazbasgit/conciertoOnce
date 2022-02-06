package facturas.beans;

public class Vendedor {

	private String nombre;
	private String dni;
	private String telefono;
	private int telefono2;

	

	public Vendedor(String nombre, String dni, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	public Vendedor(int telefono2) {
		this.setTelefono2(telefono2);
	}

	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
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
	public int getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(int telefono2) {
		this.telefono2 = telefono2;
	}
	
	
}
