/**
 * 
 */
package com.praful.microservices.model.entity;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PRAFUL MESHRAM
 * @version 0.0.1
 * @date 26-01-2022
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Properties {

	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;
}
