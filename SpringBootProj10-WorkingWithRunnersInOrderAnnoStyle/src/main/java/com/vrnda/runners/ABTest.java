package com.vrnda.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-20)
public class ABTest implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ABTest.run()");
		
	}
	

}
