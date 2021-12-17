/**
 * 
 */
package concierto.instrumentos;

/**
 * @author UsuarioM
 *
 */
public class Instrumento implements InstrumentoInterface {

	private String sonido;
	
	@Override
	/**
	 * Metodo que devuelve el sonido del instrumento
	 */
	public String sonar() {
		
		return getSonido();
	}

	/**
	 * @return el sonido del instrumento
	 */
	public String getSonido() {
		return sonido;
	}

	/**
	 * @param sonido el sonido que se le asigna al instrumento
	 */
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
