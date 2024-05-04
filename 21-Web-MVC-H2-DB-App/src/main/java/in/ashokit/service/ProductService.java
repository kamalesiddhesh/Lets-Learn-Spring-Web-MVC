package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Product;
import in.ashokit.entity.ProductEntity;
import in.ashokit.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public boolean saveProduct(Product p) {
		
		ProductEntity entity = new ProductEntity();
		BeanUtils.copyProperties(p,entity);
		repo.save(entity);
		return true;
	}
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		List<ProductEntity> p = repo.findAll();
		Product sample=null;
		for (ProductEntity product : p) {
			BeanUtils.copyProperties(product,sample);
			products.add(sample);
			System.out.println(products);
		}
		
		return products;
	}
	
	
}
