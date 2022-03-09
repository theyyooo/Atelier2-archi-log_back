package com.asi.exo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asi.exo01.model.User;
import com.asi.exo01.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private final UserRepository uRepository;

	public UserService(UserRepository uRepository) {
		this.uRepository = uRepository;
	}
	
	public List<User> getUsers() {
		return uRepository.findAll();
	}
	
	public Optional<User> getUser(Integer id) {
		return uRepository.findById(id);
	}
}
