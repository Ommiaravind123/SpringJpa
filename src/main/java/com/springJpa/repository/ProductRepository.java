package com.springJpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springJpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	
	

}
