package proyecto.ventanaglobal;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import empresa.beans.DatosPersonales;
import empresa.daos.DatosPersonalsDaoInterface;

public class EjecutarAspecto {

	public static void main(String[] args) {
		ApplicationContext habitacion= new ClassPathXmlApplicationContext("spring.xml");
		DatosPersonalsDaoInterface dao= (DatosPersonalsDaoInterface	) habitacion.getBean("datosPersonalesDao");
		
		try {
			List<DatosPersonales> datosPersonales= dao.dameDatosPersonales();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
