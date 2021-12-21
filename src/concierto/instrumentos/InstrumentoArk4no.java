package concierto.instrumentos;

public class InstrumentoArk4no implements InstrumentoInterface {
	private String sonido;


	public InstrumentoArk4no(String sonido) {
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
