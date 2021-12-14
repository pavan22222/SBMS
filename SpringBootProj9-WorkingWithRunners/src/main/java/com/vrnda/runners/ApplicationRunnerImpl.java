package com.vrnda.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunnerImpl.run()");
		System.out.println("Non Optional Arguments are::"+args.getNonOptionArgs());
		System.out.print("OPtional Arguments are::");
		for(String arg:args.getOptionNames()) {
			System.out.print(arg+":"+args.getOptionValues(arg));
		}
		System.out.println();
		
	}

}
