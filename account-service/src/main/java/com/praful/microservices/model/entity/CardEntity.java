/**
 * 
 */
package com.praful.microservices.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@Entity
@Table(name = "tab_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "card_type")
	private String cardType;

	@Column(name = "total_limit")
	private int totalLimit;

	@Column(name = "amount_used")
	private int amountUsed;

	@Column(name = "available_amount")
	private int availableAmount;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

}
