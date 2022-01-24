/**
 * 
 */
package com.praful.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praful.microservices.model.entity.AccountEntity;
import com.praful.microservices.model.entity.CustomerEntity;
import com.praful.microservices.repository.AccountRepository;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@PostMapping("/myAccount")
	public AccountEntity getAccountDetails(@RequestBody CustomerEntity customer) {

		AccountEntity accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}

}
