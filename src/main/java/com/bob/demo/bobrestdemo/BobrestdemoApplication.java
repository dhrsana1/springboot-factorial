package com.bob.demo.bobrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bob.demo.*")
public class BobrestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BobrestdemoApplication.class, args);
	}

}
