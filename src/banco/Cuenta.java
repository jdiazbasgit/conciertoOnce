package banco;

public class Cuenta { 
private double saldo;

public void ingresar (double cantidad) {
	saldo = saldo + cantidad;
}
public void cobrar (double cantidadCobro) {
	saldo = saldo - cantidadCobro;
}









public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
}

