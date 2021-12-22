package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJacinto;
import concierto.instrumentos.InstrumentoSara;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoSara;

public class ConciertoSolista {

	

	public static void main(String[] args)  {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean("pom, pom, pom", "nueva marca", 500);
		InstrumentoInterface tambor = new InstrumentoJacinto(instrumentoBeanTambor);
		MusicoJacinto jacinto = new MusicoJacinto(tambor);
		jacinto.setInstrumentoInterface(tambor);
		MusicoJavier solista = new MusicoJavier(tambor);
		solista.setInstrumentoInterface(tambor);

		jacinto.tocar();
		// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
	 MusicoSara Solista= new MusicoSara (new InstrumentoSara("pom,pom,pom"));
}
}