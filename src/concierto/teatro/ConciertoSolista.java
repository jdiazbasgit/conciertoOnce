package concierto.teatro;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Solista;






public class ConciertoSolista {

	

	public static void main(String[] args) throws SinSonidoException {


  	// prueba para sara
		

	 
	 Solista solista= new Solista(new Instrumento(new InstrumentoBean("nada")));
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y se ha acabado el concierto");
		}

	
	}

	}




