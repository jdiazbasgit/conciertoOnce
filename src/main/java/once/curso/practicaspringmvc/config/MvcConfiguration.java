package once.curso.practicaspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import empresa.daos.ConexionDAO;
import empresa.daos.DatosPersonalesDao;
import empresa.daos.EmpresaDAO;
import empresa.daos.HijoDAO;
import empresa.daos.TipoCarnetDao;
import empresa.daos.VehiculoDao;

@Configuration
@ComponentScan(basePackages = "once.curso.practicaspringmvc")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public ConexionDAO getConexionDAO() {
		return new ConexionDAO();
	}

	@Bean
	public VehiculoDao getVehiculo() {
		return new VehiculoDao();
	}

	@Bean
	public TipoCarnetDao getTipoCarnetDao() {
		return new TipoCarnetDao();
	}
	
	@Bean
	public HijoDAO gethiHijoDAO() {
		return new HijoDAO();
	}
	
	@Bean
	public EmpresaDAO getEmpresaDAO() {
		return new EmpresaDAO();	
		}
	
	@Bean
	public DatosPersonalesDao getdaDatosPersonalesDao() {
		return new DatosPersonalesDao();
	}
	
	
	@Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
