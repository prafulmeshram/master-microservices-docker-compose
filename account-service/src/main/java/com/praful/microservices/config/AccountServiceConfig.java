/**
 * 
 */
package com.praful.microservices.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 26-01-2022
 *
 */
@Configuration
@ConfigurationProperties(prefix = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountServiceConfig {

	 private String msg;
	 private String buildVersion;
	 private Map<String, String> mailDetails;
	 private List<String> activeBranches;

}