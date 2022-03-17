package concierto.beans;

import lombok.Data;

@Data
public class InstrumentoBean {


	private String sonido, marca;
	private int precio;


	
	public InstrumentoBean() {
		
	}
	
	
	public InstrumentoBean(String sonido) {
		super();
		this.sonido = sonido;
		
	}


	

}
