package once.curso.sprimgmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value="algo",method = RequestMethod.GET)
	public String algo( Model model,@RequestParam String texto,@RequestParam String texto2) {
		
		model.addAttribute("algo", "has escrito " + texto2.toUpperCase() + "y tiene " + texto.length() + " letras");
		return "algo";
	}
	@RequestMapping("algo/{texto}/{texto2}")
	public String algo1( Model model,@PathVariable String texto,@PathVariable String texto2) {
		

		model.addAttribute("algo", "tu nombre y apellido es "+ texto+ " " + texto2);
		return "algo";
	}

	
}
