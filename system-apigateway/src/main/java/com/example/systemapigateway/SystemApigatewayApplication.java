package com.example.systemapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy

public class SystemApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApigatewayApplication.class, args);
	}

}
