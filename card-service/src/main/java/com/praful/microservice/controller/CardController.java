/**
 * 
 */
package com.praful.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praful.microservice.data.entity.CardEntity;
import com.praful.microservice.data.entity.CustomerEntity;
import com.praful.microservice.repository.CardRepository;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@RestController
public class CardController {
	@Autowired
	private CardRepository cardRepository;

	@PostMapping("/myCards")
	public List<CardEntity> getCardDetails(@RequestBody CustomerEntity customer) {
		List<CardEntity> cards = cardRepository.findByCustomerId(customer.getCustomerId());
		if (cards != null) {
			return cards;
		} else {
			return null;
		}
	}

}
