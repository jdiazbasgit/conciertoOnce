package concierto.teatros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		
		Set<InstrumentoInterface> instrumentos= new HashSet <>();
		InstrumentoInterface tambor=new Instrumento(new InstrumentoBean("cpom,pom,pom"));
		InstrumentoInterface trompeta=new Instrumento(new InstrumentoBean("atuuu, tuuu, tuuu"));
		InstrumentoInterface guitarra=new Instrumento(new InstrumentoBean("cpom,pom,pom"));
		
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		instrumentos.add(tambor);
		instrumentos.add(trompeta);
		instrumentos.add(guitarra);
		
		
		HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
		try {
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			
			
		}
		finally {
			System.out.println("señores gracias por venir a este teatro y esparamos vers de nuevo");
		}
	}

}
