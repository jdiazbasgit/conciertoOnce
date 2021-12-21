package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.beans.InstrumentoPedro;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.musicos.MusicoPedro;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);

		InstrumentoInterface hang = new InstrumentoPedro("wuon, wan, wuon");

		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);

		MusicoPedro solistaPedro = new MusicoPedro(hang);
		solistaPedro.setInstrumentoInterface(hang);

		solista.tocar();
		solistaPedro.tocar();

	}

}
