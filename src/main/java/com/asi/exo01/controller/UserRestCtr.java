package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestCtr {

	private final UserService uService;
	
	public UserRestCtr(UserService uService) {
		this.uService=uService;
	}
}
