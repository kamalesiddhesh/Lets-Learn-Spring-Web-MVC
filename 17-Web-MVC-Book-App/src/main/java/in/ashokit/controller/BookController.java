package in.ashokit.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;
import lombok.Data;

@Controller
public class BookController {
	
	private BookRepository repo;
	
	@Autowired
	public void BookRepository( BookRepository repo ){
	      this.repo = repo;
	   }
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.println("Book ID : "+id);
		
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		
		if (findById.isPresent()) {
			Book bookObj = findById.get();
			System.out.println(bookObj);
			// setting data to view
			mav.addObject("book",bookObj);
			
		}
		//setting view page name
		mav.setViewName("index");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		return mav;
		
	}
	
}
