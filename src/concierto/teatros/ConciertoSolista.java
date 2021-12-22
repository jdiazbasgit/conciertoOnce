package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		//InstrumentoBean instrumentoBean= new InstrumentoBean("soinido");
		//Instrumento instrumento= new Instrumento(instrumentoBean);
		//Musico solista= new Musico(instrumento);
		
		
		
		Solista solista= new Solista(new Instrumento(new InstrumentoBean("sonido")));
		solista.tocar();

	}

}
