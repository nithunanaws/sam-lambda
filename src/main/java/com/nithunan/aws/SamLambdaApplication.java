package com.nithunan.aws;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class SamLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamLambdaApplication.class, args);
	}
	
	@Bean
	public Function<String, Void> process() {
		return (input) -> {
			log.info("Triggered lambda at " + LocalDateTime.now());
			log.info("Received Message: " + input);			
			return null;
		};
	}

}
