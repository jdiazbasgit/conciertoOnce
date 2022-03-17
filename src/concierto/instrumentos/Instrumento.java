package concierto.instrumentos;

import concierto.beans.InstrumentoBeanTambor;
import concierto.excepciones.SinSonidoException;

/**
 * @author fjdia Calase del instrumento
 */

public class Instrumento implements InstrumentoInterface, Comparable<Instrumento>{

	private InstrumentoBeanTambor instrumentoBean;

	public Instrumento(InstrumentoBeanTambor instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}

	
	/**
	 * metodo que devuelve el sonido del instrumento
	 *  
	 * @throws SinSonidoException
	 */

	public String sonar() throws SinSonidoException {
		if (getInstrumentoBean().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		return getInstrumentoBean().getSonido();
		
	}
	
	

	public InstrumentoBeanTambor getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBeanTambor instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}



	/*@Override
	public int hashCode() {
		
		return this.getInstrumentoBean().getSonido().hashCode()+1;
	}*/



	/*@Override
	public boolean equals(Object obj) {
		Instrumento instrumento=(Instrumento) obj;
		return this.getInstrumentoBean().getSonido().equals(instrumento.getInstrumentoBean().getSonido());
		
	}*/



	@Override
	public int compareTo(Instrumento o) {
		// TODO Auto-generated method stub
		return this.getInstrumentoBean().getSonido().compareTo(o.getInstrumentoBean().getSonido());
	}

}
