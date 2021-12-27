package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJavier;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJavier;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

	
		
		
		
		/*InstrumentoInterface instrumentoJavier = new InstrumentoJavier("sonido de instrumento Javier");
		MusicoInterface musicoJavier = new MusicoJavier(instrumentoJavier);
		musicoJavier.tocar();*/
		
		Solista solista = new Solista(new Instrumento(new InstrumentoBean("pom,pom")));
		Solista solista1 = new Solista(new Instrumento(new InstrumentoBean("blam blam")));
		Solista solista2 = new Solista(new Instrumento(new InstrumentoBean("blum blum")));
		Solista solista3 = new Solista(new Instrumento(new InstrumentoBean("fuaa")));
		Solista solista4 = new Solista(new Instrumento(new InstrumentoBean("plim")));
		Solista solista5 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista6 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista7 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista8 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista9 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		
		solista.tocar();
		solista1.tocar();
		solista2.tocar();
		solista3.tocar();
		solista4.tocar();
		solista5.tocar();
		solista6.tocar();
		solista7.tocar();
		solista8.tocar();
		solista9.tocar();

		
		

	}

}
