package com.vrnda.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.DnmxShirt;
import com.vrnda.beans.JeansTrouser;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		JeansTrouser trouser=ctx.getBean("jeans",JeansTrouser.class);
		System.out.println(trouser.wear());
		Date date =ctx.getBean("java.util.Date",Date.class);
		System.out.println(date);
		DnmxShirt dnmx=ctx.getBean("dnmxShirt",DnmxShirt.class);
		System.out.println(dnmx.shirt());

	}

}
