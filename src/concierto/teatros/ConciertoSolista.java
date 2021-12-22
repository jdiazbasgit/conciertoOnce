package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSara;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoSara;






public class ConciertoSolista {

	

	public static void main(String[] args)  {


   

    
		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean("sonido");

		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);

	
		
		
	
		

		
	

		
		

		

	
    
	
		// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
	 MusicoSara Solista= new MusicoSara (new InstrumentoSara("pom,pom,pom"));

Solista.tocar();

	


	}

}


