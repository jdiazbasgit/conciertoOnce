package concierto.beans;
public class InstrumentoBean {
	

	private String sonido;
	

	public InstrumentoBean(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	


	public String getSonido() {
		return sonido;
	}
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	

}
