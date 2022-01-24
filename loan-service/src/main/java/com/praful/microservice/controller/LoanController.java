/**
 * 
 */
package com.praful.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praful.microservice.data.entity.CustomerEntity;
import com.praful.microservice.data.entity.LoanEntity;
import com.praful.microservice.repository.LoanRepository;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@RestController
public class LoanController {

	@Autowired
	private LoanRepository loanRepository;

	@PostMapping("/myLoans")
	public List<LoanEntity> getLoanDetails(@RequestBody CustomerEntity customer) {
		List<LoanEntity> loans = loanRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
		if (loans != null) {
			return loans;
		} else {
			return null;
		}

	}

}
