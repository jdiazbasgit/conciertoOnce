package concierto.instrumentos;

import concierto.beans.InstrumentoBean;

/**
 * 
 */

/**
 * @author UsuarioM
 *
 */
public class InstrumentoJacinto implements InstrumentoInterface {

	private InstrumentoBean instrumentoBean;

	public String sonar() {

		return getInstrumentoBean().getSonido();
		
	}

	public InstrumentoJacinto(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}

	/**
	 * @return the instrumentoBean
	 */
	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}

	/**
	 * @param instrumentoBean the instrumentoBean to set
	 */
	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}
