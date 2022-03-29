package once.curso.practicarest2.config;

import java.sql.Connection;
import java.sql.SQLException;

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
	public VehiculoDao vehiculoDao() {
		return new VehiculoDao();
	}

	
}











