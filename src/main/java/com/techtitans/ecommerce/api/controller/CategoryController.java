package com.techtitans.ecommerce.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtitans.ecommerce.business.abstracts.CategoryService;
import com.techtitans.ecommerce.business.request.CategoryAddRequest;
import com.techtitans.ecommerce.business.responses.CategoryGetAllResponse;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CategoryGetAllResponse>> getAll() {
		return ResponseEntity.ok(this.categoryService.getAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Void> add(CategoryAddRequest categoryAddRequest) {
		this.categoryService.add(categoryAddRequest);
		return ResponseEntity.ok().build();
	}

}
