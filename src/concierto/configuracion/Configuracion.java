package concierto.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import concierto.beans.InstrumentoBeanPapa;
import concierto.instrumentos.Trompeta;

@ComponentScan("concierto")
@Configuration
@EnableAspectJAutoProxy
public class Configuracion {
	@Bean
	public Trompeta getTrompeta() {
		Trompeta trompeta= new Trompeta();
		InstrumentoBeanPapa instrumentoBeanPapa= new InstrumentoBeanPapa("sonido trompeta clase Configuracion");
		trompeta.setInstrumentoBeanPapa(instrumentoBeanPapa);
		return trompeta;
	}

}
