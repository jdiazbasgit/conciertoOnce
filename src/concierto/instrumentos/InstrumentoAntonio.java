package concierto.instrumentos;


public class InstrumentoAntonio implements InstrumentoInterface{
	
	private InstrumentoBean instrumentoBean;
	
	public InstrumentoAntonio(InstrumentoBean instrumentoBean) {
		
		super();
		
		this.instrumentoBean = instrumentoBean;
	}
	
	piblic String sonar() {
		return getInstrumentoBean().sonido();
	}
	
	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}
