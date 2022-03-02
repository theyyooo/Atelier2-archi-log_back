package com.asi.exo01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.asi.exo01.model.Card;
import com.asi.exo01.service.CardService;

@RestController
public class CardRestCtr {

private final CardService cService;
	
	public CardRestCtr(CardService cService) {
		this.cService=cService;
	}
	//Instance bdd avec 20 cards
	@GetMapping("/instanceBdd")
	public void getInstance() {
		cService.instanceBdd();
	}
	
	@GetMapping("/getCardsToSell")
	public String getCardsToSell(@RequestBody Integer id) {
		return "";
	}
	
	@GetMapping("/getCardsToBuy")
	public List<Card> getCardsToBuy() {
		return cService.getCardToBuy();
	}
}
