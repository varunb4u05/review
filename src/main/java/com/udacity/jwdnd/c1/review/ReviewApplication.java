package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	@Primary
	public String getMessage(){
		return "Hello, Spring";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService){
		System.out.println(messageService.uppercase());
		return messageService.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService){
		System.out.println(messageService.lowercase());
		return messageService.lowercase();
	}
}
