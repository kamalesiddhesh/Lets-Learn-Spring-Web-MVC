package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Product;
import in.ashokit.repository.ProductRepository;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadIndexPage(Model m) {
		
		Product pObj = new Product();
		m.addAttribute("product",pObj);
		return "index";
	}
	
	@PostMapping("/product")
	public String handleSave(Product p,Model m) {
		
		boolean isSaved = service.saveProduct(p);
		if(isSaved == true) {
			m.addAttribute("msg","Product Added.....");
		}
		return "index";
	}
	@GetMapping("/products")
	public String loadProducts(Model m) {
		m.addAttribute("products",repo.findAll());
		return "data";
	}
	

}
