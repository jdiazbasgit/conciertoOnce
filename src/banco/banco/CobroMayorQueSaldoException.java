package banco;

@SuppressWarnings("serial")
public class CobroMayorQueSaldoException extends Exception {
public void cobroMayorQueSaldo () {
	System.out.println("IVA A SACAR M�S DE LO PERMITIDO, MAS QUE EL SALDO ");
}
}
