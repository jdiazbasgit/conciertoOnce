




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
		// TODO Auto-generated constructor stub
	}


	@Override

	

	public String sonar()throws SinSonidoException {
		if (getInstrumentoBean1().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		
		return getInstrumentoBean1().getSonido();
	}

	public InstrumentoBean getInstrumentoBean1() {
		return instrumentoBean;
	}

	public void setInstrumentoBean(InstrumentoBean instrumentoBean) {
		this.instrumentoBean = instrumentoBean;
	}


	public InstrumentoBean getInstrumentoBean() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public InstrumentoBean getInstrumentoBean2() {
		// TODO Auto-generated method stub
		return null;
	}


	}


