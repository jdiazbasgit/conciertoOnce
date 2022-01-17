package concierto.teatro;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
	 InstrumentoInterface[] instrumentos= {
			 new Instrumento(new InstrumentoBean("pom,pom,pom")),
			 new Instrumento(new InstrumentoBean("tuuu,tuuu,tuuu")),
			 new Instrumento(new InstrumentoBean("tklan,tlan,tlan")) };
	 
	 
	 HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
	 try {
		hombreOrquesta.tocar();
	} catch (SinSonidoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
