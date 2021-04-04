package com.pgsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PgsbApplication {
	public static void main(String[] args) {
		SpringApplication.run(PgsbApplication.class, args);
	}
}
