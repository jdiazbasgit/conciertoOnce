package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSara;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoSara;
import concierto.musicos.Solista;






public class ConciertoSolista {

	

	public static void main(String[] args)  {


  	// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
 Solista Solista= new Solista (new Instrumento(new InstrumentoBean("sonido")));

Solista.tocar();

	


	}

}


