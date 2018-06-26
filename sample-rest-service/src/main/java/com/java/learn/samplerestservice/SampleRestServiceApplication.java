package com.java.learn.samplerestservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@SpringBootApplication
public class SampleRestServiceApplication {

	@Value("${message:Hello default}")
	private String message;
	
	@GetMapping(path="/sample")
	public String sayHello() {
		return "Hello World! "+message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleRestServiceApplication.class, args);
	}
}
