
package concierto.instrumentos;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;

public class Instrumento implements InstrumentoInterface {

	private InstrumentoBean instrumentoBean;

	public Instrumento(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}
	public Instrumento () {
		
	}

	public Instrumento(String sonido) {
		this.setInstrumentoBean(new InstrumentoBean(sonido));
		
	}

	/**
	 * metodo que devuelve el sonido del instrumento
	 *  
	 * @throws SinSonidoException
	 */

	public String sonar() throws SinSonidoException {
		if (getInstrumentoBean().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		return getInstrumentoBean().getSonido();
		
	}
	

	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

	
	

}
