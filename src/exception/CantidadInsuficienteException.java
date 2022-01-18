package exception;

@SuppressWarnings("serial")
public class CantidadInsuficienteException extends Exception {
public void cantidadInsuficiente() {
System.out.println("La cantidad total es superior al saldo");	
}
}
