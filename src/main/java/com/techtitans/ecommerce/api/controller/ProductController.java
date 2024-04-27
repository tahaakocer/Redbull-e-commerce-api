package com.techtitans.ecommerce.api.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.techtitans.ecommerce.business.abstracts.ProductService;
import com.techtitans.ecommerce.business.responses.ProductGetAllResponse;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping()
	public String status() {
	    return "Server is running";
	}
	String timeAndStatus = "";

	@Scheduled(fixedDelay = 10000)
	public void backup() {
	    LocalDateTime now = LocalDateTime.now();
	    String pattern = "dd-MM-yyyy HH:mm:ss";
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
	    timeAndStatus = "Son yedekleme zamanı: " +
	            now.format(formatter) + "<br/>" + "Başarı durumu: BAŞARILI";
	}

	@GetMapping("/info")
	public String showInfo() {
	    return timeAndStatus;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ProductGetAllResponse>> getAll() {
		return ResponseEntity.ok(this.productService.getAll());
		
	}
	
}
