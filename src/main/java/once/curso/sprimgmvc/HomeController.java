package once.curso.sprimgmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import once.curso.sprimgmvc.beans.Login;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/pagina.somoslosmejores", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView modelAndView) {
		modelAndView.setViewName("home");
		Login login= new Login();
		login.setUsuario("federico");
		modelAndView.addObject("login", login);
		return modelAndView;
	}

	@RequestMapping(value = "algo", method = RequestMethod.GET)
	public String algo(Model model, @RequestParam String texto, @RequestParam String texto2) {

		model.addAttribute("algo", "has escrito " + texto2.toUpperCase() + " y tiene " + texto.length() + " letras");

		return "algo";

	}

	@RequestMapping("pagina.html/{texto}/{texto2}")
	public String algo(Model model, @PathVariable("texto") String nombre, @PathVariable String texto2,
			@RequestParam String primerNombre) {

		model.addAttribute("variable",
				"tu nombre y apellido es " + nombre + " " + texto2 + " y tu primer nombre es " + primerNombre);

		return "algo";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(ModelAndView modelAndView, @RequestParam String usuario, @RequestParam String clave) {

		modelAndView.setViewName("ko");
		if (usuario.equals("pepe") && clave.equals("1234"))
			modelAndView.setViewName("ok");

		return modelAndView;
	}
	
	
	@RequestMapping(value = "loginConObjeto", method = RequestMethod.POST)
	public ModelAndView loginConObjeto(ModelAndView modelAndView, Login login) {
		
		modelAndView.setViewName("ko");
		
		if (login.getUsuario().equals("pepe") && login.getClave().equals("1234"))
			modelAndView.setViewName("ok");
		
		return modelAndView;
	}
}














