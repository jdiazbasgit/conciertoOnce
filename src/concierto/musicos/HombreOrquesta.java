package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;


public class HombreOrquesta extends Musico {

	public HombreOrquesta(Set<Instrumento> instrumentosInterface) {
		super(instrumentosInterface);
	}

	public HombreOrquesta(Instrumento[] instrumentos) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() throws SinSonidoException {
		
	


		for (Instrumento instrumento : getInstrumentos()) {
			System.out.println(instrumento.sonar()+" - "+instrumento.hashCode());
			//System.err.println(instrumento.getInstrumentoBean().getSonido().hashCode());
		}
	}

}
