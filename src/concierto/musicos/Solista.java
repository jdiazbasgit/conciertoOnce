package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class Solista extends Musico {
	
	

	public Solista(InstrumentoInterface instrumentoInterface) {
		super(instrumentoInterface);
	}

	public Solista() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void tocar() throws SinSonidoException {
		System.out.println(getInstrumentoInterface().sonar());
	}

}
