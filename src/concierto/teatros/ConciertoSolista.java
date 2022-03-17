package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJavier;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

	
		
		
		
		/*InstrumentoInterface instrumentoJavier = new InstrumentoJavier("sonido de instrumento Javier");
		MusicoInterface musicoJavier = new MusicoJavier(instrumentoJavier);
		musicoJavier.tocar();*/
		
		Solista solista = new Solista(new Instrumento(new InstrumentoBean("nada")));
		Solista solista1 = new Solista(new Instrumento(new InstrumentoBean("blam blam")));
		Solista solista2 = new Solista(new Instrumento(new InstrumentoBean("blum blum")));
		Solista solista3 = new Solista(new Instrumento(new InstrumentoBean("fuaa")));
		Solista solista4 = new Solista(new Instrumento(new InstrumentoBean("plim")));
		Solista solista5 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista6 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista7 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista8 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		Solista solista9 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
		
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			// TODO Auto-generated catch block
			System.out.println("Señores el instrumento se ha roto y se ha acabado el concieto");
		}
		
		
		

	}

}
