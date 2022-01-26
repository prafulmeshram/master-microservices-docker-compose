/**
 * 
 */
package com.praful.microservices.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praful.microservices.model.entity.CustomerEntity;
import com.praful.microservices.model.entity.LoanEntity;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 26-01-2022
 *
 */
@FeignClient("loan-service")
public interface LoanFeignClient {
	@RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
	List<LoanEntity> getLoansDetails(@RequestBody CustomerEntity customer);
}
