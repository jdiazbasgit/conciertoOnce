package concierto.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanGuitarra {
	
	@Value("pom, pom, pom de guitarra")
	private String sonido;
	private String marca;
	private int precio;

	public InstrumentoBeanGuitarra() {
		
	}
	
	
	public InstrumentoBeanGuitarra(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	
	
	public InstrumentoBeanGuitarra(String sonido, String marca, int precio) {
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
