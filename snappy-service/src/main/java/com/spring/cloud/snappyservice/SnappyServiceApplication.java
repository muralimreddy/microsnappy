package com.spring.cloud.snappyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SnappyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnappyServiceApplication.class, args);
	}
}
