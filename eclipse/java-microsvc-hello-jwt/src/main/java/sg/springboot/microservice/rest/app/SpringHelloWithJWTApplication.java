package sg.springboot.microservice.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.sg.springboot.microservice.rest.jwt",
		"com.sg.springboot.microservice.rest.authentication.security.config",
		"sg.springboot.microservice.rest.ctrl"})
public class SpringHelloWithJWTApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWithJWTApplication.class, args);
	}
}
