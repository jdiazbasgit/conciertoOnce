package once.curso.parcticaSpringmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		/*
		 * HttpServletRequest request = null; HttpSession sesion =
		 * request.getSession(true);
		 * 
		 * if(sesion.getAttribute("visitas")==null) { sesion.setAttribute("visitas",1);
		 * }else { int visitas = (Integer) sesion.getAttribute("visitas");
		 * sesion.setAttribute("visitas",visitas); }
		 */
	     
		
		
		
		String salida = texto.toUpperCase();
		String salida1 = String.valueOf(texto.length());
		String salida2 =  String.valueOf(getContador());
		String salida3 =  String.valueOf(getContador());

		model.addAttribute("miTexto", salida);
		model.addAttribute("miTexto1", salida1);
		model.addAttribute("miTexto2", salida2);
		model.addAttribute("miTexto3", salida3);
		
		
       	


		return "pagina";

	}

}
