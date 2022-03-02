package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.RestController;

import com.asi.exo01.service.CardService;

@RestController
public class CardRestCtr {

private final CardService cService;
	
	public CardRestCtr(CardService cService) {
		this.cService=cService;
	}
}
