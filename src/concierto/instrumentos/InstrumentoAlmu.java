package concierto.instrumentos;

public class InstrumentoAlmu implements InstrumentoInterface{
	private InstrumentoBean instrumentoBean;
	
	public InstrumentoAlmu(IntrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}
	public String sonar() {
		return getInstrumentoBean().getSonido();
	}

	public  InstrumentoAlmu InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
				
	}
	public void  InstrumentoAlmu setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean= InstrumentoBean;
	}
}
