package com.techtitans.ecommerce.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtitans.ecommerce.business.abstracts.UserService;
import com.techtitans.ecommerce.business.request.UserLoginRequest;
import com.techtitans.ecommerce.business.request.UserRegisterRequest;
import com.techtitans.ecommerce.core.util.payload.LoginMessage;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(UserRegisterRequest userAddRequest) {
		String id = userService.add(userAddRequest);
		return id;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(UserLoginRequest userLoginRequest) {
		LoginMessage loginMessage = this.userService.loginUser(userLoginRequest);
		return ResponseEntity.ok(loginMessage);
	}
}
