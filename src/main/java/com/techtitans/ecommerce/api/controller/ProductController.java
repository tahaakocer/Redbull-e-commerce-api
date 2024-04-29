package com.techtitans.ecommerce.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtitans.ecommerce.business.abstracts.ProductService;
import com.techtitans.ecommerce.business.request.AddProductRequest;
import com.techtitans.ecommerce.business.responses.ProductGetAllResponse;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getAll")
	public ResponseEntity<List<ProductGetAllResponse>> getAll(){
		return ResponseEntity.ok(this.productService.getAll());
	}

	@PostMapping("/add")
	public ResponseEntity<String> add(AddProductRequest addProductRequest) {
		this.productService.add(addProductRequest);
		return ResponseEntity.ok("Ürün eklendi");
	}
	
	@GetMapping("/getFirstFour")
	public ResponseEntity<List<ProductGetAllResponse>> getFirstFour(){
		return ResponseEntity.ok(this.productService.findFirstFourProducts());
	}
	

}
