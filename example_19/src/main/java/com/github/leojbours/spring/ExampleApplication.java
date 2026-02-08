package com.github.leojbours.spring;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

}
