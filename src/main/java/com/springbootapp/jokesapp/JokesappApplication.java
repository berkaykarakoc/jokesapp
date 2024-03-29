package com.springbootapp.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-config.xml")
public class JokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesappApplication.class, args);
	}

}
