/**
 * 
 */
package com.praful.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.praful.microservices.model.entity.AccountEntity;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@Repository
@Transactional
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
	
	AccountEntity findByCustomerId(int customerId);
}
