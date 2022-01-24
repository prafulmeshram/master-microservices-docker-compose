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
@Table(name = "tab_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_number")
	private long accountNumber;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "account_type")
	private String accountType;
	@Column(name = "branch_address")
	private String branchAddress;

	@Column(name = "create_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDt;
}
