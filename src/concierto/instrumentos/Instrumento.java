/**
 * 
 */
package concierto.instrumentos;

/**
 * @author UsuarioM
 * Clase del instrumento
 */
public class Instrumento implements InstrumentoInterface {

    private String sonido;	
    
  
    
    
	
	@Override
	/**
	 * metodo que devuelve el sonido del instrumento
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
