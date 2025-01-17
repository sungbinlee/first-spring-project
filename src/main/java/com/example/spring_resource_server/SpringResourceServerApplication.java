package com.example.spring_resource_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class SpringResourceServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringResourceServerApplication.class, args);
	}
}

@RestController
@RequestMapping("/api")
class HelloController {
	@GetMapping("/public")
	public Map<String, String> publicEndpoint() {
		return Map.of("message", "This is a public endpoint.");
	}

	@GetMapping("/hello")
	public Map<String, String> helloEndpoint() {
		return Map.of("message", "Hello World! This is a protected endpoint. You must be authenticated.");
	}
}