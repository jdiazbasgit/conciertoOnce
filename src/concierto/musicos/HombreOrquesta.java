package concierto.musicos;

import java.util.List;

import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico {

	public HombreOrquesta(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
		
	}

	@Override
	public void tocar() {
		
		for (int i = 0; i < getInstrumentosInterface().length; i++) {
			System.out.println(getInstrumentosInterface()[i].sonar());
		}
		/*	for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
		System.out.println(instrumento.sonar()); 
	}*/
	/*List.of(getInstrumentosInterface()).stream().filter(i->i.sonar().length()>12).forEach(instrumento->{
		System.out.println(instrumento.sonar());
	});*/
		
	}
	

	}


