package banco;

public class CuentaCorriente {
private double saldo;


	

	public CuentaCorriente(double saldo) {
	super();
	this.saldo = saldo;
}

	
	public CuentaCorriente() {
		super();
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
}
