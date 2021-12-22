package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJavier;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJavier;

public class ConciertoSolista {

	public static void main(String[] args) {

	
		
		
		
		InstrumentoInterface instrumentoJavier = new InstrumentoJavier("sonido de instrumento Javier");
		MusicoInterface musicoJavier = new MusicoJavier(instrumentoJavier);
		musicoJavier.tocar();
		
		Musico solista = new Musico(new Instrumento(new InstrumentoBean("sonido")));
		solista.tocar();

		
		

	}

}
