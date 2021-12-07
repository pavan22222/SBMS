package com.vrnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vrnda.beans.Employee;

@SpringBootApplication
public class SpringBootProj3WorkingWithValueAnnoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj3WorkingWithValueAnnoApplication.class, args);
		Employee emp=ctx.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
