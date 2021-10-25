package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		Employee emp=ac.getBean("emp", Employee.class);
		System.out.println(emp);
		System.out.println(ac.getEnvironment().getProperty("Path"));

	}

}
