package concierto.teatros;



import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.instrumentos.InstrumentoAntonio;
import concierto.musicos.MusicoAntonio;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		
		//mi musico
		
		InstrumentoBean instrumentoBeanAntonio = new InstrumentoBean();
		instrumentoBeanAntonio.getSonido("Soy el instrumento que toca Antonio");
		InstrumentoInterface antonio = new InstrumentoAntonio(instrumentoBeanAntonio);
		
		MusicoAntonio solistsAntonio = new MusicoAntonio(antonio);
		solistaAntonio.setInstrumentoInterface(solistaAntonio);

		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);

		solista.tocar();
		solistaAntonio.tocar();
		

		

	}

}
