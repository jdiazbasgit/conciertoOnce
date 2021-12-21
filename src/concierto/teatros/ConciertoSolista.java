package concierto.teatros;

import java.util.Iterator;

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

		InstrumentoPedro instrumentoPedroHang = new InstrumentoPedro();
		instrumentoPedroHang.setSonido("wuon, wan, wuon");
		InstrumentoInterface hang = new InstrumentoPedro(instrumentoPedroHang);

		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);

		MusicoPedro solistaPedro = new MusicoPedro(hang);
		solistaPedro.setInstrumentoInterface(hang);

		solista.tocar();

	}

}
