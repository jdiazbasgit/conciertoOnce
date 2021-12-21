package concierto.instrumentos;

public class InstrumentoMiguelAngel implements InstrumentoInterface {

	
	private String sonido;
	
	public InstrumentoMiguelAngel(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	@Override
	public String sonar() {
		
		return getSonido();
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

}
