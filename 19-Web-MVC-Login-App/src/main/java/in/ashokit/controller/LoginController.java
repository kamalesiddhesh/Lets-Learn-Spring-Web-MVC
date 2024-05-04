package in.ashokit.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import in.ashokit.service.LoginService;



@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String viewLoginPage(Model map) {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(Model model, @RequestParam String name, @RequestParam String password){
 
        boolean isValidUser = service.validateUser(name, password);
 
        if (!isValidUser) {
        	model.addAttribute("errorMessage", "Access Denied , Invalid Credentials");
//            model.put("errorMessage", "Access Denied , Invalid Credentials");
            return "login";
        }
 
//        model.put("name", name);
//        model.put("password", password);
        Map<String,String> m = new HashMap<>();
        m.put("name",name);
        model.addAttribute("name", name);
        model.mergeAttributes(m);
 
        return "welcome";
    }
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
    public RedirectView showLogoutPage(ModelMap model){
		
		RedirectView redirectView = new RedirectView(); // RedirectView Class
		redirectView.setUrl("login");
		return redirectView;
//        return "redirect:/login"; // Redirect Prefix
    }

}
