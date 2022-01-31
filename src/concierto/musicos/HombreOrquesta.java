package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico {

	public HombreOrquesta(InstrumentoInterface instrumentos) {
		super(instrumentos);
	}










	public HombreOrquesta(Set<InstrumentoInterface> instrumentos) {
super();
	}










	@Override
	public void tocar() throws SinSonidoException {

		for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar()+" - "+instrumento.hashCode());
			System.err.println(instrumento.getInstrumentoBean().getSonido().hashCode()); 
		}
			
		}


}
