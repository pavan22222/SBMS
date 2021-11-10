package com.vrnda.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vrnda")
public class AppConfig {
	
	@Bean(name="ldt")
	public LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
}
