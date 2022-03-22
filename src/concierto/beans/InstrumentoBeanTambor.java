package concierto.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanTambor extends InstrumentoBeanPapa{

	

	@Value("pom, pom, pom en anotaciones")
	@Override
		public void setSonido(String sonido) {
			// TODO Auto-generated method stub
			super.setSonido(sonido);
		}
}
