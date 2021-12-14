package com.vrnda.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerImpl.run()");
		System.out.println(Arrays.toString(args));
	}

}
