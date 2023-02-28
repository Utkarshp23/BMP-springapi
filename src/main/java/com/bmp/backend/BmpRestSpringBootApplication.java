package com.bmp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bmp.backend.*")
public class BmpRestSpringBootApplication
{
	public static void main(String[] args) {
		SpringApplication.run(BmpRestSpringBootApplication.class, args);
	}

}
