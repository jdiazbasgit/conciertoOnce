package concierto.instrumentos;

import concierto.excepciones.SinSonidoException;

public interface InstrumentoInteface {
	public String sonar() throws SinSonidoException; 

}
