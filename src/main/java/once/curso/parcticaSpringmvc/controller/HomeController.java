package once.curso.parcticaSpringmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import lombok.Data;


@Data
@Controller
public class HomeController {

	private int contador;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "pagina", method = RequestMethod.GET)
	public String algo(Model model, @RequestParam String texto) {
		setContador(getContador()+1);	
		String salida = "<h1 style='color:green' >Has escrito " + texto.toUpperCase() + " y tiene " + texto.length() + " letras</h1>";
		
		/*
		 * model.addAttribute("miTexto","has escrito " + texto.toUpperCase() +
		 * " y tiene " + texto.length() +" letras");
		 */
		model.addAttribute("miTexto", salida);
		
       	


		return "pagina";

	}

}
