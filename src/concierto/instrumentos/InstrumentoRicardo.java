package concierto.instrumentos;

public class InstrumentoRicardo implements InstrumentoInterface {
	private String sonido;

	@Override
	public String sonar() {
		// TODO Auto-generated method stub
		return getSonido();
	}

	public InstrumentoRicardo(String sonido) {
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
