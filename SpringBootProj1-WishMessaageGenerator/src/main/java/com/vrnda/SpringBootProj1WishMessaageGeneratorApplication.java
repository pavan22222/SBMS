package com.vrnda;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vrnda.beans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProj1WishMessaageGeneratorApplication {
	
	@Bean
	public LocalDateTime getLocalDate() {
		System.out.println("SpringBootProj1WishMessaageGeneratorApplication.getLocalDate()");
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		System.out.println("SpringBootProj1WishMessaageGeneratorApplication.main()");
		ApplicationContext ctx=SpringApplication.run(SpringBootProj1WishMessaageGeneratorApplication.class, args);
		WishMessageGenerator wmg=ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println(wmg.getWishMessage("Pavan Janapati"));
		((ConfigurableApplicationContext) ctx).close();
	}

}
