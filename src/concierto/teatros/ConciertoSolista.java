package concierto.teatros;

import concierto.instrumentos.Instrumento;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		Instrumento tambor=new Instrumento();
		tambor.setSonido("pom,pom,pom");
		
		Musico solista=new Musico();
		solista.setInstrumento(tambor);
		
		solista.tocar();

	}

}
