package facturas.beans;

public class Vendedor implements Comparable<Vendedor> {

	public static Object getNombre;
	private int nombre;
	private int dni;
	private int telefono;

	public Vendedor(int string, int telefono2, int dni2) {
		super();
		this.nombre = string;
		this.dni = telefono2;
		this.telefono = dni2;
	}

	public Vendedor(String string) {
		// TODO Auto-generated constructor stub
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