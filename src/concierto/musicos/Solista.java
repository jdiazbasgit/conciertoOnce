package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

public class Solista extends Musico {
	
	public Solista() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Solista(Instrumento instrumentoInterface) {
		super(instrumentoInterface);
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	@Qualifier("guitarra")
	@Override
	public void setInstrumentoInterface(Instrumento instrumentoInterface) {
		// TODO Auto-generated method stub
		super.setInstrumentoInterface(instrumentoInterface);
	}

	@Override
	public void tocar() throws SinSonidoException {
		System.out.println(getInstrumentoInterface().sonar());
	}

}
