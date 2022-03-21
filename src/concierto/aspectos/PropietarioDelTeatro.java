package concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import concierto.beans.InstrumentoBeanPapa;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.Tambor;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.Musico;
import concierto.musicos.Solista;

@Component
@Aspect
public class PropietarioDelTeatro {

	@Pointcut("execution( @concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {

	}

	@Around("sujetador()")
	public void hacerTodo(ProceedingJoinPoint joinPoint) {

		Musico musico = (Musico) joinPoint.getTarget();

		try {

			// Before
			System.out.println("SE�ORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO soy el due�o");
			if(musico.getClass().isInstance(new HombreOrquesta())) {
				
				if(musico.getInstrumentosInterface().size()<3) {
					Tambor tambor= new Tambor();
					InstrumentoBeanPapa papa= new InstrumentoBeanPapa();
					papa.setSonido("tambor..........");
					tambor.setInstrumentoBeanPapa(papa);
					musico.getInstrumentosInterface().add(tambor);
				}
			}
			
			joinPoint.proceed();
			System.out.println("SE�ORES EL CONCIERTO HA TERMINADO, PUEDEN ENCENDER LOS MOVILES soy el due�o");
			// AfterReturning
		} catch (Throwable e) {
			System.out.println("SE�ORES SE HA ROTO EL INSTRUMENTO, LO VOY A ARREGLAR");
			if (musico.getClass().isInstance(new Solista())) {
				musico.getInstrumentoInterface().getInstrumentoBeanPapa().setSonido("sonido arreglado por el due�o");
			} else {
				for (Instrumento instrumento : musico.getInstrumentosInterface()) {
					if (instrumento.getInstrumentoBeanPapa().getSonido().equals("nada"))
						instrumento.getInstrumentoBeanPapa()
								.setSonido("sonido arreglado por el due�o en " + instrumento.getClass());
				}
			}
			System.out.println("SE�ORES LOS INSTRUMENTOS SE HAN ARREGLADO, CONTINUAMOS EL CONCIERTO");
			try {
				musico.tocar();
			} catch (SinSonidoException e1) {
				
			}
			// AfterThrowiong
		} finally {
			// After
		}

	}

}
