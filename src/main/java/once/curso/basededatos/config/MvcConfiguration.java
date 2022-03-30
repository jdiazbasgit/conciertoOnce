package once.curso.basededatos.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import empresa.dao.TipoCarnetDao;

@SpringBootConfiguration
@ComponentScan(basePackages="once.curso.basededatos")
@EnableWebMvc


	public class MvcConfiguration extends WebMvcConfigurerAdapter{

		@Bean
		public 	TipoCarnetDao getCarnetDao(){
			TipoCarnetDao tipoCarnetDao = new TipoCarnetDao();
			
			return tipoCarnetDao;
		}
	
	
		
	}
