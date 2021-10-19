package com.vrnda.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vrnda.singleton.LanNetwork;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		LanNetwork l1 = factory.getBean("l1", LanNetwork.class);
		System.out.println(l1.hashCode());
		System.out.println("-------------------------------------------------");
		LanNetwork l2 = factory.getBean("l2", LanNetwork.class);
		System.out.println(l2.hashCode());
			}

}
