package operaciones;

public class Operaciones {
	private float saldo;
	
	
	public void Ingresar(float cantidad) {
	
		saldo = saldo + cantidad;
	}
	
	 public void retirar(float cantidad) {
	        saldo = saldo - cantidad;
	    }

	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
