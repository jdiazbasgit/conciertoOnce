package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.musicos.MusicoJuan;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		instrumentoBeanTambor.setMarca("nueva marca");
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		
		InstrumentoBean instrumentoBeanJuan = new InstrumentoBean();
		instrumentoBeanJuan.setSonido("Juan, Juan, Juan");
		InstrumentoInterface juan = new Instrumento(instrumentoBeanJuan);
		

		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);
		MusicoJuan musicoJuan = new MusicoJuan(juan);
		musicoJuan.setInstrumentoInterface(juan);

		solista.tocar();
		musicoJuan.tocar();
		
		//asjdfkljasdlkfjaslk

	}

}
