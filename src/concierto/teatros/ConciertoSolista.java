package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.MusicoGuitarra;
import concierto.musicos.MusicoTambor;
import concierto.musicos.MusicoTromba;

public class ConciertoSolista {

	public static void main(String[] args) {
		

		
		InstrumentoBean instrumentoBean= new InstrumentoBean();
		instrumentoBean.setSonido("pom, pom ,pom en bean");
		instrumentoBean.setMarca("nueva marca");
		instrumentoBean.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBean);
		//tambor.setInstrumentoBean(instrumentoBean);
		
		MusicoTambor solista= new MusicoTambor();
		solista.setInstrumentoInterface(tambor);
		
		InstrumentoBean instrumentoBeanGuitarra= new InstrumentoBean();
		instrumentoBeanGuitarra.setSonido("clit,clit,clit");
		InstrumentoInterface guitarra = new Instrumento(instrumentoBeanGuitarra);
		
		MusicoGuitarra solistaGuitarra = new MusicoGuitarra();
		solistaGuitarra.setInstrumentoInterface(guitarra);
		
		InstrumentoBean instrumentoBeanTromba= new InstrumentoBean();
		instrumentoBeanTromba.setSonido("porron,porron,porron");
		InstrumentoInterface tromba = new Instrumento(instrumentoBeanTromba);
		
		MusicoTromba solistaTromba = new MusicoTromba();
		solistaTromba.setInstrumentoInterface(tromba);
		
		
		solista.tocar();
		solistaGuitarra.tocarGuitarra();
		solistaTromba.tocarTromba();

	}

}
