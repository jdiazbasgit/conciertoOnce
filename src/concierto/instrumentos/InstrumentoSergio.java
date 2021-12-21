package concierto.instrumentos;

public class InstrumentoSergio implements InstrumentoInterface {

	private String sonido;
	
	
	
	public InstrumentoSergio(String sonido) {
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
