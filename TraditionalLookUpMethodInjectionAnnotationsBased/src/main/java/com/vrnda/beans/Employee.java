package com.vrnda.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
//@Lazy
public class Employee {
	private Integer id;
	private String name;
	
	public Employee() {
		System.out.println("Employee 0-Param Constructor");
	}
	
	public void work() {
		System.out.println("Employee.work()");
		Laptop latp=null;
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
//		latp=ctx.getBean("laptop", Laptop.class);
		latp=factory.getBean("laptop", Laptop.class);
		System.out.println("Employee is Working with "+latp.start());
	}
	
	public void eat() {
		System.out.println("Employee.eat()");
	}
	
	public void play() {
		System.out.println("Employee.play()");
	}
}
