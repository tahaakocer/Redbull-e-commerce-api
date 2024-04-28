package com.techtitans.ecommerce.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtitans.ecommerce.business.abstracts.BannerService;
import com.techtitans.ecommerce.business.responses.BannerGetAllResponse;

@RestController
@RequestMapping("/api/banner")
public class BannerController {
	
	@Autowired
	private BannerService bannerService;
	@GetMapping("/getAll")
	List<BannerGetAllResponse> getAll() {
		return this.bannerService.getAll();
	}

}
