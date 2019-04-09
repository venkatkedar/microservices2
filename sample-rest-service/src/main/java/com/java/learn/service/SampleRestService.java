package com.java.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleRestService {
	
	@Autowired
	RestTemplate restTemplate;

	@Value("${message:Hello default}")
	private String message;
	
	@GetMapping(path="/sample")
	public String sayHello() {
		return "Hello World! "+message;
	}
	
	
}
