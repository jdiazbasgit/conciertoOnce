package concierto.instrumentos;

import concierto.beans.InstrumentoBean;

public class InstrumentoJuan implements InstrumentoInterface {
	
	private InstrumentoBean instrumentoBean;
	
	public InstrumentoJuan(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}

	@Override
	/**
	 *
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