/**
 * 
 */
package concierto.instrumentos;

import concierto.beans.InstrumentoBean;

/**
 * @author fjdia Calase del instrumento
 */
public class InstrumentoUno implements InstrumentoInterface {

	private InstrumentoBean instrumentoBean;

	public InstrumentoUno(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}

	@Override
	/**
	 * metodo que devuelve el sonido del instrumento
	 */
	public String sonar() {

		return getInstrumentoBean().getSonido();
	}

	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}
