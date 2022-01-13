package banco;

public class Cuenta {
	private int NumeroDeCuenta;
	private int SaldoDelaCuenta;

	public int getNumeroDeCuenta() {
		return NumeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		NumeroDeCuenta = numeroDeCuenta;
	}

	public int getSaldoDelaCuenta() {
		return SaldoDelaCuenta;
	}

	public void setSaldoDelaCuenta(int saldoDelaCuenta) {
		SaldoDelaCuenta = saldoDelaCuenta;
	}



public Cuenta(int cuenta, int d) {
    NumeroDeCuenta = cuenta;
    SaldoDelaCuenta = NumeroDeCuenta;
}

public Cuenta(int cuenta, double d) {
	// TODO Auto-generated constructor stub
}

public void depositar(int Cantidad, int SaldoDelaCuenta) {
	this.SaldoDelaCuenta = SaldoDelaCuenta + Cantidad;
}

public void retirar(int Cantidad) {
	SaldoDelaCuenta = SaldoDelaCuenta - Cantidad;
	
}

public int Saldo() {
	return SaldoDelaCuenta;
	
	
}







}