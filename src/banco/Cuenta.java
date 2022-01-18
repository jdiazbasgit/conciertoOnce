package banco;

public class Cuenta {

	private double saldo;
	private double limiteCredito = 0;
	private double limiteReintegroCajero = 300;
	private double gastoDiario = 0;
	private double limiteGastoDiario = 1000;

	public void ingreso(double ingreso) {

		if (ingreso < 0)
			System.out.println("\r\n" + "Cantidad incorrecta. Introduce un valor positivo" + "\r\n");
		setSaldo(getSaldo() + ingreso);
		System.out.println("\r\n" + ok() + getSaldo() + " �" + "\r\n");
	}

	public void reintegro(double reintegro) {
		if (reintegro < 0)
			System.out.println("\r\n" + "Cantidad incorrecta. " + "\r\n");

		if (saldo + limiteCredito - reintegro < 0 || limiteGastoDiario - reintegro < 0 || limiteReintegroCajero - reintegro < 0)
			System.out.println(
					"\r\n" + ko() + getSaldo() + " �" + "\r\n" + "L�mite de gasto diario: " + getLimiteGastoDiario()
							+ "\r\n" + "L�mite de reintegro por operaci�n: " + getLimiteReintegroCajero() + "\r\n");

		else {
			setSaldo(getSaldo() - reintegro);
			gastoDiario = gastoDiario + reintegro;
			setLimiteCredito(getLimiteCredito() - reintegro);
			setLimiteGastoDiario(getLimiteGastoDiario() - reintegro);
			System.out.println(
					"\r\n" + ok() + getSaldo() + " �" + "\r\n" + "L�mite de gasto diario: " + getLimiteGastoDiario()
							+ "\r\n" + "L�mite de reintegro por operaci�n: " + getLimiteReintegroCajero() + "\r\n");
		}
	}

	public void verSaldo() {
		System.out.println("\r\n" + "Tu saldo es: " + getSaldo() + " �" + "\r\n");
	}

	public void verLimiteCajero() {
		System.out.println(
				"\r\n" + "El l�mite de reintegro en cajeros es de: " + getLimiteReintegroCajero() + " �" + "\r\n");
	}

	public void nuevoLimiteReintegroCajero(double limiteReintegroCajero) {
		setLimiteReintegroCajero(limiteReintegroCajero);
		System.out.println("\r\n" + "L�mite de reintegro en cajeros actualizado." + "\r\n"
				+ "Su nuevo l�mite de reintegro es de: " + getLimiteReintegroCajero() + " �" + "\r\n");
	}

	public void nuevoLimiteGastoDiario(double nuevoLimiteGastoDiario) {
		setLimiteGastoDiario(nuevoLimiteGastoDiario);
		setLimiteGastoDiario(getLimiteGastoDiario() - gastoDiario);
		System.out.println("L�mite de gasto diario actualizado. Su nuevo l�mite de gasto es de: "
				+ getLimiteGastoDiario() + " �" + "\r\n");
	}

	public void verLimiteDeGastoDiario() {
		System.out.println("\r\n" + "El l�mite de gasto diario es de: " + getLimiteGastoDiario() + " �" + "\r\n");
	}

	public String ok() {
		return "Operaci�n realizada con �xito." + "\r\n" + "Saldo actual = ";
	}

	public String ko() {
		return "Operaci�n rechazada." + "\r\n" + "Saldo actual = ";
	}

	public void despedida() {
		System.out.println("\r\n" + "Fin de la aplicaci�n. �Vuelva pronto!" + "\r\n");
	}

	public void errorOpcion() {
		System.out.println("\r\n" + "opci�n no v�lida" + "\r\n");
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
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
