package banco;

public class Persona {
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public  int suma(int a) {
		return getEdad()+a;
	}
	
	public double convertirGrados(int celsuiius) {
		return celsiius*2.5;
	}

	public Persona(int edad) {
		super();
		this.edad = edad;
	}
}
