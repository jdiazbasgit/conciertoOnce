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
			System.out.println("SE�ORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO, Soy el due�o");
			joinPoint.proceed();
			System.out.println("SE�ORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES, Soy el due�o");
//			AfterReturning
		} catch (Throwable e) {
//			AfterThrowing
			e.printStackTrace();
		} finally {
//			After
			System.out.println("SE�ORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES, Soy el due�o y punto");
		}
	}

}
