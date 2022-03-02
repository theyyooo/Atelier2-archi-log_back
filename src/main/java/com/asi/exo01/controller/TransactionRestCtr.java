package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asi.exo01.model.Card;
import com.asi.exo01.service.TransactionService;

@RestController
public class TransactionRestCtr {

private final TransactionService tService;
	
	public TransactionRestCtr(TransactionService tService) {
		this.tService=tService;
	}
	
	@PostMapping("/buy")
	public String buy(@RequestBody Card c) {
		return "";
	}
	
	@PostMapping("/sell")
	public String sell(@RequestBody Card c) {
		return "";
	}
}
