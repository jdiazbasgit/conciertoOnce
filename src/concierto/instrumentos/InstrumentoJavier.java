package concierto.instrumentos;

import concierto.beans.InstrumentoBean;

public class InstrumentoJavier implements InstrumentoInterface {
private InstrumentoBean instrumentoBean;
	
	
	public InstrumentoJavier(InstrumentoBean instrumentoBean) {
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
