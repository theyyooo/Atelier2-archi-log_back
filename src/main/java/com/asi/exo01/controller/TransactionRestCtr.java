package com.asi.exo01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;

import com.asi.exo01.model.Card;
import com.asi.exo01.model.User;
import com.asi.exo01.request.buyRequest;
import com.asi.exo01.service.TransactionService;

@RestController
public class TransactionRestCtr {

private final TransactionService tService;
	
	public TransactionRestCtr(TransactionService tService) {
		this.tService=tService;
	}
	
//	@PostMapping("/buy")
//	public Card buy(@RequestBody buyRequest request) {
//		User userObject = tService.getUser(request.getUserId());
//		Card cardObject = tService.getCard(request.getCardId());
//		if (cardObject.getPrice() <= userObject.getSolde()) {
//			return tService.buyCard(userObject, cardObject);
//		}
//		else {
//			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
//		}
//	}
	
	@PostMapping("/sell")
	public Card sell(@RequestBody Integer user, Integer card) {
		Card cardObject = tService.getCard(card);
		User userObject = tService.getUser(user);
		return tService.sellCard(userObject, cardObject);
	}
}
