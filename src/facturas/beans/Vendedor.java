package facturas.beans;

public class Vendedor implements Comparable<Vendedor> {

	private int nombre;
	private int dni;
	private int telefono;

	public Vendedor(int nombre, int telefono, int dni) {
		super();
		this.nombre =  nombre;
		this.telefono = telefono;
		this.dni = dni;
				
	}

	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public int compareTo(Vendedor o) {
		
		return 0;
	}

	
}
