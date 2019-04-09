package com.java.learn.samplerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@RefreshScope
@SpringBootApplication(scanBasePackages = {"com.java.learn"})
@EnableEurekaClient
public class SampleRestServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleRestServiceApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
