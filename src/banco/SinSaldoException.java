package banco;

@SuppressWarnings("serial")
public class SinSaldoException extends Exception {
	
	public void faltaSldo() {
		System.out.println("Falta saldo");
	}
}
