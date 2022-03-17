package concierto.instrumentos;

import concierto.beans.InstrumentoBeanGuitarra;
import concierto.beans.InstrumentoBeanTambor;
import concierto.beans.InstrumentoBeanTrompeta;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInteface;

public class Instrumento implements InstrumentoInteface, Comparable<Instrumento> {
	
	private InstrumentoBeanTambor instrumentoBean;
	
	
    

	public Instrumento(InstrumentoBeanTrompeta instrumentoBean2) {
		// TODO Auto-generated constructor stub
	}




	public InstrumentoBeanTambor getInstrumentoBean() {
		return instrumentoBean;
	}




	public int compareTo(Instrumento o) {
		return this.getInstrumentoBean().getSonido().compareTo(o.getInstrumentoBean().getSonido());
	}

	public String sonar() throws SinSonidoException {

		if (getInstrumentoBean().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		return getInstrumentoBean().getSonido();
	}




	public void setInstrumentoBean(InstrumentoBeanGuitarra instrumentoBean) {
		// TODO Auto-generated method stub
		
	}




	public void setInstrumentoBean(InstrumentoBeanTambor instrumentoBean) {
		// TODO Auto-generated method stub
		
	}




	public void setInstrumentoBean(InstrumentoBeanTrompeta instrumentoBean) {
		// TODO Auto-generated method stub
		
	}




}
