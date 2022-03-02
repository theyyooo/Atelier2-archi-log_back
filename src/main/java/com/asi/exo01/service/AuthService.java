package com.asi.exo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asi.exo01.model.User;
import com.asi.exo01.repository.UserRepository;

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
	
	public Integer login(User u) {
		return u.getId();
	}
}
