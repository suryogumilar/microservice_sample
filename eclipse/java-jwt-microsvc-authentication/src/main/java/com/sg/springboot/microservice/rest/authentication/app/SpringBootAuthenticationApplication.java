package com.sg.springboot.microservice.rest.authentication.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.sg.springboot.microservice.rest.authentication.ctrl",
		"com.sg.springboot.microservice.rest.authentication.authservice.config",
		"com.sg.springboot.microservice.rest.jwt"})
public class SpringBootAuthenticationApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuthenticationApplication.class, args);
	}
}
