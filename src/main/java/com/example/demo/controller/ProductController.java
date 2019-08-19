package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping(value = "/productregister", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Product> register(@ModelAttribute("multiPartsRequestPayload") Product product) {
		Product savedProduct = productService.insertProduct(product);
		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/catagoryregister", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String register(@ModelAttribute("multiPartsRequestPayload") Category category) {
		Category savedCategroy = productService.insertProductCatagory(category);
		return "productcatagory";
	}
	
	@GetMapping(value = "/catagory", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Category> register() {
		return productService.getAllCatagory();
	}
	
	@GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Product> getProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping(value = "/product/{id}")
	public ModelAndView getProduct(@PathVariable("id") long id, ModelMap model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(productService.getProductDetails(id));
		modelAndView.setViewName("product");
		//model.addAttribute("productDetails", productService.getProductDetails(id));
		//return "product";
		return modelAndView;  
	}
}
