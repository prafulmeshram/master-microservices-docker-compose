/**
 * 
 */
package com.praful.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.praful.microservices.model.entity.CustomerEntity;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-02-2022
 *
 */
@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
