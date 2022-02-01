package concierto.instrumentos;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;

public interface InstrumentoInterface {


	public String sonar() throws SinSonidoException;

	public InstrumentoBean getInstrumentoBean1();

	public InstrumentoBean getInstrumentoBean2();

	InstrumentoBean getInstrumentoBean();

	


}
