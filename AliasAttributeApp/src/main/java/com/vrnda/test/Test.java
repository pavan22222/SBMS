package com.vrnda.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.Company;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		Company company=ctx.getBean("company", Company.class);
		Company company1=ctx.getBean("com", Company.class);
		Company company2=ctx.getBean("c", Company.class);
		System.out.println(company.getEmpList()+"hashcode::"+company.hashCode());
		System.out.println(company1.getEmpList()+"hashcode::"+company1.hashCode());
		System.out.println(company2.getEmpList()+"hashcode::"+company2.hashCode());
	}
}
