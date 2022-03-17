package concierto.teatros;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {	
		
		Map<String,InstrumentoBean> coleccion= new HashMap<>();
		
		coleccion.put("tambor",new InstrumentoBean("pom, pom, pom","honner",50));
		coleccion.put("trompeta", new InstrumentoBean("tuuu, tuuu, tuuu","honner",500));
		coleccion.put("guitarra",new InstrumentoBean("tlan, tlan, tlan","honner",1000));
		
		for (String nombre : coleccion.keySet()) {
			System.out.println(nombre+ " - "+coleccion.get(nombre).getPrecio());
		}
		
		
		
		
		
		Set<Instrumento> instrumentos= new TreeSet <>();
		Instrumento guitarra=new Instrumento(new InstrumentoBean("apom,pom,pom"));
	
		Instrumento trompeta=new Instrumento(new InstrumentoBean("apom,pom,pom"));
		
		Instrumento tambor=new Instrumento(new InstrumentoBean("cpom,pom,pom"));
		
		
		instrumentos.add(trompeta);
		instrumentos.add(tambor);
		
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
