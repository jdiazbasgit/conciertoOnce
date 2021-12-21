package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoPedro;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoPedro;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);

		InstrumentoInterface hang = new InstrumentoPedro("wuon, wan, wuon");
		MusicoInterface solistaPedro = new MusicoPedro(hang);

		solista.tocar();
		solistaPedro.tocar();

	}

}
