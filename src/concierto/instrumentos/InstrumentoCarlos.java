package concierto.instrumentos;

import concierto.beans.InstrumentoBean;

public class InstrumentoCarlos implements InstrumentoInterface {
	private InstrumentoBean instrumentoBean;
	@Override
	public String sonar() {
	
		return getInstrumentoBean().getSonido();
	}
	
	
	public InstrumentoCarlos(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}


	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}
	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}
