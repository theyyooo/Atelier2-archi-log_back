package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.asi.exo01.model.User;

@RestController
public class AuthRestCtr {

	private final AuthService authService;
	
	public AuthRestCtr(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody User u) {
		
		if (u.getNom() != null && u.getPwd() != null && u.getSurName() != null) {
			return "félicitations " + authService.register(u).getNom() + ", votre compte a été crée.";
		}
		return "Merci de compléter le formulaire entièrement.";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User u) {
		if (u.getSurName() != null && u.getPwd() != null) {
			return authService.login(u);
		}
		return "Merci de compléter le formulaire entièrement.";
	}
}
