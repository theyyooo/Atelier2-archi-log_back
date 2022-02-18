package com.asi.exo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asi.exo01.model.User;

@Service
public class AuthService {

	@Autowired
	private final UserRepository uRepository;

	public AuthService(UserRepository uRepository) {
		this.uRepository = uRepository;
	}
	
	public User register(User u) {
		return uRepository.save(u);
	}
	
	public String login(User u) {
		return "ok";
	}
}
