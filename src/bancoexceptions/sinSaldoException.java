package bancoexceptions;

@SuppressWarnings("serial")
public class sinSaldoException extends Exception {
public void cobroMayorQueSaldo () {
	System.out.println("VA A SACAR M�S QUE EL SALDO DE SU CUENTA");
}
}
