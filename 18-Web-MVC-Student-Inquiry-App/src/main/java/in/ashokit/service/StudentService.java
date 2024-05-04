package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;
import in.ashokit.entity.Student;
import in.ashokit.repo.CourseRepo;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {
	
	private CourseRepo repo;
	private StudentRepo sRepo;
	
	@Autowired
	public void setCourseRepo(CourseRepo repo) {
		this.repo = repo;
	}
	
	@Autowired
	public void setStudentRepo(StudentRepo sRepo) {
		this.sRepo = sRepo;
	}
	
	
	public List<Course> getCourses() {
		List<Course> courses = repo.findAll();
		for (Course course : courses) {
			System.out.println(course);
		}
		return courses;
	}
	
	public void saveStudent(Student student) {
		sRepo.save(student);
	}
}
