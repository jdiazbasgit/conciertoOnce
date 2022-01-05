package banco;

public class Operaciones {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double cantidadIngresada) {
		saldo = saldo + cantidadIngresada;

	}
	 public void retirar(double cantidadRetirada) {
		 saldo = saldo - cantidadRetirada;
	 }
	
	

}
