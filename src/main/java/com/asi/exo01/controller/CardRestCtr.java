package com.asi.exo01.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.asi.exo01.model.Card;
import com.asi.exo01.repository.UserRepository;
import com.asi.exo01.service.CardService;
import com.asi.exo01.service.UserService;

@RestController
public class CardRestCtr {

private final CardService cService;
private final UserService uService;
	
	public CardRestCtr(CardService cService, UserService uService) {
		this.cService=cService;
		this.uService=uService;
	}
	
	//Instance bdd avec 20 cards et 2 users
	@GetMapping("/instance")
	public String getInstance() {
		if (cService.getCards().size() != 0 && uService.getUsers().size() != 0) {
			return "base déja instanciée";
		}
		cService.instanceBdd();
		return "base instanciée avec succès !";
	}
	
	@GetMapping("/cards/{id}/sell")
	public List<Card> getCardsToSell(@PathVariable Integer id) {
		return cService.getCardsToSell(id);
	}
	
	@GetMapping("/cards/buy")
	public List<Card> getCardsToBuy() {
		return cService.getCardsToBuy();
	}
}
