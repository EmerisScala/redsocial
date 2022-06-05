package com.redsocial.arquitecturadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ArquitecturaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaDiscoveryServerApplication.class, args);
	}

}
