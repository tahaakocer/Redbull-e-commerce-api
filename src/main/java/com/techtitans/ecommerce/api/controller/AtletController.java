package com.techtitans.ecommerce.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtitans.ecommerce.business.abstracts.AtletService;
import com.techtitans.ecommerce.business.responses.AtletGetAllResponse;

@RestController
@RequestMapping("/api/atlet")
public class AtletController {
	
	@Autowired
	private AtletService atletService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<AtletGetAllResponse>> getAll(){
		
		return ResponseEntity.ok(this.atletService.getAll());
	}

}
