package com.asi.exo01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.asi.exo01.model.User;
import com.asi.exo01.service.UserService;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@RestController
public class UserRestCtr {

	private final UserService uService;
	
	public UserRestCtr(UserService uService) {
		this.uService=uService;
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getCardsToSell(@PathVariable Integer id) {
		return uService.getUser(id);
	}
}
