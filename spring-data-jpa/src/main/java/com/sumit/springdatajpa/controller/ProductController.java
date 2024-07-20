package com.sumit.springdatajpa.controller;

import com.sumit.springdatajpa.entity.Product;
import com.sumit.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/save")
    public ResponseEntity<Product> saveData(@RequestBody Product product){
        Product saveProduct=productRepository.save(product);
        return ResponseEntity.ok(saveProduct);
    }
}
