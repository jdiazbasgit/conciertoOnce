package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;

import concierto.instrumentos.InstrumentoAlmu2;

import concierto.instrumentos.InstrumentoHortensia;



import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoMar;

import concierto.musicos.MusicoMar;
import concierto.beans.InstrumentoBean;
import concierto.musicos.Musico;

import concierto.instrumentos.InstrumentoAntonio;
import concierto.musicos.MusicoAntonio;

import concierto.musicos.MusicoAlmu2;
import concierto.musicos.MusicoInterface;

import concierto.musicos.MusicoHortensia;

import concierto.musicos.MusicoCarlos;

import concierto.instrumentos.InstrumentoJacinto;

import concierto.instrumentos.InstrumentoSara;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoSara;

import concierto.instrumentos.InstrumentoMiguelAngel;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoMiguelAngel;

import concierto.instrumentos.InstrumentoRicardo;
import concierto.musicos.MusicoRicardo;
import concierto.musicos.MusicoJuan;
import concierto.instrumentos.InstrumentoJavier;
import concierto.musicos.MusicoProfe;

import concierto.




public class ConciertoSolista {

	

	public static void main(String[] args)  {


   

    
		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();

		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);

	
		
		
	
		Musico solista = new Musico(tambor);

		
	

		
		

		

	
    
	
		// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
	 MusicoSara Solista= new MusicoSara (new InstrumentoSara("pom,pom,pom"));







		solista.tocar();

	


	}

}


