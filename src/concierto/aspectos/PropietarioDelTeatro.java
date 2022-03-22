package concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Musico;
import concierto.musicos.Solista;

@Component
@Aspect
public class PropietarioDelTeatro {

	@Pointcut("execution(@concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {

	}

	@Around("sujetador()")
	public void hacerTodo(ProceedingJoinPoint joinPoint) throws Throwable {

		Musico musico = (Musico) joinPoint.getTarget();
		try {
			System.out.println("SE�ORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO, SOY EL DUE�O");
			joinPoint.proceed();
			System.out.println("SE�ORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES, SOY EL DUE�O");

		} catch (Throwable e) {
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
			throw e;
		} finally {

		}
	}
}
