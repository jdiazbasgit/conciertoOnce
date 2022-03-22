package concierto.aspectos;

import org.aopalliance.intercept.Joinpoint;
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

	@Pointcut("execution( @concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {
	}

	@Around("sujetador()")
	public void hacerTodo(ProceedingJoinPoint Joinpoint) {

		Musico musico = (Musico) Joinpoint.getTarget();

		try {
			//before
			System.out.println("SEÑORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO soy el dueño");
			
			Joinpoint.proceed();
			System.out.println("SEÑORES EL CONCIERTO HA TERMINADO, PUEDEN ENCENDER LOS MOVILES soy el dueño");
			//AfterReturning
		} catch (Throwable e) {

			if (musico.getClass().isInstance(new Solista())) {
				musico.getInstrumentoInterface().getInstrumentoBeanPapa().setSonido("sonido areglado por el dueño");
			} else {
				for (Instrumento instrumento : musico.getInstrumentosInterface()) {
					if (instrumento.getInstrumentoBeanPapa().getSonido().equals("nada"))
						instrumento.getInstrumentoBeanPapa()
								.setSonido("Sonido arreglado por el dueño en " + instrumento.getClass());
				}
			}
			System.out.println("SEÑORES LOS INSTRUMENTO SE HAN ARRGLADO, CONTINUAMOS EL CONCIERTO");

			try {
				musico.tocar();
			} catch (SinSonidoException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			} 
			//throw e;
			//finally {
				//After
		}
	}
}