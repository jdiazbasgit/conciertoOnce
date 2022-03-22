package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Scope("prototype")
public class InstrumentoBeanTrompeta extends InstrumentoBeanPapa {

	@Value("nada")
	@Override
		public void setSonido(String sonido) {
			super.setSonido(sonido);
		}
}
