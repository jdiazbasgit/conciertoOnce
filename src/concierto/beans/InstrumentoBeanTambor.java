package concierto.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanTambor {
	
	@Value("pom, pom, pom de tambor")
	private String sonido;
	private String marca;
	private int precio;

	public InstrumentoBeanTambor() {
		
	}
	
	
	public InstrumentoBeanTambor(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	
	
	public InstrumentoBeanTambor(String sonido, String marca, int precio) {
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
