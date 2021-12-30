package com.vrnda.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vrnda.beans.Remote;
import com.vrnda.beans.TV;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		/* TV tv = factory.getBean("tv", TV.class); System.out.println(tv); */
		Remote remote = factory.getBean("remote", Remote.class);
		System.out.println(remote);
	}

}
