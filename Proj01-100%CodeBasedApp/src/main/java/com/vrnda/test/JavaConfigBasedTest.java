package com.vrnda.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vrnda.beans.WishMessageGenerator;
import com.vrnda.cfg.AppConfig;

public class JavaConfigBasedTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg=ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println(wmg.generateWishMessage("Pavan"));
	}
}
