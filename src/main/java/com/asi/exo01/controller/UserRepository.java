package com.asi.exo01.controller;

import org.springframework.data.repository.CrudRepository;
import com.asi.exo01.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User save(User u);
}