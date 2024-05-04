package in.ashokit.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller

public class StudentController {
	
	@Autowired
	private StudentService service;
	
//	@InitBinder
	public void init(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("timings",service.getTimings());
	}
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
//		sobj.setName("User"); // Pre-populate the data 
//		sobj.setEmail("Email");
		init(model);
		
		return "index";
	}
	
	
	
	@PostMapping("/save")
	public String handleSubmitButton(Student s,Model model) {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
		boolean isSaved = service.saveStudent(s);
		
		if(isSaved==true) {
		
			model.addAttribute("msg","Data Saved...........");
		}
		init(model);
		return "index";
	}

}
