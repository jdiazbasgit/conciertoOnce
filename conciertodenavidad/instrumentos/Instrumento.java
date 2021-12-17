
package conciertodenavidad.instrumentos;

/**
 * @author malmamor
 *
 */
public class Instrumento implements InstrumentoInterfaz {

	private String sonido;
	
	public Instrumento() {
	}
	
	public Instrumento(String sonido) {
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
	};

}
