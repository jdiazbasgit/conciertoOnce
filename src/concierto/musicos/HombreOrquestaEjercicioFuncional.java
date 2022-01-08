package concierto.musicos;

import java.util.List;

import concierto.instrumentos.Instrumento;

public class HombreOrquestaEjercicioFuncional extends Musico {

	public HombreOrquestaEjercicioFuncional(Instrumento instrumento) {
		super(instrumento);
		
	}

	@Override
	public void tocar() {
		
		 List.of(getInstrumentosInterface()).stream().filter(i->i.sonar().length()>12)
		 .forEach(instrumento->{ System.out.println(instrumento.sonar()); });
		 
	}}