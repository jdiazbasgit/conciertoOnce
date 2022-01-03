package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico implements MusicoInterface {

	public HombreOrquesta(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);

	}

	@Override
	public void tocar() {
		for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar());
		
		/*List.of(getInstrumentoInterface()).stream().forEach(instrumento->
		{System.out.println(instrumento.sonar());
		
		});*/

	}

}
}
