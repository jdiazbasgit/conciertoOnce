package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanTrompeta {

	@Value("tuuu, tuuu, tuuu en anotaciones")
	private String sonido;
	private String marca;
	private int precio;

	public InstrumentoBeanTrompeta(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	public InstrumentoBeanTrompeta() {
		
	}
	
	
	public InstrumentoBeanTrompeta(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}


	

}
