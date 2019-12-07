package com.cognizant.smartshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.smartshop.model.Product;
import com.cognizant.smartshop.repository.ISearchRepository;

@Service
public class SearchService {
	
	@Autowired
	private ISearchRepository searchRepository;

	public List<Product> getAllSearch(String userId) {
		return searchRepository.findAllSearch(userId);
	}

	public void addSearch(String userId, String productName) {
		searchRepository.addSearch(userId,productName);
		System.out.println("In service");
	}

	public List<String> findAllProductNames() {
		return searchRepository.findAllProductNames();
	}

	public List<String> findAllProductNamesByCategory(String productType) {
		return searchRepository.findAllProductNamesByCategory(productType);
	}

}
