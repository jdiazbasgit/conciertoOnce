package concierto.instrumentos;

public class InstrumentoHortensia implements InstrumentoInterface {

	private String sonido;

	public InstrumentoHortensia(String sonido) {
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
		return this.getSonido();

	}
}
