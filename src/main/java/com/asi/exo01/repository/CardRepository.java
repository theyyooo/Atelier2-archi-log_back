package com.asi.exo01.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.asi.exo01.model.Card;


public interface CardRepository extends CrudRepository<Card, Integer> { 
	
	public Card save(Card c); 
	public List<Card> findAll();
	public List<Card> findByUserIdIsNull();
	public List<Card> findByUserId(Integer id);
}
