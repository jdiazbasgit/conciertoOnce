package banco;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria() {
		setSaldo(0.0);
	}
	
	public CuentaBancaria(double saldo) {
		super();
		setSaldo(saldo);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
			return;
		}
		System.out.println("El saldo no puede ser negativo");			
	}
	
	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			setSaldo (getSaldo() + ingreso);
			return;
		}
		System.out.println("El ingreso debe ser mayor que cero");
	}
	
	public void sacarDinero(double cantidad) {
		if (cantidad <= getSaldo()) {
			setSaldo (getSaldo() - cantidad);
			return;
		}
		System.out.println("Disponible hoy en cajeros : " + getSaldo());
	}

}
