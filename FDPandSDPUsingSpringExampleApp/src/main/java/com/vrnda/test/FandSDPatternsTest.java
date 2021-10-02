package com.vrnda.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vrnda.comp.House;

public class FandSDPatternsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		House house=factory.getBean("house", House.class);
		System.out.println(house.build("Green"));
	}

}
