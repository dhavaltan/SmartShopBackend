package com.cognizant.smartshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshop.model.Product;
import com.cognizant.smartshop.service.SearchService;

@RestController
@RequestMapping(value="/search")
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	@GetMapping("/{userId}")
	public List<Product> getAllSearch(@PathVariable String userId) {
		return searchService.getAllSearch(userId);
	}
	
	@PostMapping("/{userId}/{productName}")
	public void addSearch(@PathVariable String userId,@PathVariable String productName) {
		searchService.addSearch(userId,productName);
	}
	
	@GetMapping()
	public List<String> findAllProductNames() {
		return searchService.findAllProductNames();
	}
	
	@GetMapping("/productType/{productType}")
	public List<String> findAllProductNamesByCategory(@PathVariable String productType) {
		return searchService.findAllProductNamesByCategory(productType);
	} 
}
