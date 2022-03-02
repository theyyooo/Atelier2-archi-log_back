package com.asi.exo01.controller;

import org.springframework.web.bind.annotation.RestController;

import com.asi.exo01.service.TransactionService;

@RestController
public class TransactionRestCtr {

private final TransactionService tService;
	
	public TransactionRestCtr(TransactionService tService) {
		this.tService=tService;
	}
}
