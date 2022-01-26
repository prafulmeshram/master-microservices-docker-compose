/**
 * 
 */
package com.praful.microservices.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praful.microservices.model.entity.CardEntity;
import com.praful.microservices.model.entity.CustomerEntity;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 26-01-2022
 *
 */
@FeignClient("card-service")
public interface CardFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "myCards", consumes = "application/json")
	List<CardEntity> getCardDetails(@RequestBody CustomerEntity customer);
}
