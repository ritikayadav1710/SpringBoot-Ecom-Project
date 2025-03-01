package com.ritika.ecom_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ritika.ecom_proj")
@EntityScan(basePackages = "com.ritika.ecom_proj.model")
@EnableJpaRepositories(basePackages = "com.ritika.ecom_proj.repo")

public class EcomProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomProjApplication.class, args);
	}

}
