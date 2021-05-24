package com.shubhajit.springbootjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chucknorris-config.xml")
public class SpringbootJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJokesAppApplication.class, args);
	}

}
