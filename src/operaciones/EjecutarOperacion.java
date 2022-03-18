package operaciones;

public class EjecutarOperacion
{

	private int numero1;
	private int numero2;

	public EjecutarOperacion(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	

	public int suma(){
		int resultado = getNumero1()+getNumero2();
		 return resultado;
	 }
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}

}
}
