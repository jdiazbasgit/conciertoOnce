package concierto.beans;

import lombok.Data;

@Data
public class InstrumentoBean {


	private String sonido, marca;
	private int precio;

	public InstrumentoBean(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	public InstrumentoBean() {
		
	}
	
	
	public InstrumentoBean(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}


	

}
