/**
 * 
 */
package com.praful.microservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.praful.microservice.data.entity.CardEntity;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 23-01-2022
 *
 */
@Repository
@Transactional
public interface CardRepository extends JpaRepository<CardEntity, Integer> {
	List<CardEntity> findByCustomerId(int customerId);
}
