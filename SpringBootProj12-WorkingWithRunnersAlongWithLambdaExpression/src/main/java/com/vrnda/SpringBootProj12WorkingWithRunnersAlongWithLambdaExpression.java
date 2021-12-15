package com.vrnda;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProj12WorkingWithRunnersAlongWithLambdaExpression {
	
	@Bean
	public CommandLineRunner getCommandLineRunner() {
//		CommandLineRunner clr=(String[] args)->{
//			System.out.println("Command Line Arguments are::"+Arrays.toString(args));
//		};
//		return clr;
		System.out.println("Command Line Arguments are::");
		CommandLineRunner clr=(args)->Stream.of(args).forEach(System.out::print);	
		return clr;
	}
	
	
	@Bean
	public ApplicationRunner getApplicationRunner() {
		ApplicationRunner appr=(aargs)->{
			System.out.println("Non Optional Arguments are::"+Arrays.toString(aargs.getNonOptionArgs().toArray()));
			for(String name:aargs.getOptionNames()) {
				System.out.println("Optional Argument name is::"+name);
				System.out.println("Optional Argument value is::"+aargs.getOptionValues(name));;
			}
		};
		return appr;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj12WorkingWithRunnersAlongWithLambdaExpression.class, args);
	}
}
