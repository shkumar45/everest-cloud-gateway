package com.everest.everestcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EverestCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverestCloudGatewayApplication.class, args);
	}

}
