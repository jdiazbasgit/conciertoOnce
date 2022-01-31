package concierto.teatro;

import java.util.Set;
import java.util.TreeSet;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		
		
	
		
		Set<InstrumentoInterface >instrumentos= new TreeSet<>();
		InstrumentoInterface tambor=new Instrumento(new InstrumentoBean("ctlan,tlan,tlan"));
		InstrumentoInterface trompeta=new Instrumento(new InstrumentoBean("atuuu, tuuu, tuuu"));
		InstrumentoInterface guitarra=new Instrumento(new InstrumentoBean("pom,pom,pom"));
		
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


