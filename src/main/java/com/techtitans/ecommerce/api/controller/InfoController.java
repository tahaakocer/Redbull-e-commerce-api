package com.techtitans.ecommerce.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InfoController {
	
	@GetMapping
	public String info() {
		return "Server is running";
	}

}
