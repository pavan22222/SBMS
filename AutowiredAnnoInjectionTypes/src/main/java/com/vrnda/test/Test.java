package com.vrnda.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		Employee emp=ctx.getBean("emp", Employee.class);
		System.out.println(emp.getDate());

	}

}
