package Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StuffController {
	
	@RequestMapping(value = "/stuff" , method = RequestMethod.GET)
	public ModelAndView LoadStuffPage(Model md , HttpSession session) {
		ModelAndView mav = new ModelAndView("stuff");
		return mav;
	}
}
