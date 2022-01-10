package banco;

public class Cuenta {

	private double saldo;
	private double limiteCredito = 200;
	private double limiteReintegroCajero = 300;
	private double limiteGastoDiario = 1000;

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		} else
			System.out.println("\r\n" + "Cantidad incorrecta. Introduce un valor positivo" + "\r\n");

	}

	public void extraer(double cantidad) {
		saldo = saldo - cantidad;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public double getLimiteGastoDiario() {
		return limiteGastoDiario;
	}

	public void setLimiteGastoDiario(double limiteGastoDiario) {
		this.limiteGastoDiario = limiteGastoDiario;
	}

	public double getLimiteReintegroCajero() {
		return limiteReintegroCajero;
	}

	public void setLimiteReintegroCajero(double limiteReintegroCajero) {
		this.limiteReintegroCajero = limiteReintegroCajero;
	}

}
