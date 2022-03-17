package concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

@Component
public class HombreOrquesta extends Musico {

	
	public HombreOrquesta(Set<Instrumento> instrumentosInterface) {
		super(instrumentosInterface);
	}
	
	public HombreOrquesta() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Autowired
	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		// TODO Auto-generated method stub
		super.setInstrumentosInterface(instrumentosInterface);
	}

	@Override
	public void tocar() throws SinSonidoException {

		for (Instrumento instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar()+" - "+instrumento.hashCode());
			//System.err.println(instrumento.getInstrumentoBean().getSonido().hashCode());
		}
	}

}
