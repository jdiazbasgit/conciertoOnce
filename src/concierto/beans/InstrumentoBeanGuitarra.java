package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanGuitarra {


	@Value("tlan, tlan, tlan en anotaciones")
	private String sonido;
	private String marca;
	private int precio;

	public InstrumentoBeanGuitarra(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	public InstrumentoBeanGuitarra() {
		
	}
	
	
	public InstrumentoBeanGuitarra(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}


	

}
