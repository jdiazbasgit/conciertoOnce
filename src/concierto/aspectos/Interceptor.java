package concierto.aspectos;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Interceptor {

	@Pointcut("execution(@concierto.anotaciones.Traza * *.*(..))")
	public void sujetador() {

	}
	
	@AfterThrowing ("sujetador()")
	public void escribirLog() {
		System.err.println("entrada de excepción en log");
	}
	
	
}
