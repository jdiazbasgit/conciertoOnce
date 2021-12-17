package concierto.teatros;

import concierto.instrumentos.Instrumento;
import concierto.musicos.Musico;

public class ConciertoSolista {

	
	public static void main(String[] args) {
		
		Instrumento tambor= new Instrumento();
		tambor.setSonido("pom, pom, pom");
		Musico solista= new Musico();
		solista.setInstrumento(tambor);
		
		solista.tocar();
		
		Instrumento guitarra= new Instrumento();
		guitarra.setSonido("tran, tran, tran");
		Musico solista1= new Musico();
		solista1.setInstrumento(guitarra);
		
		solista1.tocar();
		
		Instrumento piano= new Instrumento();
		piano.setSonido("la, la, la");
		Musico solista2= new Musico();
		solista2.setInstrumento(piano);
		
		solista2.tocar();
		
		
	
	
	
	
	}

}
