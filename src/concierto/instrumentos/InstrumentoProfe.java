package concierto.instrumentos;

public class InstrumentoProfe implements InstrumentoInterface {

	private String sonido;
	
	public InstrumentoProfe(String sonido) {
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
