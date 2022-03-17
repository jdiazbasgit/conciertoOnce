package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HombreOrquesta extends Musico {
	
	
	public HombreOrquesta() {
	
	}
	
	@Override
	@Autowired
	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		// TODO Auto-generated method stub
		super.setInstrumentosInterface(instrumentosInterface);
	}
	

	public HombreOrquesta(Set<Instrumento> instrumentosInterface) {
		super(instrumentosInterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() throws SinSonidoException {
		for (Instrumento instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar()+" - "+instrumento.hashCode());
			//System.err.println(instrumento.getInstrumentoBean().getSonido().hashCode());
		}
	}

}
