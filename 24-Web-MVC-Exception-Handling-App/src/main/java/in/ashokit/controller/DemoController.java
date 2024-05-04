package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		String msgTxt = "Welcome to AshokIT.......!!";
		model.addAttribute("msg",msgTxt);
		return "index";
	}
	
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		
		String msgTxt = "Good Evening....!!";
		int i = 10/0;
//		String j = null;
//		j.length();
		model.addAttribute("msg",msgTxt);
		return "index";
	}
// Local Exception Handling
	
/*
	@ExceptionHandler(value=Exception.class)
	public String handleArithmaticException(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
*/

}
