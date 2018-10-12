package Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class donationController {
	
	@RequestMapping(value="/donation" , method = RequestMethod.GET)
	public ModelAndView LoadDonatePage(Model md , HttpSession session) {
		ModelAndView mav = new ModelAndView("donate");
		return mav;
	}
}
