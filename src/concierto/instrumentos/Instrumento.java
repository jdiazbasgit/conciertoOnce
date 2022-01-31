




package concierto.instrumentos;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;


public class Instrumento implements InstrumentoInterface,Comparable<Instrumento>{

	private InstrumentoBean instrumentoBean;

	public Instrumento(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}

	

	
	public String sonar() throws SinSonidoException {
		if (getInstrumentoBean().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		return getInstrumentoBean().getSonido();
		
	}
	
	

	public InstrumentoBean getInstrumentoBean() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}



	@Override
	public int hashCode() {
		
		return this.getInstrumentoBean().getSonido().hashCode()+1;
	}



	@Override
	public boolean equals(Object obj) {
		Instrumento instrumento=(Instrumento) obj;
		return this.getInstrumentoBean().getSonido().equals(instrumento.getInstrumentoBean().getSonido());
		
	}
	


	@Override
	public int compareTo(Instrumento o) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public void add(InstrumentoInterface tambor) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public InstrumentoBean getInstrumentoBean1() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public InstrumentoBean getInstrumentoBean2() {
		// TODO Auto-generated method stub
		return null;
	}

}