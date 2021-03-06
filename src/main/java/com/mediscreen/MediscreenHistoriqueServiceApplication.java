package com.mediscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MediscreenHistoriqueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediscreenHistoriqueServiceApplication.class, args);
	}

}
