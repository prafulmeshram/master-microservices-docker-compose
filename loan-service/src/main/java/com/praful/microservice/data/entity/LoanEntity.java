/**
 * 
 */
package com.praful.microservice.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "tab_loan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_number")
	private int loanNumber;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "loan_type")
	private String loanType;

	@Column(name = "total_loan")
	private int totalLoan;

	@Column(name = "amount_paid")
	private int amountPaid;

	@Column(name = "outstanding_amount")
	private int outstandingAmount;

	@Column(name = "create_date")
	private String createDate;
}
