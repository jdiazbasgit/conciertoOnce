package concierto.beans;

public class InstrumentoBean {
	

	private String sonido;
	

	public InstrumentoBean(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}
	private String sonido,marca;
	private int precio;
	
	
	public InstrumentoBean(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}

	public String getSonido() {
		return sonido;
	}
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	

}
