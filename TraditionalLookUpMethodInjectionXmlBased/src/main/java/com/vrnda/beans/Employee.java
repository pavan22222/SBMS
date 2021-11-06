package com.vrnda.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Data;

@Data
public class Employee {
	private Integer id;
	private String name;
	
	public Employee() {
		System.out.println("Employee 0-Param Constructor");
	}
	
	public void work() {
		System.out.println("Employee.work()");
		Laptop latp=null;
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		latp=ctx.getBean("laptop", Laptop.class);
		System.out.println("Employee is Working with "+latp.start());
	}
	
	public void eat() {
		System.out.println("Employee.eat()");
	}
	
	public void play() {
		System.out.println("Employee.play()");
	}
}
