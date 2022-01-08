package banco;

public class Cuenta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar(double cantidad) {
		saldo= saldo + cantidad;
	}
	
	public void sacar(double cantidad) {
		saldo= saldo - cantidad;
	}
}
