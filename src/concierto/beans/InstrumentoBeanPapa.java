package concierto.beans;

import lombok.Data;

@Data
public class InstrumentoBeanPapa {
	private String sonido;
	private String marca;
	private int precio;

	public InstrumentoBeanPapa(String sonido) {
		this.sonido = sonido;
		
	}
	
	public InstrumentoBeanPapa() {
		
	}
	
	
	public InstrumentoBeanPapa(String sonido, String marca, int precio) {
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}

}
