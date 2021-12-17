
package concierto.instrumentos;

import concierto.beans.InstrumentoBean;


public class Guitarra implements InstrumentoInterface {

	private Guitarra instrumentoBean;
	
	public Guitarra(Guitarra instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
		super.sonido = "quinta quinta quinta";
	}
	


	public String sonar() {
		
		return getInstrumentoBean().getSonido();
	}

	public Guitarra getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(Guitarra instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}

}
