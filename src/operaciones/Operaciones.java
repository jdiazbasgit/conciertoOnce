package operaciones;

public class Operaciones {
	
	private double saldo;
	
	
	public void ingresar(double cantidad) {
		if (cantidad <= 0 ) {
			System.out.println("Tienes que meter cantidad");
			return;	
		}
		setSaldo(getSaldo() + cantidad);
		//saldo = saldo + cantidad;
	}
	
	 public void retirar(double cantidad) {
		 if (cantidad <= 0 ) {
				System.out.println("Tienes que sacar cantidad");
				return;	
			}
			setSaldo(getSaldo() - cantidad);
	    }

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
