/**
 * 
 */
package concierto.instrumentos;

import concierto.excepciones.SinSonidoException;

/**
 * @author profe
 *Interface que genera clases de instrumentos
 */
public interface InstrumentoInterface {

	public String sonar() throws SinSonidoException;
}
