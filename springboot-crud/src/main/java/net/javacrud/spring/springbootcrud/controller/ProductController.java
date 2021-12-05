package net.javacrud.spring.springbootcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

import net.javacrud.spring.springbootcrud.model.Product;
import net.javacrud.spring.springbootcrud.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	//create get all products from api
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	//create product
	@PostMapping("/products")
	public Product createProduct(@Valid @RequestBody Product product) {
		return productRepository.save(product);
	}
	//get product by id
	
	//update product
	
	//delete product
	
	
}
