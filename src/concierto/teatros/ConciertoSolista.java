package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {
		

		
		InstrumentoBean instrumentoBean= new InstrumentoBean();
		instrumentoBean.setSonido("pom, pom ,pom en bean");
		instrumentoBean.setMarca("nueva marca");
		instrumentoBean.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBean);
		//tambor.setInstrumentoBean(instrumentoBean);
		
		Musico solista= new Musico();
		solista.setInstrumentoInterface(tambor);
		
		solista.tocar();

	}

}
