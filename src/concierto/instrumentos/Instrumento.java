




package concierto.instrumentos;
import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;

public class Instrumento implements InstrumentoInterface {

	private InstrumentoBean instrumentoBean;
	
	public Instrumento(InstrumentoBean instrumentoBean) {
		super();
		this.instrumentoBean = instrumentoBean;
	}


	public Instrumento(String string) {
		
	}


	@Override

	

	public String sonar()throws SinSonidoException {
		if (getInstrumentoBean11().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		
		return getInstrumentoBean11().getSonido();
	}

	public InstrumentoBean getInstrumentoBean11() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}


	@Override
	public InstrumentoBean getInstrumentoBean1() {
		
		return null;
	}


	@Override
	public InstrumentoBean getInstrumentoBean() {
		
		return null;
	}


	@Override
	public InstrumentoBean getInstrumentoBean2() {
		// TODO Auto-generated method stub
		return null;
	}


	

	}


