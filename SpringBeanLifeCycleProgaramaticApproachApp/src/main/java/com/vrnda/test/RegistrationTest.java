package com.vrnda.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.RegistrationOffice;

public class RegistrationTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		RegistrationOffice reg=ctx.getBean("regOf", RegistrationOffice.class);
		System.out.println(reg.register("Car"));
		ctx.close();
	}
}
