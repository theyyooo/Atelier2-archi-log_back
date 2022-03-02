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
	
	public String register(User u) {
		if (uRepository.findBySurName(u.getSurName()) == null){
			uRepository.save(u);
			return "félicitation " + u.getNom() + ", votre compte a été crée";
		}
		return "Vous avez déja un compte";
		
	}
	
	public Integer login(User u) {
		User user = uRepository.findBySurName(u.getSurName());
		if (user != null && user.getPwd().equals(u.getPwd())) {
			return user.getId();
		}
		return -1;
		
	}
}
