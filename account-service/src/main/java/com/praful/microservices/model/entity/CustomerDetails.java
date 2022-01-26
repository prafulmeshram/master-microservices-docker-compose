/**
 * 
 */
package com.praful.microservices.model.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 26-01-2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {
	private AccountEntity accounts;
	private List<LoanEntity> loans;
	private List<CardEntity> cards;
}
