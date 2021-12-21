package concierto.instrumentos;

public class InstrumentoJavier implements InstrumentoInterface {

	private String sonido;
	
	
	
	public InstrumentoJavier(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	@Override
	public String sonar() {
		
		return getSonido();
	}
	
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
