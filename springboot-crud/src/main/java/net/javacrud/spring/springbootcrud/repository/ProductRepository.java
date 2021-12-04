package net.javacrud.spring.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javacrud.spring.springbootcrud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

}
