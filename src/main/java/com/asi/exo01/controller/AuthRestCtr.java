package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.asi.exo01.model.User;
import com.asi.exo01.service.AuthService;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@RestController
public class AuthRestCtr {

	private final AuthService authService;
	
	public AuthRestCtr(AuthService authService) {
		this.authService = authService;
	}
	
	@RequestMapping(value="/register", method={RequestMethod.OPTIONS,RequestMethod.POST})
	public String register(@RequestBody User u) {
		
		if (u.getName() != null && u.getPwd() != null && u.getSurname() != null) {
			return authService.register(u);
		}
		return "Merci de compléter le formulaire entièrement.";
	}
	
	@PostMapping("/login")
	public Integer login(@RequestBody User u) {
		if (u.getSurname() != null && u.getPwd() != null) {
			return authService.login(u);
		}
		return -1;
	}
}
