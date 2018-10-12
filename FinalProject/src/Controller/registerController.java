package Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registerController {

	@RequestMapping(value="/register" , method = RequestMethod.GET)
	public ModelAndView LoadRegisterPage(Model md , HttpSession session) {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
}
