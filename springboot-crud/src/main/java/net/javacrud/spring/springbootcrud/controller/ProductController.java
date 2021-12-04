package net.javacrud.spring.springbootcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javacrud.spring.springbootcrud.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	
	
}
