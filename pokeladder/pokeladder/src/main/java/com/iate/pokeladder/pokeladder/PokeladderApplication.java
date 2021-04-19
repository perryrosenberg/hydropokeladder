package com.iate.pokeladder.pokeladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PokeladderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeladderApplication.class, args);
	}

}
