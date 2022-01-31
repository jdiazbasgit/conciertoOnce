/*package concierto.teatro;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoSara;
import concierto.musicos.Solista;






public class ConciertoSolista {

	

	public static void main(String[] args) throws SinSonidoException {


  	// prueba para sara
		
	 InstrumentoInterface instrumentoSara=new InstrumentoSara("sonido de instrumento de Sara");
	 MusicoInterface musicoSara= new MusicoSara(instrumentoSara);
	 musicoSara.tocar();
	 
	 Solista solista= new Solista(new Instrumento(new InstrumentoBean("nada")));
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y se ha acabado el concierto");
		}

	
	}

	}*/




