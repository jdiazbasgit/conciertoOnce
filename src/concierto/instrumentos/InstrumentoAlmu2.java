package concierto.instrumentos;

public class InstrumentoAlmu2 implements InstrumentoInterface {
	
	private String sonido;

	public InstrumentoAlmu2(String sonido) {
		super();
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String sonar() {
		
		return getSonido();
	}

}
