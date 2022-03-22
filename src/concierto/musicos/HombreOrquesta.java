package concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Vigilado;
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
	@Qualifier("tocameAMi")
	
	
	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		// TODO Auto-generated method stub
		super.setInstrumentosInterface(instrumentosInterface);
	}

	@Override
	@Vigilado
	public void tocar() throws SinSonidoException {

		for (Instrumento instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar()+" - "+instrumento.getInstrumentoBeanPapa().hashCode());
			//System.err.println(instrumento.getInstrumentoBean().getSonido().hashCode());
		}
	}

}