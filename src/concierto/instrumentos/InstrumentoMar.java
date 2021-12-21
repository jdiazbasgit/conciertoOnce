package concierto.instrumentos;

public class InstrumentoMar implements InstrumentoInterface{

	private String sonido;

	public InstrumentoMar(String sonido) {
		super();
		this.sonido = sonido;
	}

	/**
	 * @return the sonido
	 */
	public String getSonido() {
		return sonido;
	}

	/**
	 * @param sonido the sonido to set
	 */
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	/**
	 * metodo que devuelve el sonido del instrumento
	 */
	public String sonar() {		
		return getSonido();
	}

}
