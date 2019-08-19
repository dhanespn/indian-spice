package com.example.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	@Query("Select p from Product p where p.productId=?1")
	public Product findByProductId(@Param("productId") long productId);

}
