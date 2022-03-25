package once.curso.practicarest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeRestController {

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "carlos";
	}
}
