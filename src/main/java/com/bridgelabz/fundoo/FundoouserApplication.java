package com.bridgelabz.fundoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class FundoouserApplication { 

	public static void main(String[] args) {
		SpringApplication.run(FundoouserApplication.class, args);
	}

}
