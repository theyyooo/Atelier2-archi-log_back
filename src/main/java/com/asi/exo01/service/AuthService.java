package com.asi.exo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asi.exo01.exception.UserConnectionException;
import com.asi.exo01.exception.UserExistException;
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
		if (uRepository.findBySurname(u.getSurname()) == null){
			uRepository.save(u);
			return u;
		}
		throw new UserExistException();
		
	}
	
	public Integer login(User u) {
		User user = uRepository.findBySurname(u.getSurname());
		if (user != null && user.getPwd().equals(u.getPwd())) {
			return user.getId();
		}
		throw new UserConnectionException();
		
	}
}
