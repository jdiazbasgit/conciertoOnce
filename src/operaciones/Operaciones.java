package operaciones;

public class Operaciones {
	
	private double saldo;
	
	
	public void ingresar(double cantidad) {
	
		saldo = saldo + cantidad;
	}
	
	 public void retirar(double cantidad) {
	        saldo = saldo - cantidad;
	    }

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
