package com.vrnda.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class CommandLineRunnerImpl implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerImpl.run()");
	}

}
