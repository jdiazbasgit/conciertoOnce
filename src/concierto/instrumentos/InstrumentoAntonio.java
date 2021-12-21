package concierto.instrumentos;


import concierto.beans.InstrumentoBean;

public class InstrumentoAntonio implements InstrumentoInterface{
	
	private String sonido;
	private InstrumentoBean instrumentoBean;
	
	public InstrumentoAntonio(InstrumentoBean instrumentoBeanAntonio) {
		
		super();
		
		this.instrumentoBean = instrumentoBeanAntonio;
	}
	

	
	public String getSonido() {
		return sonido;
	}

	
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public String sonar() {
		
		return sonar();
	}


	
	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}


	
	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}