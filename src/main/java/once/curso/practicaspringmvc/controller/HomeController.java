package once.curso.practicaspringmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.Data;

@Controller
@Data
public class HomeController {
	
	private int contador;

	@RequestMapping(value="/")
	public ModelAndView crsoOnce(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	 
	
	@RequestMapping(value="/ejercicio/{texto}")
	public ModelAndView cursoOnce(@PathVariable String texto, ModelAndView modelAndView, HttpSession sesion) throws IOException{
		
		modelAndView.setViewName("home");
		modelAndView.addObject("texto", texto);
		
		setContador(getContador()+1);
		modelAndView.addObject("contador", getContador());
		
		if(sesion.getAttribute("visitas")==null)
			sesion.setAttribute("visitas", 1);
		else {
			int visitas= (Integer) sesion.getAttribute("visitas");
			visitas ++;
			sesion.setAttribute("visitas", visitas);
		}
		modelAndView.addObject("visitas", sesion.getAttribute("visitas"));
		return modelAndView;
	}
	
}










