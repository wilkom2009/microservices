package com.wilkom.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		return new LimitsConfiguration(config.getMaximum(), config.getMinimum());
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallBackRetrieveConfiguration") // call fallBackRetrieveConfiguration method in case calling this url throw exception
	public LimitsConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}
	
	
	public LimitsConfiguration fallBackRetrieveConfiguration() {
		return new LimitsConfiguration(999999, 9);
	}
}
