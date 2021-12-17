package concierto.teatros;
//

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {
		

		
		InstrumentoBean instrumentoBean= new InstrumentoBean();
		instrumentoBean.setSonido("pom, pom, pom");
		instrumentoBean.setMarca("nueva marca");
		instrumentoBean.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBean);
		//tambor.setInstrumentoBean(instrumentoBean);
		
		Musico solista= new Musico();
		solista.setInstrumentoInterface(tambor);
		
		InstrumentoBean instrumentoBeanGuitarra = new InstrumentoBean();
		instrumentoBeanGuitarra.setSonido("trin, trin, trin");
		InstrumentoInterface guitarra = new Instrumento(instrumentoBeanGuitarra);
		
		Musico solistaGuitarra= new Musico();
		solistaGuitarra.setInstrumentoInterface(guitarra);
		
		InstrumentoBean instrumentoBeanTromba = new InstrumentoBean();
		instrumentoBeanTromba.setSonido("bum, bum, bum");
		InstrumentoInterface tromba = new Instrumento (instrumentoBeanTromba);
		
		Musico solistaTromba =new Musico();
		solistaTromba.setInstrumentoInterface(tromba);
		
		solista.tocar();
        solistaGuitarra.tocarGuitarra();
        solistaTromba.tocarTromba();
	}

}
