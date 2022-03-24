package once.curso.practicaspringmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.Data;

@Data
@Controller
public class HomeController {
	private int contador;
	@RequestMapping(value = "/")
	public ModelAndView practicaMVC(HttpServletResponse response) throws IOException {

		return new ModelAndView("home");
	}

	@RequestMapping(value = "/ejercicio/{texto}")
	public ModelAndView cursoOnce(HttpSession sesion, ModelAndView modelAndView, @PathVariable String texto)throws IOException {

		modelAndView.setViewName("home");
		modelAndView.addObject("texto", texto);
//		modelAndView.addAllObjects();
		setContador(getContador()+1);
		modelAndView.addObject("contador",getContador());
		if (sesion.getAttribute("visitas")==null)
			sesion.setAttribute("visitas",1);
			else {
				int visitas= (Integer) sesion.getAttribute("visitas");
			}
		modelAndView.addObject("visitas", sesion.getAttribute("visitas"));
		return modelAndView;
	}

}
