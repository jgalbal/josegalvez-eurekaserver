package com.josegalvez.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JosegalvezEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosegalvezEurekaserverApplication.class, args);
	}

}
