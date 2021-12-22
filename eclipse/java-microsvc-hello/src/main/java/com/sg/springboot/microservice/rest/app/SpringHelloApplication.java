package com.sg.springboot.microservice.rest.app;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication(scanBasePackages = {"com.sg.springboot.microservice.rest"})
public class SpringHelloApplication implements CommandLineRunner{
	private static Logger logger = LogManager.getLogger(SpringHelloApplication.class);
	
	public static void main(String[] args) {
		logger.info("run main");
		SpringApplication.run(SpringHelloApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("ruun");
	}
}
