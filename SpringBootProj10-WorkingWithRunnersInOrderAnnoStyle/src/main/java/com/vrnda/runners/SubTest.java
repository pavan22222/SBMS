package com.vrnda.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SubTest implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SubTest.run()");
		
	}

}
