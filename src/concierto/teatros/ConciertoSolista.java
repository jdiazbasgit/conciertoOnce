package concierto.teatros;

import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSara;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoSara;






public class ConciertoSolista {

	

	public static void main(String[] args)  {


   

    
		

	
		
		
	
		

		
	

		
		

		

	
    
	
		// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
	 MusicoSara Solista= new MusicoSara (new InstrumentoSara("pom,pom,pom"));

Solista.tocar();

	


	}

}


