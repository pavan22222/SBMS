package com.vrnda.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.Myntra.Myntra;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		Myntra myntra=ctx.getBean("myntra", Myntra.class);
		System.out.println(myntra.getClass()+" "+myntra.getClass().getSuperclass());
		System.out.println(myntra.calTotalAmount(new String[] {"Trouser","T-Shirt","Shirt"}, new Double[] {1000d,500d,800d}));
	}
}
