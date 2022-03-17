package concierto.beans;
public class InstrumentoBean {
	

	private String sonido;
	

	public InstrumentoBean(String sonido) {
		super();
		this.sonido = sonido;
		
	}
	
	public InstrumentoBean() {
		// TODO Auto-generated constructor stub
	}


	public String getSonido() {
		return sonido;
	}
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	

}
