package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vrnda.beans.Network;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ac=new FileSystemXmlApplicationContext("src/main/java/com/vrnda/cfgs/applicationContext.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Network net=ac.getBean("nw", Network.class);
		System.out.println(net);

	}

}
