package once.curso.practicaspringmvc.config;

import java.sql.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import empresa.beans.Vehiculo;
import empresa.daos.EmpresaDAO;
import empresa.daos.VehiculoDao;

@Configuration
@ComponentScan(basePackages="once.curso.practicaspringmvc")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	Connection conexion = null;
	@Bean
	public Connection getempresaDAO() {
		EmpresaDAO empresaDAO= new EmpresaDAO();
		conexion = empresaDAO.getConexion();
	return conexion;	
	
	}
	
	@Bean
	public Vehiculo getVehiculo() {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	
}











