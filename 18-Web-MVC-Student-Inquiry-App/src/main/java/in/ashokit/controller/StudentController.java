package in.ashokit.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.entity.Course;
import in.ashokit.entity.Student;
import in.ashokit.repo.CourseRepo;
import in.ashokit.service.StudentService;



@Controller
public class StudentController {
	
	
	
	@Autowired
	private StudentService studentService;
	
	
	@ModelAttribute("courses") // Add courses to model for JSP dropdown
	public List<Course> getCourses() {
		return studentService.getCourses();
	}
	
	@RequestMapping("/submitInquiry")
	public String submitInquiry(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "success"; // Redirect to a success page after submitting data
	}
	

}
