package concierto.aspectos;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class TrazaMusico {
	
	
	@Pointcut("execution( @concierto.anotaciones.Traza * *.*(..))")
	public void sujetador() {
		
	}
	@AfterThrowing ("sujetador()")
	public void Mensaje() {
		System.err.println("Esto no funciona");
	}
	
	
}
