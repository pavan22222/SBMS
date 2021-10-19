package com.vrnda.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vrnda.beans.Company;

public class ScopesTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		Company c1=factory.getBean("com1", Company.class);
		Company c2=factory.getBean("com1", Company.class);
		System.out.println(c1.hashCode()+"-----------"+c2.hashCode());
	}
}
