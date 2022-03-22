package concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TrazaExcepcion {
	
	
	@Pointcut("execution( @concierto.anotaciones.Traza * *.*(..))")
	public void sujetador() {
		
	}
	
	
	@AfterThrowing("sujetador()")
	public void excepcion() {
		System.out.println("TRAZA");
	}
	
}
