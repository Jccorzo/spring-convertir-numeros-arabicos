package com.springboot;


import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDataBase {

	  @Bean
	  CommandLineRunner initDatabase(NumberRepository repository) {
	    return args -> {};
	  }
}
