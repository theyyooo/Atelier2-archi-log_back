package com.asi.exo01.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asi.exo01.model.Card;
import com.asi.exo01.repository.CardRepository;

@Service
public class CardService {

	@Autowired
	private final CardRepository cRepository;
	
	public CardService(CardRepository cRepository) {
		super();
		this.cRepository = cRepository;
	}
	
	public void instanceBdd() {
		Card card1 = new Card("card1", "description", "family", "affinity", 100, 100, 50);
		Card card2 = new Card("card2", "description", "family", "affinity", 100, 100, 50);
		Card card3 = new Card("card3", "description", "family", "affinity", 100, 100, 50);
		Card card4 = new Card("card4", "description", "family", "affinity", 100, 100, 50);
		Card card5 = new Card("card5", "description", "family", "affinity", 100, 100, 50);
		Card card6 = new Card("card6", "description", "family", "affinity", 100, 100, 50);
		Card card7 = new Card("card7", "description", "family", "affinity", 100, 100, 50);
		Card card8 = new Card("card8", "description", "family", "affinity", 100, 100, 50);
		Card card9 = new Card("card9", "description", "family", "affinity", 100, 100, 50);
		Card card10 = new Card("card10", "description", "family", "affinity", 100, 100, 50);
		Card card11 = new Card("card11", "description", "family", "affinity", 100, 100, 50);
		Card card12 = new Card("card12", "description", "family", "affinity", 100, 100, 50);
		Card card13 = new Card("card13", "description", "family", "affinity", 100, 100, 50);
		Card card14 = new Card("card14", "description", "family", "affinity", 100, 100, 50);
		Card card15 = new Card("card15", "description", "family", "affinity", 100, 100, 50);
		Card card16 = new Card("card16", "description", "family", "affinity", 100, 100, 50);
		Card card17 = new Card("card17", "description", "family", "affinity", 100, 100, 50);
		Card card18 = new Card("card18", "description", "family", "affinity", 100, 100, 50);
		Card card19 = new Card("card19", "description", "family", "affinity", 100, 100, 50);
		Card card20 = new Card("card20", "description", "family", "affinity", 100, 100, 50);
		
		cRepository.save(card1);
		cRepository.save(card2);
		cRepository.save(card3);
		cRepository.save(card4);
		cRepository.save(card5);
		cRepository.save(card6);
		cRepository.save(card7);
		cRepository.save(card8);
		cRepository.save(card9);
		cRepository.save(card10);
		cRepository.save(card11);
		cRepository.save(card12);
		cRepository.save(card13);
		cRepository.save(card14);
		cRepository.save(card15);
		cRepository.save(card16);
		cRepository.save(card17);
		cRepository.save(card18);
		cRepository.save(card19);
		cRepository.save(card20);
	}

	public List<Card> getCardToBuy() {
		return cRepository.findAll();
	}

}
