package once.curso.sprimgmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import beans.Login;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  home(ModelAndView modelAndView) {
		modelAndView.setViewName("home");
		modelAndView.addObject("login", new Login());
		return modelAndView ;
	}
/*	
	// Si mando a la vista un objeto con datos en sus propiedades,
	// se muestra en el formulario los campos rellenos
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  home(ModelAndView modelAndView) {
		modelAndView.setViewName("home");
		Login login = new Login();
		login.setUsuario("Federico");
		modelAndView.addObject("login", new Login());
		return modelAndView ;
	}
*/
	/*
	 * @RequestMapping(value = "algo", method = RequestMethod.GET) public String
	 * algo(Model model, HttpServletRequest request) { String texto =
	 * request.getParameter("texto").toUpperCase(); model.addAttribute("algo",
	 * "has escrito " + texto + " y tiene " + texto.length() + " letras"); return
	 * "algo";
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("algo") public String algo(Model
	 * model, @RequestParam("texto") String miVariable, @RequestParam String texto2)
	 * { model.addAttribute("miVariable", miVariable); model.addAttribute("algo",
	 * "has escrito " + texto2 + " y tiene " + texto2.length() + " letras"); return
	 * "algo"; }
	 */

	/*
	 * @RequestMapping("algo/{texto}/{texto2}") public String algo(Model
	 * model, @PathVariable("texto") String nombre, @PathVariable String texto2) {
	 * model.addAttribute("variable", "tu nombre y apellido es => " + nombre + " " +
	 * texto2); return "algo"; }
	 */

	@RequestMapping("algo/{texto}/{texto2}")
	public String algo(Model model, @PathVariable("texto") String nombre, @PathVariable String texto2,
			@RequestParam String primerNombre) {
		model.addAttribute("variable",
				"tu nombre y apellido es => " + nombre + " " + texto2 + "y tu primer nombre es  => " + primerNombre);
		return "algo";
	}
/*	
	@RequestMapping(value = "algo", method = RequestMethod.Post)
	public ModelAndView login(ModelAndView modelAndView,@RequestParam String usuario,@RequestParam String clave) {
		modelAndView.setViewName("ko");
		if(usuario.equals("pepe") && clave.equals("1234")
				modelAndView.setViewName("ok");
		
		return modelAndView;
	}
	@RequestMapping(value ="login", method = RequestMethod.POST)
	public ModelAndView  home(ModelAndView modelAndView, Login login) {
		modelAndView.setViewName("ok");
				if(usuario.equals("pepe") && clave.equals("1234")
						modelAndView.setViewName("ok");
		return modelAndView ;
	}
	@RequestMapping(value = "loginConObjeto", method = RequestMethod.POST)
	public ModelAndView  home(ModelAndView modelAndView, lOGIN LOGIN) {
		modelAndView.setViewName("home");
		modelAndView.addObject("login", new Login());
		return modelAndView ;
	}

*/
}
