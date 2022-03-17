package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanTambor {

	@Value("pom, pom,pòm  en anotaciones")
	private String sonido;
	private String  marca;
	private int precio;

	public InstrumentoBeanTambor(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	public InstrumentoBeanTambor() {
		
	}
	
	
	public InstrumentoBeanTambor(String sonido, String marca, int precio) {
		super();
		this.sonido = sonido;
		this.marca = marca;
		this.precio = precio;
	}


	

}
