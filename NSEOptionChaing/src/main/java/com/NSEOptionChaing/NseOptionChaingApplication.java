package com.NSEOptionChaing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NseOptionChaingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NseOptionChaingApplication.class, args);
	}

	@GetMapping("/home")
	public String Addition(){
		return "Hello ";
	}
}
