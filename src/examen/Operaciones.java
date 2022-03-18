package examen;

public class Operaciones {
	
	private int numero1;
	private int numero2;
	private int resultado;
	

	
	public Operaciones(int numero1, int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	
	public void suma (){
		
		resultado= numero1 + numero2;
		
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
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
}
}
