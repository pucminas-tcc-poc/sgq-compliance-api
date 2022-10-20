package com.pucminas.sgq.compliance.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SgqComplianceApi {

	public static void main(String[] args) {
		SpringApplication.run(SgqComplianceApi.class, args);
	}

}
