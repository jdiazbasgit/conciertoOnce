package bancoexceptions;

@SuppressWarnings("serial")
public class sinSaldoException extends Exception {
public void cobroMayorQueSaldo () {
	System.out.println("VA A SACAR MÁS QUE EL SALDO DE SU CUENTA");
}
}
