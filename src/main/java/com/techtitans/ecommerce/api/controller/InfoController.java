package com.techtitans.ecommerce.api.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
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
	

}
