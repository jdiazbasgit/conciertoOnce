package concierto.musicos;


import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico {

	public HombreOrquesta(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
		
	}

	@Override
	public void tocar() throws SinSonidoException {
		
		for (int i = 0; i < getInstrumentosInterface().length; i++) {
			System.out.println(getInstrumentosInterface()[i].sonar());
		}
	/*		for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
		System.out.println(instrumento.sonar()); 
	}*/
	/*List.of(getInstrumentosInterface()).stream().filter(i->i.sonar().length()>1).forEach(instrumento->{
		System.out.println(instrumento.sonar());
	});*/
		
	}
	

	}


