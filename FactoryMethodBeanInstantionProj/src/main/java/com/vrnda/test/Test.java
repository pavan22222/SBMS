package com.vrnda.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		String s1=factory.getBean("s1", String.class);
		System.out.println(s1);
		System.out.println("-------------------------------------------------");
		String s2=factory.getBean("s2", String.class);
		System.out.println(s2);
		System.out.println("-------------------------------------------------");
		Integer i1=factory.getBean("i1", Integer.class);
		System.out.println(i1);
		System.out.println("-------------------------------------------------");
		Calendar cal=factory.getBean("cal", Calendar.class);
		System.out.println(cal);
		System.out.println("-------------------------------------------------");
		Properties prop=factory.getBean("prop", Properties.class);
		System.out.println(prop);
		System.out.println("-------------------------------------------------");
		

	}

}
