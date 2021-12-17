package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.beans.InstrumentoBeanDos;
import concierto.beans.InstrumentoBeanTres;
import concierto.instrumentos.InstrumentoUno;
import concierto.instrumentos.InstrumentoDos;
import concierto.instrumentos.InstrumentoTres;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.MusicoUno;
import concierto.musicos.MusicoDos;
import concierto.musicos.MusicoTres;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBean = new InstrumentoBean();
		instrumentoBean.setSonido("pom, pom ,pom");

		InstrumentoInterface tambor = new InstrumentoUno(instrumentoBean);

		MusicoUno solistaUno = new MusicoUno();
		solistaUno.setInstrumentoInterface(tambor);

		solistaUno.tocar();

		InstrumentoBeanDos instrumentoBeanDos = new InstrumentoBeanDos();
		instrumentoBeanDos.setSonido("turu, turu, turu");

		InstrumentoInterface trompeta = new InstrumentoDos(instrumentoBeanDos);

		MusicoDos solistaDos = new MusicoDos();
		solistaDos.setInstrumentoInterface(trompeta);

		solistaDos.tocar();

		InstrumentoBeanTres instrumentoBeanTres = new InstrumentoBeanTres();
		instrumentoBeanTres.setSonido("tilin, tilin, tilin");

		InstrumentoInterface triangulo = new InstrumentoTres(instrumentoBeanTres);

		MusicoTres solistaTres = new MusicoTres();
		solistaTres.setInstrumentoInterface(triangulo);

		solistaTres.tocar();

	}

}
