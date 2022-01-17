package concierto.musicos;

import java.util.List;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaEjercicioFuncional extends Musico {

	

	public HombreOrquestaEjercicioFuncional(InstrumentoInterface instrumentoInterface) {
		super(instrumentoInterface);
		// TODO Auto-generated constructor stub
	}

	public HombreOrquestaEjercicioFuncional(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		
		 List.of(getInstrumentosInterface()).stream().filter(i->{
			try {
				return i.sonar().length()>5;
			} catch (SinSonidoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		})
		 .forEach(instrumento->{ try {
			System.out.println(instrumento.sonar());
		} catch (SinSonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} });
		 
	}

	@Override
	public void tocar1() throws SinSonidoException {
		// TODO Auto-generated method stub
		
	}}