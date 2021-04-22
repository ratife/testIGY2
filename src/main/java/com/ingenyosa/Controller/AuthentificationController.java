import org.springframework.stereotype.Controller;
import org.springframework.web.annotation.RequestMapping;
import org.springframework.web.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ingenyosa.model.User;
@Controller
public Authentication=Controller {

	@RequestMapping(value = { "/login"} , method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	@RequestMapping (value ="/home" , method = RequestMethod.GET)
	public ModelAndView home(){
	ModelAndView modelAndView = new ModelAndView;
	modelAndView.setViewName("home"):

	}


}