package com.vrnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vrnda.beans.Computer;

@SpringBootApplication
public class SpringBootProj3WorkingWithValueAnnoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj3WorkingWithValueAnnoApplication.class, args);
		Computer comp=ctx.getBean("computer", Computer.class);
		System.out.println(comp);
	}

}
