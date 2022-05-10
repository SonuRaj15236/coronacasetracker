package com.jwt;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronacasetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronacasetrackerApplication.class, args);
	}

}
