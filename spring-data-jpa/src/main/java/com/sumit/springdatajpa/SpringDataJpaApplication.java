package com.sumit.springdatajpa;

import com.sumit.springdatajpa.entity.Product;
import com.sumit.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;

@SpringBootApplication
public class SpringDataJpaApplication implements ApplicationRunner {

	@Autowired
	private ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		saveData();
		System.out.println("this is my  project repo");
	}

	public void saveData() {
		Product product = new Product();
		product.setName("product 1");
		product.setDescription("product 1 description");
		product.setSku("100ABC");
		product.setPrice(new BigDecimal(100));
		product.setActive(true);
		product.setImageUrl("product1.png");

		Product savedObj = productRepository.save(product);
		System.out.println(savedObj);
		System.out.println(savedObj.toString());
	}
}
