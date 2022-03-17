package concierto.beans;

import lombok.Data;

@Data
public class InstrumentoBean {
	
	private String sonido;
	private String marca;
	private int precio;
	
	
	public InstrumentoBean() {
		
	}
	
	
	public InstrumentoBean(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	
	
	
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
