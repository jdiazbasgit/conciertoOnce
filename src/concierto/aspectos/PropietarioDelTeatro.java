package concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PropietarioDelTeatro {

	@Pointcut("execution( @concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {

	}

	@Around("sujetador()")
	public void hacerTodo(ProceedingJoinPoint joinPoint) {
		try {
//			Before
			System.out.println("SEÑORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO, Soy el dueño");
			joinPoint.proceed();
			System.out.println("SEÑORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES, Soy el dueño");
//			AfterReturning
		} catch (Throwable e) {
//			AfterThrowing
			e.printStackTrace();
		} finally {
//			After
			System.out.println("SEÑORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES, Soy el dueño y punto");
		}
	}

}
