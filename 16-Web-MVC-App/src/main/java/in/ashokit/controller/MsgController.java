package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav  = new ModelAndView();
		Double i = 100.12;
		mav.addObject("msg1","Hi, Welcome to AshokIT......");
		mav.addObject("msg2",i);
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Good Evening..!!");
		
		mav.setViewName("message");
		
		return mav;
	}
}
