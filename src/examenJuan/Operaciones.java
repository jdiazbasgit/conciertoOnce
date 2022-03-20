package examenJuan;

public class Operaciones {
	private int numero1;
	private int numero2;

	public int suma() {
		return getNumero1() + getNumero2();
	}

	public int resta(int resta1, int resta2) {
		return resta1 - resta2;
	}

	public int otraResta() {
		return getNumero1() - getNumero2();
	}

	public int multi() {
		return getNumero1() * getNumero2();
	}

	public int otraMulti(int num1, int num2) {

		return num1 * num2;
	}

	public double division() {
		return getNumero1() / getNumero2();
	}

	public double otraDivision(double num1, double num2) {

		return num1 / num2;
	}

	public Operaciones() {
	}

	public Operaciones(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
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
