package concierto.musicos;



import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico {

	public HombreOrquesta(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
	}

	
	public void tocar11() throws SinSonidoException {

		for (int i = 0; i < getInstrumentosInterface().length; i++) {
			//if (getInstrumentosInterface()[i].sonar().length() <512) {
				System.out.println(getInstrumentosInterface()[i].sonar());
			//}
		}

		/*
		 * for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
		 * System.out.println(instrumento.sonar()); }
		 */

		/*
		 * List.of(getInstrumentosInterface()).stream().filter(i->i.sonar().length()>12)
		 * .forEach(instrumento->{ System.out.println(instrumento.sonar()); });
		 */
	}


	@Override
	public void tocar() throws SinSonidoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void tocar1() throws SinSonidoException {
		// TODO Auto-generated method stub
		
	}

	

	
	}