package com.vrnda.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.singleton.LanNetwork;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		LanNetwork l1 = ac.getBean("l1", LanNetwork.class);
		System.out.println(l1.hashCode());

	}

}
