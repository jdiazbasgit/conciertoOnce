package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Scope("prototype")
public class InstrumentoBeanTrompeta extends InstrumentoBeanPapa {

	@Value("tuuu, tuuu, tuuu en anotaciones")
	@Override
		public void setSonido(String sonido) {
			// TODO Auto-generated method stub
			super.setSonido(sonido);
		}
}
