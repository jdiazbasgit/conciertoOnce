package examen;

public class Operaciones {
private int numero1;
private int numero2;



	public Operaciones(int numero1, int numero2) {
	super();
	this.numero1 = numero1;
	this.numero2 = numero2;
}

	public int sumaNumeros ( int num1, int num2) {
		return num1 + num2;
	}

	public int getNumero1() {
		return numero1;
	}



	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}



	

}
