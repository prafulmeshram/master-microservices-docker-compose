/**
 * 
 */
package com.praful.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.praful.microservices.config.AccountServiceConfig;
import com.praful.microservices.feignclients.CardFeignClient;
import com.praful.microservices.feignclients.LoanFeignClient;
import com.praful.microservices.model.entity.AccountEntity;
import com.praful.microservices.model.entity.CardEntity;
import com.praful.microservices.model.entity.CustomerDetails;
import com.praful.microservices.model.entity.CustomerEntity;
import com.praful.microservices.model.entity.LoanEntity;
import com.praful.microservices.model.entity.Properties;
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

	@Autowired
	private LoanFeignClient loanFeignClient;
	@Autowired
	private CardFeignClient cardFeignClient;
	
	@Autowired
	AccountServiceConfig accountsConfig;


	@PostMapping("/myAccount")
	public AccountEntity getAccountDetails(@RequestBody CustomerEntity customer) {

		AccountEntity accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}

	@GetMapping("/account/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(accountsConfig.getMsg(), accountsConfig.getBuildVersion(),
				accountsConfig.getMailDetails(), accountsConfig.getActiveBranches());
		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;
	}

	@PostMapping("/myCustomerDetails")
	public CustomerDetails myCustomerDetails(@RequestBody CustomerEntity customer) {
		AccountEntity accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		List<LoanEntity> loans = loanFeignClient.getLoansDetails(customer);
		List<CardEntity> cards = cardFeignClient.getCardDetails(customer);

		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAccounts(accounts);
		customerDetails.setLoans(loans);
		customerDetails.setCards(cards);

		return customerDetails;

	}

}
