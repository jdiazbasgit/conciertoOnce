package concierto.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import concierto.beans.InstrumentoBeanPapa;
import concierto.instrumentos.Guitarra;
import concierto.instrumentos.Trompeta;

@Configuration
@ComponentScan("concierto")
@EnableAspectJAutoProxy
public class Configuracion {
	
	
	@Bean
	public Trompeta trompeta(Guitarra guitarra) {
		Trompeta trompeta= new Trompeta();
		//System.err.println(guitarra.getInstrumentoBeanPapa().getSonido());
		InstrumentoBeanPapa instrumentoBeanPapa= new InstrumentoBeanPapa(guitarra.getInstrumentoBeanPapa().getSonido());
		trompeta.setInstrumentoBeanPapa(instrumentoBeanPapa);
		return trompeta;
	}

}
