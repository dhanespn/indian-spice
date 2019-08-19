package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductCatagoryRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductCatagoryRepository catagoryRepository;
	
	public Product insertProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Category insertProductCatagory(Category category) {
		return catagoryRepository.save(category);
	}
	
	public Iterable<Category> getAllCatagory(){
		return catagoryRepository.findAll();
	}
	
	public Iterable<Product> getAllProduct(){
		return productRepository.findAll();
	}

	public Product getProductDetails(long id) {
		return  productRepository.findByProductId(id);
	}

}
