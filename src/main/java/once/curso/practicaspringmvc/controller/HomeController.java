package once.curso.practicaspringmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
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

	@RequestMapping(value = "/ejercicio/{texto}")
	public ModelAndView textos(@PathVariable String texto, ModelAndView modelAndView, HttpSession sesion) {
		modelAndView.setViewName("home");

		modelAndView.addObject("texto", texto);
		setContador(getContador() + 1);
		modelAndView.addObject("contador", contador);

		if (sesion.getAttribute("visitas") == null) {
			sesion.setAttribute("visitas", 1);

		} else {

			int visitas = (Integer) sesion.getAttribute("visitas");
			visitas++;
			sesion.setAttribute("visitas", visitas);

		}
		modelAndView.addObject("visitas", sesion.getAttribute("visitas"));

		return modelAndView;
	}
}
