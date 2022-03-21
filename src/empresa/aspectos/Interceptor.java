package empresa.aspectos;

import java.sql.SQLException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import empresa.daos.ConexionDAO;
import empresa.daos.DatosPersonalesDao;
import lombok.Data;

@Component
@Aspect
@Data
public class Interceptor {
	
	@Autowired
	private ConexionDAO conexionDAO;
	
	@Pointcut("execution( @empresa.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {}
	
	
	@Around("sujetador()")
	public void ponerConexion(ProceedingJoinPoint joinPoint) {
		DatosPersonalesDao dao= (DatosPersonalesDao) joinPoint.getTarget();
		
		
		try {
			dao.setConexion(getConexionDAO().getConexion());
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				dao.getConexion().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
