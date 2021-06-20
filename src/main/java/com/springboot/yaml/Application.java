package com.springboot.yaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
        private static final String REST_RUL="https://www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
                int i=10;
	}

}
