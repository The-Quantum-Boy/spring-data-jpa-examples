package com.springdatajpa;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdatajpa.entity.Product;
import com.springdatajpa.repository.ProductRepository;




@SpringBootApplication
public class SpringDataJpa1Application  implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//saveMethod();
		//updataMethod();
		//findByIdMethod() ;
		//saveAllMethod();
		//findAllMethod();
		//deleteByIdMethod();
		//deleteMethod();
		//deleteAllMethod();
		countMethod();
	
	}
	
	public void saveMethod() {
		
		Product prod=new Product();
        prod.setName("product 3");
        prod.setDescription("this is product 3 for fun");
        prod.setSku("103ABC");
        prod.setPrice(new BigDecimal(300));
        prod.setActive(true);
        prod.setImageUrl("producgt3.png");
        
       
        Product savedObj=productRepository.save(prod);
        
        System.out.println("saved product"+savedObj);
		
	}
	
	public void updataMethod() {
		
		Long id=1L;
		Product product=productRepository.findById(id).get();
		product.setName("Updated product 1");
		product.setDescription("baba re baba");
		
		productRepository.save(product);
	}
	
	public void findByIdMethod() {
		
		Long id=1L;
		Product product=productRepository.findById(id).get();
	}
	
	public void saveAllMethod() {
		Product prod1=new Product();
        prod1.setName("product 1");
        prod1.setDescription("this is product 1 for fun");
        prod1.setSku("104ABC");
        prod1.setPrice(new BigDecimal(400));
        prod1.setActive(true);
        prod1.setImageUrl("producgt4.png");
        
		Product prod2=new Product();
        prod2.setName("product 2");
        prod2.setDescription("this is product 2 for fun");
        prod2.setSku("105ABC");
        prod2.setPrice(new BigDecimal(500));
        prod2.setActive(true);
        prod2.setImageUrl("producgt5.png");
        
        productRepository.saveAll(List.of(prod1,prod2));
	}
	
	public void findAllMethod() {
		
		Long id=1L;
		List<Product> products=productRepository.findAll();
		products.forEach((p->{
			System.out.println(p.getName());
		}));
	}
	
	public void deleteByIdMethod() {
		Long id=1L;
		productRepository.deleteById(id);

	}
	
	//delete by entity
	public void deleteMethod() {
		Long id =2L;
		
		Product product =productRepository.findById(id).get();
		
		productRepository.delete(product);
	}
	
	public void deleteAllMethod() {
		//productRepository.deleteAll();
		
		Product product=productRepository.findById(6L).get();
		
		Product product1=productRepository.findById(7L).get();
		
		productRepository.deleteAll(List.of(product,product1));
		
	}
	
	public void countMethod() {
		long count =productRepository.count();
		
		System.out.println("Count :"+count);
	}

}
