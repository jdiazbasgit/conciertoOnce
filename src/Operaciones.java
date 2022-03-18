
public class Operaciones {
	
	private int numero1;
	private int numero2;
	
	public Operaciones(int nuemero1, int numero2) {
		super();
		this.numero1 = nuemero1;
		this.numero2 = numero2;
	}
	
	public void suma(int numero1,int numero2) {
		int resultado=0;
		resultado=numero1+numero2;
		System.out.println("La suma de: " + getNuemero1() + " + " + getNumero2() + " = " + resultado);
	}

	public int getNuemero1() {
		return numero1;
	}

	public void setNuemero1(int nuemero1) {
		this.numero1 = nuemero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}
