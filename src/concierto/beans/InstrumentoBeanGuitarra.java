package concierto.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InstrumentoBeanGuitarra extends InstrumentoBeanPapa{


	@Value("tlan, tlan, tylan en anotaciones")
	@Override
		public void setSonido(String sonido) {
			// TODO Auto-generated method stub
			super.setSonido(sonido);
		}
	

	

}
