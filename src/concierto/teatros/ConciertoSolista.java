package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		//InstrumentoBean instrumentoBean= new InstrumentoBean("soinido");
		//Instrumento instrumento= new Instrumento(instrumentoBean);
		//Musico solista= new Musico(instrumento);
		
		
		
		Musico solista= new Solista(new Instrumento(new InstrumentoBean("nada")));
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y se ha acabado el concierto");
		}

	}

}
