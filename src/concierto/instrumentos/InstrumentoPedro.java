package concierto.instrumentos;

public class InstrumentoPedro implements InstrumentoInterface {
	private String sonido;

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public InstrumentoPedro(String sonido) {
		super();
		this.sonido = sonido;
	}

	@Override
	public String sonar() {

		return getSonido();
	}

}
