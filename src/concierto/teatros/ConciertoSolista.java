package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBean = new InstrumentoBean();
		instrumentoBean.setSonido("pom, pom ,pom en bean");
		instrumentoBean.setMarca("nueva marca");
		instrumentoBean.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBean);

		InstrumentoBean instrumentoBean1 = new InstrumentoBean();
		instrumentoBean1.setSonido("blum, blum");
		InstrumentoInterface guitarra = new Instrumento(instrumentoBean1);

		InstrumentoBean instrumentoBean2 = new InstrumentoBean();
		instrumentoBean2.setSonido("fumm, fumm");
		InstrumentoInterface trompeta = new Instrumento(instrumentoBean2);

		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista = new Musico();
		Musico solista1 = new Musico();
		Musico solista2 = new Musico();

		solista.setInstrumentoInterface(tambor);
		solista1.setInstrumentoInterface(guitarra);
		solista2.setInstrumentoInterface(trompeta);

		solista.tocar();
		solista1.tocar();
		solista2.tocar();

	}

}
